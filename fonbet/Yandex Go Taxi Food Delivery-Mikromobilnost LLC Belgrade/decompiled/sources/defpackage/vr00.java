package defpackage;

/* loaded from: classes14.dex */
public interface vr00 extends rr00 {
    @Override // defpackage.e6v
    default String getId() {
        return getModel().getId();
    }

    w201 getModel();
}
