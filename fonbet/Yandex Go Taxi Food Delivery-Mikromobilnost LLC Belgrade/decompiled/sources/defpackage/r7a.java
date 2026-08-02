package defpackage;

import kotlinx.serialization.json.b;

/* loaded from: classes12.dex */
public final /* synthetic */ class r7a implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ b c;
    public final /* synthetic */ String w;

    public /* synthetic */ r7a(int i, String str, String str2, b bVar) {
        this.a = i;
        this.b = str;
        this.c = bVar;
        this.w = str2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.w;
        b bVar = this.c;
        String str2 = this.b;
        c9a c9aVar = (c9a) obj;
        switch (i) {
            case 0:
                f9a f9aVar = c9aVar.a;
                b9a b9aVar = c9aVar.b;
                tsa tsaVar = b9aVar.a;
                f9aVar.A((m950) ((g6) f9aVar.J).get(), new cja(str2, str, bVar), new d9a(f9aVar, b9aVar));
                break;
            default:
                f9a f9aVar2 = c9aVar.a;
                b9a b9aVar2 = c9aVar.b;
                tsa tsaVar2 = b9aVar2.a;
                f9aVar2.A((m950) ((g6) f9aVar2.J).get(), new cja(str2, str, bVar), new d9a(f9aVar2, b9aVar2));
                break;
        }
        return zy11Var;
    }
}
