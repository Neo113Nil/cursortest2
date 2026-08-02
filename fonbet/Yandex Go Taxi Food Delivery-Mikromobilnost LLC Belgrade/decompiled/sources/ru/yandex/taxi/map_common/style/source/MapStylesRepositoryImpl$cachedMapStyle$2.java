package ru.yandex.taxi.map_common.style.source;

import android.content.Context;
import defpackage.am2;
import defpackage.ceh;
import defpackage.cne0;
import defpackage.gwk0;
import defpackage.hs00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.swh0;
import defpackage.td7;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ljs00;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Ltse;)Ljs00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.style.source.MapStylesRepositoryImpl$cachedMapStyle$2", f = "MapStylesRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapStylesRepositoryImpl$cachedMapStyle$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $styleName;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapStylesRepositoryImpl$cachedMapStyle$2(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$styleName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapStylesRepositoryImpl$cachedMapStyle$2(this.this$0, this.$styleName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapStylesRepositoryImpl$cachedMapStyle$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        td7 td7Var = eVar.e;
        String str = this.$styleName;
        ThemeType themeType = eVar.f.a.getThemeType();
        am2 am2Var = td7Var.a.a;
        am2Var.getClass();
        Context context = (Context) am2Var.a;
        int i = ceh.a[themeType.ordinal()];
        if (i == 1) {
            l = ((cne0) am2Var.b).l(str, null);
            if (l == null) {
                l = gwk0.w(swh0.light_map_style, context);
            }
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            l = ((cne0) am2Var.c).l(str, null);
            if (l == null) {
                l = gwk0.w(swh0.dark_map_style, context);
            }
        }
        if (l.length() <= 0) {
            ny61.r("Something have to be returned, but there is nothing");
            return null;
        }
        e eVar2 = this.this$0;
        return eVar2.d.a(((xnt) eVar2.a).c(l, hs00.Companion.serializer())).get();
    }
}
