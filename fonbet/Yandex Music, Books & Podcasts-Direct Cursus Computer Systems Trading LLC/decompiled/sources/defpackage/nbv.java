package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nbv extends l9 {

    @NonNull
    public static final Parcelable.Creator<nbv> CREATOR = new onv(8);
    public final int a;
    public final Uri b;
    public final int c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nbv(JSONObject jSONObject) {
        this(r0, jSONObject.optInt(CameraProperty.WIDTH, 0), jSONObject.optInt(CameraProperty.HEIGHT, 0));
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof nbv)) {
            nbv nbvVar = (nbv) obj;
            if (ldg.s(this.b, nbvVar.b) && this.c == nbvVar.c && this.d == nbvVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.b.toString();
        StringBuilder l = dfi.l("Image ", this.c, this.d, "x", StringUtil.SPACE);
        l.append(uri);
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.i0(parcel, 2, this.b, i);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.c);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.d);
        o8g.p0(parcel, o0);
    }

    public nbv(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            xq0.x("url cannot be null");
            throw null;
        }
        if (i < 0 || i2 < 0) {
            xq0.x("width and height must not be negative");
            throw null;
        }
    }

    public nbv(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.b = uri;
        this.c = i2;
        this.d = i3;
    }
}
