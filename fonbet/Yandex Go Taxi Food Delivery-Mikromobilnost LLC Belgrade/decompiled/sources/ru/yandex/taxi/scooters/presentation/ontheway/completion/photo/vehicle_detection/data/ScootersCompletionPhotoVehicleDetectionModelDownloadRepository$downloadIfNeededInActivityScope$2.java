package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.evu0;
import defpackage.g050;
import defpackage.g3r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zy11;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeededInActivityScope$2", f = "ScootersCompletionPhotoVehicleDetectionModelDownloadRepository.kt", l = {191, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeededInActivityScope$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $link;
    final /* synthetic */ g050 $lock;
    final /* synthetic */ File $targetFile;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeededInActivityScope$2(g050 g050Var, a aVar, String str, File file, Continuation continuation) {
        super(2, continuation);
        this.$lock = g050Var;
        this.this$0 = aVar;
        this.$link = str;
        this.$targetFile = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeededInActivityScope$2(this.$lock, this.this$0, this.$link, this.$targetFile, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeededInActivityScope$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
    
        if (ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.a.a(r6, r7, r8, null, false, r13) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:23:0x0066, B:28:0x009e, B:36:0x00c0, B:48:0x0094, B:46:0x00db, B:39:0x007a), top: B:22:0x0066, inners: #4 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        a aVar;
        File file;
        String str;
        Throwable th;
        g050 g050Var2;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                g050Var = this.$lock;
                aVar = this.this$0;
                String str3 = this.$link;
                File file2 = this.$targetFile;
                this.L$0 = g050Var;
                this.L$1 = aVar;
                this.L$2 = str3;
                this.L$3 = file2;
                this.label = 1;
                if (g050Var.a(this) != coroutineSingletons) {
                    file = file2;
                    str = str3;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    g050Var2 = (g050) this.L$0;
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var2 = (g050) this.L$0;
                }
                try {
                    b.b(obj);
                    g050Var = g050Var2;
                    g050Var.d(null);
                    return zy11.a;
                } catch (Throwable th2) {
                    th = th2;
                    g050Var2.d(null);
                    throw th;
                }
            }
            File file3 = (File) this.L$3;
            String str4 = (String) this.L$2;
            aVar = (a) this.L$1;
            g050 g050Var3 = (g050) this.L$0;
            b.b(obj);
            file = file3;
            g050Var = g050Var3;
            str = str4;
            boolean d = aVar.d.d(str);
            File a = aVar.d.a(str);
            if (a.isFile()) {
                try {
                    String obj2 = evu0.k0(g3r.e(a)).toString();
                    if (evu0.J(obj2)) {
                        obj2 = null;
                    }
                    str2 = obj2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th3) {
                    zgz.a("Failed to read completion photo vehicle detection model etag", th3);
                }
                if (!d && str2 != null) {
                    this.L$0 = g050Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.Z$0 = d;
                    this.label = 2;
                    if (a.a(aVar, str, file, str2, true, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    g050Var2 = g050Var;
                } else {
                    if (!d) {
                        g050Var.d(null);
                        return zy11.a;
                    }
                    this.L$0 = g050Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.Z$0 = d;
                    this.label = 3;
                }
                g050Var = g050Var2;
                g050Var.d(null);
                return zy11.a;
            }
            str2 = null;
            if (!d) {
            }
            if (!d) {
            }
        } catch (Throwable th4) {
            g050 g050Var4 = g050Var;
            th = th4;
            g050Var2 = g050Var4;
            g050Var2.d(null);
            throw th;
        }
    }
}
