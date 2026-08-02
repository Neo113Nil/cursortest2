package com.google.firebase;

import com.google.android.gms.internal.measurement.zzlj;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.util.concurrent.Executor;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1 implements ComponentFactory {
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1 INSTANCE = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1(0);
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1 INSTANCE$1 = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1(1);
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1 INSTANCE$2 = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1(2);
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1 INSTANCE$3 = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1(3);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(zzlj zzljVar) {
        switch (this.$r8$classId) {
            case 0:
                Object obj = zzljVar.get(new Qualified(Background.class, Executor.class));
                obj.getClass();
                return JobKt.from((Executor) obj);
            case 1:
                Object obj2 = zzljVar.get(new Qualified(Lightweight.class, Executor.class));
                obj2.getClass();
                return JobKt.from((Executor) obj2);
            case 2:
                Object obj3 = zzljVar.get(new Qualified(Blocking.class, Executor.class));
                obj3.getClass();
                return JobKt.from((Executor) obj3);
            default:
                Object obj4 = zzljVar.get(new Qualified(UiThread.class, Executor.class));
                obj4.getClass();
                return JobKt.from((Executor) obj4);
        }
    }
}
