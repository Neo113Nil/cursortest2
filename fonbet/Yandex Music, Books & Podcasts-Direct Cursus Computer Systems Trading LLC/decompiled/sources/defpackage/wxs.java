package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.player.tracks.TrackVariant;

/* loaded from: classes6.dex */
public final class wxs extends uif implements Function1 {
    public final /* synthetic */ TrackVariant r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxs(TrackVariant trackVariant) {
        super(1);
        this.r = trackVariant;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f2t f2tVar = (f2t) obj;
        f2tVar.getClass();
        isb isbVar = (isb) ((TrackVariant.Variant) this.r).getFormat();
        f2tVar.b = new csc(isbVar.f, isbVar.g, isbVar.h, isbVar.i, isbVar.c, isbVar.d, isbVar.e);
        return Unit.a;
    }
}
