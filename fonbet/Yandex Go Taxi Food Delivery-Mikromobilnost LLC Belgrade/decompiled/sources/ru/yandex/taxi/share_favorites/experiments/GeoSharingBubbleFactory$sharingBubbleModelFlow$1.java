package ru.yandex.taxi.share_favorites.experiments;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.bms;
import defpackage.cn6;
import defpackage.d6z;
import defpackage.dn6;
import defpackage.g8e;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.rtb0;
import defpackage.tjr0;
import defpackage.tls;
import defpackage.u8w;
import defpackage.v0t;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.analytics.Events$ShareScreen$Screen;
import ru.yandex.taxi.bubbles.models.BubbleModelShownFrom;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv0t;", "geoSharingBubbleExp", "Lrtb0;", "pinAbsenceExp", "Lcom/yandex/go/navigation/screen/api/Screen;", "currentScreen", "Ldn6;", "<anonymous>", "(Lv0t;Lrtb0;Lcom/yandex/go/navigation/screen/api/Screen;)Ldn6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.share_favorites.experiments.GeoSharingBubbleFactory$sharingBubbleModelFlow$1", f = "GeoSharingBubbleFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class GeoSharingBubbleFactory$sharingBubbleModelFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.share_favorites.experiments.GeoSharingBubbleFactory$sharingBubbleModelFlow$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            u8w u8wVar = ((c) this.receiver).c.a;
            String value = ((BubbleModelShownFrom) obj).getValue();
            u8wVar.getClass();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            u8wVar.a.a(g8e.o("LocationBubble.Shown.", value), hashMap, 1, hashMap2);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.share_favorites.experiments.GeoSharingBubbleFactory$sharingBubbleModelFlow$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            double doubleValue = ((Number) obj).doubleValue();
            double doubleValue2 = ((Number) obj2).doubleValue();
            c cVar = (c) this.receiver;
            u8w u8wVar = cVar.c.a;
            u8wVar.getClass();
            u8wVar.a.a("LocationBubble.Tap", new HashMap(), 1, new HashMap());
            ((pep0) cVar.a).f((m950) cVar.e.get(), new tjr0(new zzs(doubleValue, doubleValue2, 0, null, null, 28), Events$ShareScreen$Screen.MAIN), hxx.a);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSharingBubbleFactory$sharingBubbleModelFlow$1(c cVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        GeoSharingBubbleFactory$sharingBubbleModelFlow$1 geoSharingBubbleFactory$sharingBubbleModelFlow$1 = new GeoSharingBubbleFactory$sharingBubbleModelFlow$1(this.this$0, (Continuation) obj4);
        geoSharingBubbleFactory$sharingBubbleModelFlow$1.L$0 = (v0t) obj;
        geoSharingBubbleFactory$sharingBubbleModelFlow$1.L$1 = (rtb0) obj2;
        geoSharingBubbleFactory$sharingBubbleModelFlow$1.L$2 = (Screen) obj3;
        return geoSharingBubbleFactory$sharingBubbleModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        v0t v0tVar = (v0t) this.L$0;
        rtb0 rtb0Var = (rtb0) this.L$1;
        Screen screen = (Screen) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (rtb0Var.b && screen == Screen.MAIN) {
            v0t.Companion.getClass();
            if (!jl40.l(v0tVar, v0t.i)) {
                return new d(d6z.Y(v0tVar, v0tVar.d), d6z.Y(v0tVar, v0tVar.e), v0tVar.f, v0tVar.g, new AnonymousClass1(1, this.this$0, c.class, "shown", "shown(Lru/yandex/taxi/bubbles/models/BubbleModelShownFrom;)V", 0), new AnonymousClass2(2, this.this$0, c.class, "clicked", "clicked(DD)V", 0));
            }
        }
        dn6.a.getClass();
        return cn6.b;
    }
}
