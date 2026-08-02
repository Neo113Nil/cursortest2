package defpackage;

/* loaded from: classes3.dex */
public abstract class xd4 implements olm {
    public abstract boolean a(char c);

    @Override // defpackage.olm
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
