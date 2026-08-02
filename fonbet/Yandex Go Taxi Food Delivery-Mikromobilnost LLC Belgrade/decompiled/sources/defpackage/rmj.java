package defpackage;

import com.yandex.mapkit.navigation.automotive.Navigation;

/* loaded from: classes7.dex */
public final class rmj extends q35 {
    public final /* synthetic */ int c = 0;
    public final Object d;
    public Object e;

    public rmj(ssr ssrVar, ini0 ini0Var) {
        super(ssrVar, "map_objects_tap_events");
        this.d = ini0Var;
        this.e = new uo00(this);
    }

    private final void d(Object obj) {
    }

    private final void e(Object obj) {
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        switch (this.c) {
            case 0:
                qmj qmjVar = (qmj) this.e;
                if (qmjVar != null) {
                    ((Navigation) ((fmj) this.d).a).getGuidance().getWindshield().removeListener(qmjVar);
                    this.e = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.q35
    public final void b(Object obj) {
        switch (this.c) {
            case 0:
                qmj qmjVar = new qmj(this);
                ((Navigation) ((fmj) this.d).a).getGuidance().getWindshield().addListener(qmjVar);
                this.e = qmjVar;
                break;
        }
    }

    public rmj(ssr ssrVar, fmj fmjVar) {
        super(ssrVar, "directions_windshield_listener");
        this.d = fmjVar;
    }
}
