package com.google.android.material.timepicker;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2733b;

    public /* synthetic */ g(int i, Object obj) {
        this.f2732a = i;
        this.f2733b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2732a) {
            case 0:
                Object obj = ((MaterialTimePicker) this.f2733b).f2714u0;
                if (obj instanceof r) {
                    ((r) obj).b();
                    break;
                }
                break;
            default:
                ((j) this.f2733b).n();
                break;
        }
    }
}
