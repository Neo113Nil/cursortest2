package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class qyb extends aur implements Function1 {
    public long j;
    public int k;
    public final /* synthetic */ syb l;
    public final /* synthetic */ String m;
    public final /* synthetic */ File n;
    public final /* synthetic */ z77 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyb(syb sybVar, String str, File file, z77 z77Var, String str2, String str3, String str4, Continuation continuation) {
        super(1, continuation);
        this.l = sybVar;
        this.m = str;
        this.n = file;
        this.o = z77Var;
        this.p = str2;
        this.q = str3;
        this.r = str4;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new qyb(this.l, this.m, this.n, this.o, this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((qyb) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0137, code lost:
    
        if (r0 == r13) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0139, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0063, code lost:
    
        if (defpackage.syb.a(r4, r19) == r13) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8  */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long N;
        File file;
        ?? r2;
        Object t7oVar;
        File file2;
        j7a j7aVar;
        String str;
        Object Q;
        File file3;
        GZIPOutputStream gZIPOutputStream;
        syb sybVar = this.l;
        long j = sybVar.f;
        i5f i5fVar = sybVar.j;
        e0h e0hVar = sybVar.q;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        String str2 = this.m;
        File file4 = this.n;
        if (i == 0) {
            qgg.h0(obj);
            msa msaVar = nsa.b;
            N = yd5.N(System.currentTimeMillis(), ssa.MILLISECONDS);
            myb mybVar = (myb) e0hVar.get(str2);
            file = file4;
            if (mybVar != null && nsa.c(mybVar.b, N) > 0) {
                return mybVar.a;
            }
            this.j = N;
            this.k = 1;
        } else if (i == 1) {
            long j2 = this.j;
            qgg.h0(obj);
            N = j2;
            file = file4;
        } else {
            if (i != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            Q = obj;
            str = str2;
            file = file4;
            okg okgVar = (okg) Q;
            okgVar.getClass();
            j7a j7aVar2 = new j7a(okgVar.a, okgVar.b, okgVar.c);
            try {
                r7o r7oVar = z7o.b;
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                file3 = file;
                try {
                    gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file3), RemoteCameraConfig.Notification.ID));
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                    msa msaVar2 = nsa.b;
                    long N2 = yd5.N(System.currentTimeMillis(), ssa.MILLISECONDS);
                    file3.setLastModified(nsa.f(N2));
                    e0hVar.put(str, new myb(j7aVar2, nsa.o(N2, j)));
                    return j7aVar2;
                }
            } catch (Throwable unused2) {
                file3 = file;
            }
            try {
                i4w.D(i5fVar, okg.Companion.serializer(), okgVar, gZIPOutputStream);
                gZIPOutputStream.close();
                msa msaVar22 = nsa.b;
                long N22 = yd5.N(System.currentTimeMillis(), ssa.MILLISECONDS);
                file3.setLastModified(nsa.f(N22));
                e0hVar.put(str, new myb(j7aVar2, nsa.o(N22, j)));
                return j7aVar2;
            } finally {
            }
        }
        if (file.exists()) {
            try {
                r7o r7oVar3 = z7o.b;
                r2 = file.exists();
            } catch (Throwable th) {
                th = th;
                r2 = file;
            }
            try {
            } catch (Throwable th2) {
                th = th2;
                r7o r7oVar4 = z7o.b;
                t7oVar = new t7o(th);
                file2 = r2;
                if (!(t7oVar instanceof t7o)) {
                }
                j7aVar = (j7a) (!(t7oVar instanceof t7o) ? null : t7oVar);
                if (j7aVar == null) {
                }
                file = file2;
                str = str2;
                f44 f44Var = new f44(this.o, sybVar, this.p, this.q, this.r, (Continuation) null);
                this.j = N;
                this.k = 2;
                Q = gld.Q(f44Var, this);
            }
            if (r2 == 0) {
                throw new IllegalStateException(("File " + file + " doesn't exist").toString());
            }
            r2 = file;
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new BufferedInputStream(new FileInputStream((File) r2), RemoteCameraConfig.Notification.ID));
            try {
                t7oVar = i4w.C(i5fVar, okg.Companion.serializer(), gZIPInputStream);
                gZIPInputStream.close();
                file2 = r2;
                if (!(t7oVar instanceof t7o)) {
                    okg okgVar2 = (okg) t7oVar;
                    okgVar2.getClass();
                    t7oVar = new j7a(okgVar2.a, okgVar2.b, okgVar2.c);
                }
                j7aVar = (j7a) (!(t7oVar instanceof t7o) ? null : t7oVar);
                if (j7aVar == null) {
                    msa msaVar3 = nsa.b;
                    long o = nsa.o(yd5.N(file2.lastModified(), ssa.MILLISECONDS), j);
                    if (nsa.c(o, N) > 0) {
                        e0hVar.put(str2, new myb(j7aVar, o));
                        return j7aVar;
                    }
                    file2.delete();
                } else {
                    file2.delete();
                }
                file = file2;
            } finally {
            }
        } else {
            e0hVar.remove(str2);
        }
        str = str2;
        f44 f44Var2 = new f44(this.o, sybVar, this.p, this.q, this.r, (Continuation) null);
        this.j = N;
        this.k = 2;
        Q = gld.Q(f44Var2, this);
    }
}
