package androidx.compose.foundation.lazy;

import android.util.JsonWriter;
import com.squareup.cash.exif.ExifInterface;
import com.squareup.protos.franklin.api.UiAlias;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class LazyListIntervalContent$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ LazyListIntervalContent$$ExternalSyntheticLambda0(UiAlias.Type.Companion companion, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj).intValue();
                break;
            case 1:
                JsonWriter jsonWriter = (JsonWriter) obj;
                jsonWriter.getClass();
                jsonWriter.value(((Number) obj2).longValue());
                break;
            case 2:
                JsonWriter jsonWriter2 = (JsonWriter) obj;
                jsonWriter2.getClass();
                jsonWriter2.value(((Number) obj2).doubleValue());
                break;
            case 3:
                JsonWriter jsonWriter3 = (JsonWriter) obj;
                jsonWriter3.getClass();
                jsonWriter3.value((Number) obj2);
                break;
            case 4:
                JsonWriter jsonWriter4 = (JsonWriter) obj;
                jsonWriter4.getClass();
                jsonWriter4.value(((Boolean) obj2).booleanValue());
                break;
            case 5:
                JsonWriter jsonWriter5 = (JsonWriter) obj;
                jsonWriter5.getClass();
                jsonWriter5.beginObject();
                ExifInterface.Rational rational = (ExifInterface.Rational) obj2;
                jsonWriter5.name("numerator").value(rational.numerator);
                jsonWriter5.name("denominator").value(rational.denominator);
                jsonWriter5.endObject();
                break;
            case 6:
                JsonWriter jsonWriter6 = (JsonWriter) obj;
                jsonWriter6.getClass();
                UiAlias.Type.Companion.writeArray(jsonWriter6, ((double[]) obj2).length, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 12));
                break;
            case 7:
                JsonWriter jsonWriter7 = (JsonWriter) obj;
                jsonWriter7.getClass();
                UiAlias.Type.Companion.writeArray(jsonWriter7, ((float[]) obj2).length, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 19));
                break;
            case 8:
                JsonWriter jsonWriter8 = (JsonWriter) obj;
                jsonWriter8.getClass();
                UiAlias.Type.Companion.writeArray(jsonWriter8, ((long[]) obj2).length, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 17));
                break;
            case 9:
                JsonWriter jsonWriter9 = (JsonWriter) obj;
                jsonWriter9.getClass();
                Iterator it = ((Iterable) obj2).iterator();
                while (it.hasNext()) {
                    jsonWriter9.value(((UByte) it.next()).data & 255);
                }
                break;
            case 10:
                JsonWriter jsonWriter10 = (JsonWriter) obj;
                jsonWriter10.getClass();
                Iterator it2 = ((Iterable) obj2).iterator();
                while (it2.hasNext()) {
                    jsonWriter10.value(((ULong) it2.next()).data);
                }
                break;
            case 11:
                JsonWriter jsonWriter11 = (JsonWriter) obj;
                jsonWriter11.getClass();
                UiAlias.Type.Companion.writeArray(jsonWriter11, ((ULongArray) obj2).storage.length, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 10));
                break;
            case 12:
                JsonWriter jsonWriter12 = (JsonWriter) obj;
                jsonWriter12.getClass();
                double[] dArr = (double[]) obj2;
                int length = dArr.length;
                while (i2 < length) {
                    jsonWriter12.value(dArr[i2]);
                    i2++;
                }
                break;
            case 13:
                JsonWriter jsonWriter13 = (JsonWriter) obj;
                jsonWriter13.getClass();
                int length2 = ((byte[]) obj2).length;
                while (i2 < length2) {
                    jsonWriter13.value(r4[i2]);
                    i2++;
                }
                break;
            case 14:
                JsonWriter jsonWriter14 = (JsonWriter) obj;
                jsonWriter14.getClass();
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length;
                while (i2 < length3) {
                    jsonWriter14.value(Integer.valueOf(iArr[i2]));
                    i2++;
                }
                break;
            case 15:
                JsonWriter jsonWriter15 = (JsonWriter) obj;
                jsonWriter15.getClass();
                short[] sArr = (short[]) obj2;
                int length4 = sArr.length;
                while (i2 < length4) {
                    jsonWriter15.value(Short.valueOf(sArr[i2]));
                    i2++;
                }
                break;
            case 16:
                JsonWriter jsonWriter16 = (JsonWriter) obj;
                jsonWriter16.getClass();
                Iterator it3 = ((Iterable) obj2).iterator();
                while (it3.hasNext()) {
                    jsonWriter16.value(((UInt) it3.next()).data & BodyPartID.bodyIdMax);
                }
                break;
            case 17:
                JsonWriter jsonWriter17 = (JsonWriter) obj;
                jsonWriter17.getClass();
                long[] jArr = (long[]) obj2;
                int length5 = jArr.length;
                while (i2 < length5) {
                    jsonWriter17.value(jArr[i2]);
                    i2++;
                }
                break;
            case 18:
                JsonWriter jsonWriter18 = (JsonWriter) obj;
                jsonWriter18.getClass();
                Iterator it4 = ((Iterable) obj2).iterator();
                while (it4.hasNext()) {
                    jsonWriter18.value(((UShort) it4.next()).data & 65535);
                }
                break;
            case 19:
                JsonWriter jsonWriter19 = (JsonWriter) obj;
                jsonWriter19.getClass();
                float[] fArr = (float[]) obj2;
                int length6 = fArr.length;
                while (i2 < length6) {
                    jsonWriter19.value(Float.valueOf(fArr[i2]));
                    i2++;
                }
                break;
            case 20:
                JsonWriter jsonWriter20 = (JsonWriter) obj;
                jsonWriter20.getClass();
                UiAlias.Type.Companion.writeArray(jsonWriter20, ((int[]) obj2).length, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 14));
                break;
            case 21:
                JsonWriter jsonWriter21 = (JsonWriter) obj;
                jsonWriter21.getClass();
                UiAlias.Type.Companion.writeArray(jsonWriter21, ((UIntArray) obj2).storage.length, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 16));
                break;
            case 22:
                JsonWriter jsonWriter22 = (JsonWriter) obj;
                jsonWriter22.getClass();
                UiAlias.Type.Companion.writeArray(jsonWriter22, ((short[]) obj2).length, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 15));
                break;
            case 23:
                JsonWriter jsonWriter23 = (JsonWriter) obj;
                jsonWriter23.getClass();
                UiAlias.Type.Companion.writeArray(jsonWriter23, ((UShortArray) obj2).storage.length, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 18));
                break;
            case 24:
                JsonWriter jsonWriter24 = (JsonWriter) obj;
                jsonWriter24.getClass();
                UiAlias.Type.Companion.writeArray(jsonWriter24, ((byte[]) obj2).length, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 13));
                break;
            case 25:
                JsonWriter jsonWriter25 = (JsonWriter) obj;
                jsonWriter25.getClass();
                UiAlias.Type.Companion.writeArray(jsonWriter25, ((UByteArray) obj2).storage.length, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 9));
                break;
            default:
                JsonWriter jsonWriter26 = (JsonWriter) obj;
                jsonWriter26.getClass();
                jsonWriter26.value((String) obj2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LazyListIntervalContent$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
