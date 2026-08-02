package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g;

/* loaded from: classes.dex */
class f extends g.a {
    public int a = 0;
    public final int b;
    public final /* synthetic */ g c;

    public f(g gVar) {
        this.c = gVar;
        this.b = gVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }
}
