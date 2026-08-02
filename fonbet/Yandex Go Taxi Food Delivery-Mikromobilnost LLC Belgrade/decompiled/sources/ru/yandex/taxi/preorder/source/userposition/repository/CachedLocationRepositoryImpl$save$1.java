package ru.yandex.taxi.preorder.source.userposition.repository;

import android.content.SharedPreferences;
import android.location.Location;
import defpackage.ccz;
import defpackage.fyc;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.repository.CachedLocationRepositoryImpl$save$1", f = "CachedLocationRepositoryImpl.kt", l = {144, 147}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class CachedLocationRepositoryImpl$save$1 extends SuspendLambda implements wls {
    final /* synthetic */ Location $location;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.preorder.source.userposition.repository.CachedLocationRepositoryImpl$save$1$2", f = "CachedLocationRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.source.userposition.repository.CachedLocationRepositoryImpl$save$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ Location $location;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, Location location, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$location = location;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$location, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            SharedPreferences k = this.this$0.d.k();
            Location location = this.$location;
            SharedPreferences.Editor edit = k.edit();
            if (location == null) {
                edit.clear().putInt("version", 1);
            } else {
                edit.putString("provider", location.getProvider()).putLong(RemoteBioParameters.TIME, location.getTime()).putLong("lat", Double.doubleToRawLongBits(location.getLatitude())).putLong("lon", Double.doubleToRawLongBits(location.getLongitude())).putFloat("accuracy", location.getAccuracy());
            }
            edit.apply();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedLocationRepositoryImpl$save$1(a aVar, Location location, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$location = location;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CachedLocationRepositoryImpl$save$1(this.this$0, this.$location, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CachedLocationRepositoryImpl$save$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        if (defpackage.tje.k0(r7, r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r7.s(r6) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!this.this$0.f.k0()) {
                this.this$0.b.getClass();
            }
            fyc fycVar = this.this$0.f;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ccz cczVar = this.this$0.b;
        Location location = this.$location;
        if (location != null) {
            location.getLatitude();
            location.getLongitude();
            location.getProvider();
        }
        cczVar.getClass();
        this.this$0.e.l(this.$location);
        this.this$0.a.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$location, null);
        this.label = 2;
    }
}
