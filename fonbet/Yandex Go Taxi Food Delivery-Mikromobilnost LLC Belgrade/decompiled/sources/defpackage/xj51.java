package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.messaging.core.net.entities.FileUploadResponseData;
import com.yandex.messaging.core.net.entities.YaDiskError;
import com.yandex.messaging.internal.net.HttpRequestTag;
import okhttp3.internal.Util;

/* loaded from: classes15.dex */
public final class xj51 extends w920 {
    public final /* synthetic */ yj51 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ oif0 c;
    public final /* synthetic */ long w;
    public final /* synthetic */ ho3 x;

    public xj51(yj51 yj51Var, String str, oif0 oif0Var, long j, ho3 ho3Var) {
        this.a = yj51Var;
        this.b = str;
        this.c = oif0Var;
        this.w = j;
        this.x = ho3Var;
    }

    @Override // defpackage.w920
    public final boolean c() {
        return false;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        eg70 a;
        String str = kvj0Var.c;
        int i = kvj0Var.w;
        yj51 yj51Var = this.a;
        if (i == 202) {
            yj51Var.c.reportEvent("tech_file_upload_202");
        }
        boolean z = kvj0Var.J;
        YaDiskError yaDiskError = null;
        if (z) {
            String a2 = kvj0Var.y.a("Location");
            String str2 = a2 != null ? a2 : null;
            return str2 != null ? new dg70(new FileUploadResponseData(str2)) : gg70.b(Constants.MINIMAL_ERROR_STATUS_CODE, "no location in response");
        }
        vj51 vj51Var = yj51Var.a;
        rvj0 rvj0Var = kvj0Var.z;
        if (rvj0Var == null) {
            return gg70.a(i, str, "body is null");
        }
        if (z) {
            try {
                Object fromJson = vj51Var.a.adapter(FileUploadResponseData.class).fromJson(rvj0Var.source());
                if (fromJson != null) {
                    dg70 dg70Var = new dg70(fromJson);
                    rvj0Var.close();
                    return dg70Var;
                }
                fg70 b = gg70.b(i, str);
                rvj0Var.close();
                return b;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        if (i / 100 == 5) {
            return gg70.b(i, str);
        }
        try {
            try {
                yaDiskError = (YaDiskError) vj51Var.a.adapter(YaDiskError.class).fromJson(rvj0Var.source());
            } catch (Throwable unused) {
            }
            if (yaDiskError != null) {
                a = gg70.a(i, "error = " + yaDiskError.getError() + ", message = " + yaDiskError.getMessage(), yaDiskError.getDescription());
                rvj0Var.close();
            } else {
                a = gg70.a(i, str, "error data couldn't be parsed");
                rvj0Var.close();
            }
            return a;
        } finally {
        }
    }

    @Override // defpackage.w920
    public final boolean e(ngz ngzVar) {
        return this.x.mo103c(ngzVar.b);
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        this.x.D((FileUploadResponseData) obj);
    }

    @Override // defpackage.w920
    public final void h() {
        this.x.mo103c(-1);
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        vj51 vj51Var = this.a.a;
        String str = this.b;
        vj51Var.getClass();
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h(str);
        if (this.c.b.a() > 0) {
            t4j0Var.e("PUT", this.c);
        } else {
            int i = m5j0.a;
            t4j0Var.e("PUT", wms.c(null, Util.EMPTY_BYTE_ARRAY));
        }
        long j = this.w;
        if (j > 0) {
            long a = this.c.b.a() + j;
            StringBuilder w = unr0.w(this.w, "bytes=", "-");
            w.append(a - 1);
            w.append("/");
            w.append(a);
            t4j0Var.a("Content-Range", w.toString());
        }
        HttpRequestTag httpRequestTag = HttpRequestTag.YaDiskFileRequest;
        t4j0Var.e = t4j0Var.e.E(qoi0.a(Object.class), httpRequestTag);
        return t4j0Var;
    }

    @Override // defpackage.w920
    public final int j() {
        return 0;
    }

    @Override // defpackage.w920
    public final boolean m(int i) {
        return false;
    }
}
