package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.savedstate.SavedStateReaderKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class IntNavType extends NavType {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntNavType(boolean z, int i) {
        super(z);
        this.$r8$classId = i;
    }

    @Override // androidx.navigation.NavType
    public final Object get(Bundle bundle, String str) {
        switch (this.$r8$classId) {
            case 0:
                bundle.getClass();
                return Integer.valueOf(BundleKt.m1095getIntimpl(bundle, str));
            case 1:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            case 2:
                bundle.getClass();
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            case 3:
                bundle.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            case 4:
                bundle.getClass();
                return Integer.valueOf(BundleKt.m1095getIntimpl(bundle, str));
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                String string2 = bundle.getString(str);
                if (string2 != null) {
                    return string2;
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
        }
    }

    @Override // androidx.navigation.NavType
    public final String getName() {
        switch (this.$r8$classId) {
            case 0:
                return InquiryField.IntegerField.TYPE;
            case 1:
                return InquiryField.BooleanField.TYPE;
            case 2:
                return InquiryField.FloatField.TYPE;
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return InquiryField.StringField.TYPE;
        }
    }

    @Override // androidx.navigation.NavType
    /* renamed from: parseValue */
    public final Object mo1158parseValue(String str) {
        boolean z = true;
        switch (this.$r8$classId) {
            case 0:
                str.getClass();
                return Integer.valueOf(StringsKt__StringsJVMKt.startsWith(str, "0x", false) ? Integer.parseInt(str.substring(2), CharsKt.checkRadix(16)) : Integer.parseInt(str));
            case 1:
                str.getClass();
                if (!Intrinsics.areEqual(str, "true")) {
                    if (!Intrinsics.areEqual(str, "false")) {
                        a$$ExternalSyntheticBUOutline0.m$3("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                str.getClass();
                return Float.valueOf(Float.parseFloat(str));
            case 3:
                str.getClass();
                String m1148m = StringsKt__StringsJVMKt.endsWith(str, "L", false) ? Boxes$$ExternalSyntheticOutline1.m1148m(1, 0, str) : str;
                return Long.valueOf(StringsKt__StringsJVMKt.startsWith(str, "0x", false) ? Long.parseLong(m1148m.substring(2), CharsKt.checkRadix(16)) : Long.parseLong(m1148m));
            case 4:
                str.getClass();
                return Integer.valueOf(StringsKt__StringsJVMKt.startsWith(str, "0x", false) ? Integer.parseInt(str.substring(2), CharsKt.checkRadix(16)) : Integer.parseInt(str));
            default:
                str.getClass();
                if (Intrinsics.areEqual(str, "null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // androidx.navigation.NavType
    public final void put(Bundle bundle, String str, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                break;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, floatValue);
                break;
            case 3:
                long longValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                break;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue2);
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putString(str, str2);
                    break;
                }
        }
    }

    @Override // androidx.navigation.NavType
    public String serializeAsValue(Object obj) {
        switch (this.$r8$classId) {
            case 5:
                String str = (String) obj;
                if (str == null) {
                    return "null";
                }
                String encode = Uri.encode(str, null);
                encode.getClass();
                return encode;
            default:
                return super.serializeAsValue(obj);
        }
    }
}
