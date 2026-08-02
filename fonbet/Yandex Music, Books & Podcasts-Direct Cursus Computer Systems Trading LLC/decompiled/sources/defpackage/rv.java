package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class rv extends ezc implements Function1 {
    public static final rv a = new rv(1, xv.class, "contentType", "contentType(Lcom/yandex/music/screen/album/ui/AlbumScreenTrackItem;)I", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        u00 u00Var = (u00) obj;
        u00Var.getClass();
        if (u00Var instanceof s00) {
            i = 1;
        } else {
            if (!(u00Var instanceof t00)) {
                b6e.s();
                return null;
            }
            i = 2;
        }
        return Integer.valueOf(i);
    }
}
