package defpackage;

import android.os.Parcel;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import retrofit2.Response;

/* loaded from: classes3.dex */
public class wp3 extends RuntimeException {
    public wp3(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wp3(Response response) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder("HTTP ");
        l3o l3oVar = response.a;
        sb.append(l3oVar.d);
        sb.append(StringUtil.SPACE);
        sb.append(l3oVar.c);
    }
}
