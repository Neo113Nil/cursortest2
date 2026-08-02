package defpackage;

import androidx.media3.session.i;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class trb implements ycg, fvh {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ trb(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.fvh
    public Object h(i iVar, wrh wrhVar, int i) {
        switch (this.a) {
        }
        return iVar.m(wrhVar, this.b);
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        ((f8l) obj).a(this.b);
    }
}
