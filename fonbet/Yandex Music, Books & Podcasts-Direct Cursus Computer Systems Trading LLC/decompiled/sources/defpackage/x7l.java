package defpackage;

/* loaded from: classes.dex */
public final class x7l {
    public final w7l a;

    public x7l(w7l w7lVar) {
        this.a = w7lVar;
    }

    public final void a() {
        try {
            ((x7l) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(w7l.class).newInstance(this.a)).a();
        } catch (Exception e) {
            if (!(e instanceof bbu)) {
                throw new bbu(e);
            }
            int i = bbu.a;
        }
    }
}
