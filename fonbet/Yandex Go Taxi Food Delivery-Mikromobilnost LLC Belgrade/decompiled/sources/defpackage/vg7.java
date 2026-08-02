package defpackage;

import androidx.compose.runtime.snapshots.a;
import androidx.work.impl.WorkerStoppedException;
import flex.logger.FlexLogLevel;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import retrofit2.Response;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes8.dex */
public final class vg7 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vg7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        StackTraceElement stackTraceElement;
        String str2;
        long j;
        switch (this.a) {
            case 0:
                return ((wls) this.b).invoke((Response) this.c, obj);
            case 1:
                String str3 = ((fe7) obj).a;
                zjr zjrVar = (zjr) this.b;
                tjr tjrVar = tjr.d;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str3.getBytes(uza.a), 0, str3.length());
                    byte[] digest = messageDigest.digest();
                    BigInteger bigInteger = new BigInteger(1, digest);
                    str = String.format("%0" + (digest.length << 1) + RemoteBioParameters.X, Arrays.copyOf(new Object[]{bigInteger}, 1));
                } catch (NoSuchAlgorithmException e) {
                    i3y a = xfz.a(new Pair("algorithm", "MD5"), new Pair("error", e.getMessage()));
                    EmptyList emptyList = EmptyList.a;
                    s7s0 s7s0Var = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        Integer valueOf = Integer.valueOf(lineNumber);
                        if (lineNumber <= 0) {
                            valueOf = null;
                        }
                        if (valueOf == null || (str2 = valueOf.toString()) == null) {
                            str2 = "No line info";
                        }
                        tjrVar = new tjr(fileName, methodName, str2);
                    }
                    zjrVar.d(FlexLogLevel.DEBUG, "Could not obtain cypher algorithm to create hash", a, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str3.length(); i++) {
                    char charAt = str3.charAt(i);
                    if (!evu0.z("|\\?*<\":>+[]/'", charAt)) {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                int length = 186 - str.length();
                if (sb2.length() > length) {
                    sb2 = sb2.substring(0, length);
                }
                return new jb7(new File((File) this.c, oyr.p("document_", sb2.concat(str), ".json")), 11);
            case 2:
                a aVar = (a) obj;
                synchronized (q2t0.c) {
                    j = q2t0.e;
                    q2t0.e = 1 + j;
                }
                return new mz40(j, aVar, (tls) this.b, (tls) this.c);
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof WorkerStoppedException) {
                    ((kuy) this.b).stop(((WorkerStoppedException) th).getReason());
                }
                ((euy) this.c).cancel(false);
                return zy11.a;
        }
    }
}
