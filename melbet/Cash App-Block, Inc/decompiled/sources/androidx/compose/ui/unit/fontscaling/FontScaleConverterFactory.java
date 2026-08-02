package androidx.compose.ui.unit.fontscaling;

import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.presenters.AccentColorsKt;

/* loaded from: classes.dex */
public abstract class FontScaleConverterFactory {
    public static final Object[] LookupTablesWriteLock;
    public static final float[] CommonFontSizes = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile SparseArrayCompat sLookupTables = new SparseArrayCompat((Object) null);

    static {
        Object[] objArr = new Object[0];
        LookupTablesWriteLock = objArr;
        synchronized (objArr) {
            sLookupTables.put(115, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            sLookupTables.put(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            sLookupTables.put(150, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            sLookupTables.put(EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            sLookupTables.put(200, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((sLookupTables.keyAt(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("You should only apply non-linear scaling to font scales > 1");
    }

    public static FontScaleConverter forScale(float f) {
        float keyAt;
        FontScaleConverter fontScaleConverter;
        float[] fArr = CommonFontSizes;
        if (f < 1.03f) {
            return null;
        }
        SparseArrayCompat sparseArrayCompat = sLookupTables;
        int i = (int) (f * 100.0f);
        sparseArrayCompat.getClass();
        FontScaleConverter fontScaleConverter2 = (FontScaleConverter) SieveCacheKt.commonGet(sparseArrayCompat, i);
        if (fontScaleConverter2 != null) {
            return fontScaleConverter2;
        }
        SparseArrayCompat sparseArrayCompat2 = sLookupTables;
        if (sparseArrayCompat2.garbage) {
            SieveCacheKt.access$gc(sparseArrayCompat2);
        }
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat2.size, i, sparseArrayCompat2.keys);
        if (binarySearch >= 0) {
            return (FontScaleConverter) sLookupTables.valueAt(binarySearch);
        }
        int i2 = -(binarySearch + 1);
        int i3 = i2 - 1;
        if (i2 >= sLookupTables.size()) {
            FontScaleConverterTable fontScaleConverterTable = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f});
            put(f, fontScaleConverterTable);
            return fontScaleConverterTable;
        }
        if (i3 < 0) {
            fontScaleConverter = new FontScaleConverterTable(fArr, fArr);
            keyAt = 1.0f;
        } else {
            keyAt = sLookupTables.keyAt(i3) / 100.0f;
            fontScaleConverter = (FontScaleConverter) sLookupTables.valueAt(i3);
        }
        float constrainedMap = AccentColorsKt.constrainedMap(RecyclerView.DECELERATION_RATE, 1.0f, keyAt, sLookupTables.keyAt(i2) / 100.0f, f);
        FontScaleConverter fontScaleConverter3 = (FontScaleConverter) sLookupTables.valueAt(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            fArr2[i4] = AccentColorsKt.lerp(fontScaleConverter.convertSpToDp(f2), fontScaleConverter3.convertSpToDp(f2), constrainedMap);
        }
        FontScaleConverterTable fontScaleConverterTable2 = new FontScaleConverterTable(fArr, fArr2);
        put(f, fontScaleConverterTable2);
        return fontScaleConverterTable2;
    }

    public static void put(float f, FontScaleConverterTable fontScaleConverterTable) {
        synchronized (LookupTablesWriteLock) {
            SparseArrayCompat m129clone = sLookupTables.m129clone();
            m129clone.put((int) (f * 100.0f), fontScaleConverterTable);
            sLookupTables = m129clone;
        }
    }
}
