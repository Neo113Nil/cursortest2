package com.squareup.cardcustomizations.signature;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import androidx.camera.core.AspectRatio;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.unit.IntSize;
import com.squareup.cardcustomizations.signature.Point;
import com.squareup.cardcustomizations.signature.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final class SignatureState {
    public final SavedSignature initialState;
    public final ParcelableSnapshotMutableState signature$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState signatureSize$delegate = Updater.mutableStateOf$default(new IntSize(0));
    public final ParcelableSnapshotMutableState invalidate$delegate = Updater.mutableStateOf$default(0);
    public final ParcelableSnapshotMutableState clipPath$delegate = Updater.mutableStateOf$default(AndroidPath_androidKt.Path());
    public final ParcelableSnapshotMutableState signatureOffset$delegate = Updater.mutableStateOf$default(new Offset(0));
    public final ParcelableSnapshotMutableState isEnabled$delegate = Updater.mutableStateOf$default(Boolean.TRUE);

    public SignatureState(SavedSignature savedSignature) {
        this.initialState = savedSignature;
    }

    public final void clear() {
        Signature signature$customizations = getSignature$customizations();
        if (signature$customizations != null) {
            signature$customizations.currentGlyph = null;
            if (!signature$customizations.userDrawnGlyphs().isEmpty()) {
                signature$customizations.glyphDeque.addFirst(new ArrayList());
            }
            Bitmap bitmap = signature$customizations.getBitmap();
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            signature$customizations.bitmap = null;
            signature$customizations.canvas = null;
        }
        setInvalidate$customizations(getInvalidate$customizations() + 1);
    }

    public final AndroidPath getClipPath$customizations() {
        return (AndroidPath) this.clipPath$delegate.getValue();
    }

    public final int getInvalidate$customizations() {
        return ((Number) this.invalidate$delegate.getValue()).intValue();
    }

    public final SavedSignature getSavedState() {
        Signature signature$customizations = getSignature$customizations();
        int i = 0;
        if (signature$customizations == null) {
            return new SavedSignature(1.0f, 1.0f, new float[0][][]);
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.signatureSize$delegate;
        float f = (int) (((IntSize) parcelableSnapshotMutableState.getValue()).packedValue >> 32);
        float f2 = (int) (((IntSize) parcelableSnapshotMutableState.getValue()).packedValue & BodyPartID.bodyIdMax);
        ArrayList arrayList = new ArrayList();
        List userDrawnGlyphs = signature$customizations.userDrawnGlyphs();
        arrayList.addAll(userDrawnGlyphs);
        Iterator it = userDrawnGlyphs.iterator();
        while (it.hasNext()) {
            List list = (List) signature$customizations.patternGlyphs.get((Signature.Glyph) it.next());
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        int intBitsToFloat = (int) Float.intBitsToFloat((int) (m2966getSignatureOffsetF1C5BW0$customizations() >> 32));
        int intBitsToFloat2 = (int) Float.intBitsToFloat((int) (m2966getSignatureOffsetF1C5BW0$customizations() & BodyPartID.bodyIdMax));
        int size = arrayList.size();
        long j = size == 0 ? 0L : ((Signature.Glyph) arrayList.get(0)).startTime;
        float[][][] fArr = new float[size][][];
        for (int i2 = 0; i2 < size; i2++) {
            List points = ((Signature.Glyph) arrayList.get(i2)).painter.points();
            int size2 = points.size();
            float[][] fArr2 = new float[size2][];
            int i3 = i;
            while (i3 < size2) {
                int i4 = i;
                Point.Timestamped timestamped = (Point.Timestamped) points.get(i3);
                ArrayList arrayList2 = arrayList;
                float f3 = timestamped.x - intBitsToFloat;
                int i5 = intBitsToFloat;
                float f4 = timestamped.y - intBitsToFloat2;
                float f5 = timestamped.time - j;
                float[] fArr3 = new float[3];
                fArr3[i4] = f3;
                fArr3[1] = f4;
                fArr3[2] = f5;
                fArr2[i3] = fArr3;
                i3++;
                arrayList = arrayList2;
                i = i4;
                intBitsToFloat = i5;
            }
            fArr[i2] = fArr2;
        }
        return new SavedSignature(f, f2, fArr);
    }

    public final Signature getSignature$customizations() {
        return (Signature) this.signature$delegate.getValue();
    }

    /* renamed from: getSignatureOffset-F1C5BW0$customizations, reason: not valid java name */
    public final long m2966getSignatureOffsetF1C5BW0$customizations() {
        return ((Offset) this.signatureOffset$delegate.getValue()).packedValue;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setInvalidate$customizations(int i) {
        this.invalidate$delegate.setValue(Integer.valueOf(i));
    }

    public final void undo() {
        Signature signature$customizations = getSignature$customizations();
        if (signature$customizations != null) {
            LinkedHashMap linkedHashMap = signature$customizations.patternGlyphs;
            ArrayDeque arrayDeque = signature$customizations.glyphDeque;
            List<Signature.Glyph> list = (List) arrayDeque.removeFirst();
            list.getClass();
            if (!list.isEmpty()) {
                linkedHashMap.remove((Signature.Glyph) list.remove(list.size() - 1));
            } else if (!arrayDeque.isEmpty()) {
                list = (List) arrayDeque.removeFirst();
            }
            if (!signature$customizations.userDrawnGlyphs().isEmpty()) {
                arrayDeque.addFirst(new ArrayList());
            }
            Canvas canvas = signature$customizations.canvas;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            }
            for (Signature.Glyph glyph : list) {
                if (linkedHashMap.get(glyph) != null) {
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(glyph);
                    Object obj = linkedHashMap.get(glyph);
                    obj.getClass();
                    signature$customizations.addPatternGlyphs(listOf, MapsKt__MapsJVMKt.mapOf(new Pair(glyph, obj)));
                } else {
                    signature$customizations.startGlyph();
                    Iterator it = glyph.iterator();
                    while (it.hasNext()) {
                        Point.Timestamped timestamped = (Point.Timestamped) it.next();
                        Signature.Glyph glyph2 = signature$customizations.currentGlyph;
                        glyph2.getClass();
                        glyph2.add(timestamped);
                    }
                    signature$customizations.finishGlyph();
                }
            }
        }
        Signature signature$customizations2 = getSignature$customizations();
        if (signature$customizations2 != null) {
            AspectRatio.clip(signature$customizations2.getBitmap(), getClipPath$customizations());
        }
        setInvalidate$customizations(getInvalidate$customizations() + 1);
    }
}
