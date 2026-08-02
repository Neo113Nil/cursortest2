package ru.yandex.taxi.search;

import defpackage.f4v0;
import defpackage.itj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qpc;
import defpackage.t9j0;
import defpackage.v7v0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.persuggest.source.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Ljtj0;", "Lqpc;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.PersonalAddressSearchInteractor$resolveSelectedSuggest$1", f = "PersonalAddressSearchInteractor.kt", l = {120, HProv.PP_CONTAINER_EXTENSION_DEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PersonalAddressSearchInteractor$resolveSelectedSuggest$1 extends SuspendLambda implements wls {
    final /* synthetic */ qpc $suggest;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalAddressSearchInteractor$resolveSelectedSuggest$1(f fVar, qpc qpcVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$suggest = qpcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PersonalAddressSearchInteractor$resolveSelectedSuggest$1 personalAddressSearchInteractor$resolveSelectedSuggest$1 = new PersonalAddressSearchInteractor$resolveSelectedSuggest$1(this.this$0, this.$suggest, continuation);
        personalAddressSearchInteractor$resolveSelectedSuggest$1.L$0 = obj;
        return personalAddressSearchInteractor$resolveSelectedSuggest$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalAddressSearchInteractor$resolveSelectedSuggest$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        if (r1.emit(r3, r18) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r3 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            h hVar = fVar.a;
            t9j0 t9j0Var = new t9j0(fVar.g.c(), this.this$0.g.a.getType(), ((v7v0) this.$suggest).c, f.h(this.this$0), ((v7v0) this.$suggest).b, this.this$0.g.d.get(), f.i(this.this$0), f.f(this.this$0), f.g(this.this$0));
            this.L$0 = vprVar;
            this.label = 1;
            a = hVar.a(t9j0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        itj0 j = f.j(this.this$0, (f4v0) a);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
