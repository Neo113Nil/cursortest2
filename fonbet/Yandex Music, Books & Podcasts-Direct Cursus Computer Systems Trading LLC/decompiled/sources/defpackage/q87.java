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
public final class q87 extends aur implements Function1 {
    public int j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ ju0 l;
    public final /* synthetic */ File m;
    public final /* synthetic */ z77 n;
    public final /* synthetic */ String o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q87(boolean z, ju0 ju0Var, File file, z77 z77Var, String str, boolean z2, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.k = z;
        this.l = ju0Var;
        this.m = file;
        this.n = z77Var;
        this.o = str;
        this.p = z2;
        this.q = str2;
        this.r = str3;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new q87(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((q87) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (r0 == r6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ac, code lost:
    
        if (r0 == r6) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [t7o] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        ujg t7oVar;
        Object b;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        File file = this.m;
        z77 z77Var = this.n;
        ju0 ju0Var = this.l;
        if (i == 0) {
            qgg.h0(obj);
            if (!this.k) {
                i5f i5fVar = (i5f) ju0Var.g;
                try {
                    r7o r7oVar = z7o.b;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                if (!file.exists()) {
                    throw new IllegalStateException(("File " + file + " doesn't exist").toString());
                }
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new BufferedInputStream(new FileInputStream(file), RemoteCameraConfig.Notification.ID));
                try {
                    ?? C = i4w.C(i5fVar, ujg.Companion.serializer(), gZIPInputStream);
                    gZIPInputStream.close();
                    t7oVar = C;
                    r10 = t7oVar instanceof t7o ? null : t7oVar;
                } finally {
                }
            }
            if (r10 != null) {
                Object obj2 = ju0Var.f;
                return b3i.S(r10);
            }
            yz1 yz1Var = new yz1(z77Var, this.o);
            b5m b5mVar = (b5m) ju0Var.i;
            this.j = 1;
            invoke = b5mVar.invoke(yz1Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                b = obj;
                ujg ujgVar = (ujg) b;
                i5f i5fVar2 = (i5f) ju0Var.g;
                try {
                    r7o r7oVar3 = z7o.b;
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file), RemoteCameraConfig.Notification.ID));
                    try {
                        i4w.D(i5fVar2, ujg.Companion.serializer(), ujgVar, gZIPOutputStream);
                        gZIPOutputStream.close();
                    } finally {
                    }
                } catch (Throwable unused) {
                    r7o r7oVar4 = z7o.b;
                }
                return b3i.S(ujgVar);
            }
            qgg.h0(obj);
            invoke = obj;
        }
        String str = (String) invoke;
        if (str == null) {
            return r6a.a;
        }
        String c = this.p ? ((ujl) ju0Var.d).c(z77Var) : ((tjl) ju0Var.c).i(z77Var);
        this.j = 2;
        b = ju0.b(this.l, c, this.q, str, this.r, this);
    }
}
