package defpackage;

import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes6.dex */
public final /* synthetic */ class zmu0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ anu0 b;
    public final /* synthetic */ Story c;

    public /* synthetic */ zmu0(anu0 anu0Var, Story story, int i) {
        this.a = i;
        this.b = anu0Var;
        this.c = story;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Story story = this.c;
        anu0 anu0Var = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                anu0Var.a.b.b(new lmu0(story.b, str, false));
                break;
            default:
                anu0Var.a.b.b(new lmu0(story.b, str, true));
                break;
        }
        return zy11Var;
    }
}
