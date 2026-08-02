package defpackage;

import android.util.Base64;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class jm7 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jm7(vx6 vx6Var, String str, String str2, Object obj, int i) {
        super(0);
        this.r = i;
        this.s = str;
        this.t = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        y7o y7oVar;
        int i = this.r;
        String str = this.t;
        String str2 = this.s;
        switch (i) {
            case 0:
                File file = new File(str2);
                File file2 = new File(str);
                try {
                    if (!file.exists()) {
                        y7oVar = new y7o(null, new mac("File item is missing at path: '" + str2 + "'", (Throwable) null));
                    } else if (!file2.exists() || file2.delete()) {
                        mac A = vx6.A(str);
                        if (A != null) {
                            y7oVar = new y7o(null, A);
                        } else {
                            if (!file.renameTo(file2)) {
                                if (!cbc.h(file, file2)) {
                                    y7oVar = new y7o(null, new mac("Received unexpected error when accessing file item at path: '" + str2 + "'", (Throwable) null));
                                } else if (!cbc.j(file)) {
                                    y7oVar = new y7o(null, new mac("Received unexpected error when accessing file item at path: '" + str2 + "'", (Throwable) null));
                                }
                            }
                            y7oVar = new y7o(Unit.a, null);
                        }
                    } else {
                        y7oVar = new y7o(null, new mac("Received unexpected error when accessing file item at path: '" + str + "'", (Throwable) null));
                    }
                    return y7oVar;
                } catch (Throwable th) {
                    try {
                        cbc.j(file2);
                    } catch (Throwable unused) {
                    }
                    return new y7o(null, new mac(hrg.q("Received unexpected error when accessing file item at path: '", str, "'"), th));
                }
            default:
                File file3 = new File(str2);
                q6b q6bVar = q6b.a;
                try {
                    if (file3.exists()) {
                        if (!file3.isFile()) {
                            return new y7o(null, new mac("File item already exists at destination path: '" + str2 + "'", (Throwable) null));
                        }
                        if (!file3.delete()) {
                            return new y7o(null, new mac("Received unexpected error when accessing file item at path: '" + str2 + "'", (Throwable) null));
                        }
                    }
                    if (im7.a[0] == 1) {
                        byte[] decode = Base64.decode(str, 0);
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3), RemoteCameraConfig.Notification.ID);
                        try {
                            bufferedOutputStream.write(decode);
                            bufferedOutputStream.close();
                        } finally {
                        }
                    } else {
                        Charset charset = StandardCharsets.UTF_8;
                        charset.getClass();
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file3), charset), RemoteCameraConfig.Notification.ID);
                        try {
                            bufferedWriter.write(str);
                            bufferedWriter.close();
                        } finally {
                        }
                    }
                    return new y7o(Unit.a, null);
                } catch (Throwable th2) {
                    return new y7o(null, new mac(hrg.q("Received unexpected error when accessing file item at path: '", str2, "'"), th2));
                }
        }
    }
}
