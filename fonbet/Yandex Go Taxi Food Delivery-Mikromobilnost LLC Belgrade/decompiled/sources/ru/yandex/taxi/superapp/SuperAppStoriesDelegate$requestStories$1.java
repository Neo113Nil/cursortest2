package ru.yandex.taxi.superapp;

import defpackage.ck7;
import defpackage.gcn;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.olu0;
import defpackage.plu0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.promotions.model.PromotionBackground;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppStoriesDelegate$requestStories$1", f = "SuperAppStoriesDelegate.kt", l = {50, 52}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuperAppStoriesDelegate$requestStories$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ Double $lat;
    final /* synthetic */ Double $lon;
    final /* synthetic */ String $screenName;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppStoriesDelegate$requestStories$1(r rVar, Double d, Double d2, String str, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
        this.$lat = d;
        this.$lon = d2;
        this.$screenName = str;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppStoriesDelegate$requestStories$1(this.this$0, this.$lat, this.$lon, this.$screenName, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppStoriesDelegate$requestStories$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r14 == r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gcn] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r rVar;
        SuperAppStoriesDelegate$requestStories$1 superAppStoriesDelegate$requestStories$1;
        gcn gcnVar;
        String str;
        gcn gcnVar2;
        String b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            r1.a(new ck7(new plu0(EmptyList.a), null));
            jst.e.k(th, "Stories loading failed on WebView");
        }
        if (r1 == 0) {
            kotlin.b.b(obj);
            rVar = this.this$0;
            Double d = this.$lat;
            Double d2 = this.$lon;
            String str2 = this.$screenName;
            gcn gcnVar3 = this.$callback;
            this.L$0 = rVar;
            this.L$1 = str2;
            this.L$2 = gcnVar3;
            this.L$3 = gcnVar3;
            this.label = 1;
            superAppStoriesDelegate$requestStories$1 = this;
            if (rVar.b.b(d, d2, new Integer(0), str2, superAppStoriesDelegate$requestStories$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            gcnVar = gcnVar3;
            str = str2;
            gcnVar2 = gcnVar3;
        } else {
            if (r1 != 1) {
                if (r1 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gcn gcnVar4 = (gcn) this.L$1;
                gcnVar = (gcn) this.L$0;
                kotlin.b.b(obj);
                r1 = gcnVar4;
                List<Story> list = (List) obj;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (Story story : list) {
                    String str3 = story.b;
                    Story.e eVar = story.i.c;
                    if (eVar == null) {
                        b = null;
                    } else {
                        ru.yandex.taxi.promotions.model.d dVar = PromotionBackground.Companion;
                        List list2 = eVar.a;
                        PromotionBackground.Type type = PromotionBackground.Type.IMAGE;
                        dVar.getClass();
                        b = ru.yandex.taxi.promotions.model.d.b(list2, type);
                    }
                    arrayList.add(new olu0(str3, b, story.k));
                }
                gcnVar.a(new ck7(new plu0(arrayList), null));
                return zy11.a;
            }
            gcn gcnVar5 = (gcn) this.L$3;
            gcn gcnVar6 = (gcn) this.L$2;
            str = (String) this.L$1;
            rVar = (r) this.L$0;
            kotlin.b.b(obj);
            superAppStoriesDelegate$requestStories$1 = this;
            gcnVar = gcnVar6;
            gcnVar2 = gcnVar5;
        }
        ru.yandex.taxi.stories.domain.b bVar = rVar.b;
        superAppStoriesDelegate$requestStories$1.L$0 = gcnVar;
        superAppStoriesDelegate$requestStories$1.L$1 = gcnVar2;
        superAppStoriesDelegate$requestStories$1.L$2 = null;
        superAppStoriesDelegate$requestStories$1.L$3 = null;
        superAppStoriesDelegate$requestStories$1.label = 2;
        obj = bVar.d.b(str, superAppStoriesDelegate$requestStories$1);
        r1 = gcnVar2;
    }
}
