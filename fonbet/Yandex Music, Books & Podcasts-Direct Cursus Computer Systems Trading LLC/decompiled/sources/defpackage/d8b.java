package defpackage;

/* loaded from: classes.dex */
public final class d8b implements Runnable {
    public final /* synthetic */ int a;
    public final jlq b;
    public final /* synthetic */ g8b c;

    public /* synthetic */ d8b(g8b g8bVar, jlq jlqVar, int i) {
        this.a = i;
        this.c = g8bVar;
        this.b = jlqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qs3 qs3Var;
        switch (this.a) {
            case 0:
                jlq jlqVar = this.b;
                jlqVar.b.a();
                synchronized (jlqVar.c) {
                    synchronized (this.c) {
                        try {
                            if (this.c.a.a.contains(new e8b(this.b, saf.k))) {
                                g8b g8bVar = this.c;
                                jlq jlqVar2 = this.b;
                                g8bVar.getClass();
                                try {
                                    jlqVar2.j(g8bVar.q, 5);
                                } finally {
                                }
                            }
                            this.c.c();
                        } finally {
                        }
                    }
                }
                return;
            default:
                jlq jlqVar3 = this.b;
                jlqVar3.b.a();
                synchronized (jlqVar3.c) {
                    synchronized (this.c) {
                        try {
                            if (this.c.a.a.contains(new e8b(this.b, saf.k))) {
                                this.c.s.a();
                                g8b g8bVar2 = this.c;
                                jlq jlqVar4 = this.b;
                                g8bVar2.getClass();
                                try {
                                    jlqVar4.l(g8bVar2.s, g8bVar2.o);
                                    this.c.g(this.b);
                                } finally {
                                }
                            }
                            this.c.c();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
