package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class br extends Qr9iLBAD {
    public final /* synthetic */ f0 NCTxEWno;

    public br(f0 f0Var) {
        this.NCTxEWno = f0Var;
    }

    public final ar NCTxEWno(int i) {
        Matcher matcher = (Matcher) this.NCTxEWno.MdtA4re8;
        en KRabZ4CU = w30.KRabZ4CU(matcher.start(i), matcher.end(i));
        if (KRabZ4CU.NCTxEWno < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new ar(group, KRabZ4CU);
    }

    @Override // defpackage.Qr9iLBAD, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof ar) {
            return super.contains((ar) obj);
        }
        return false;
    }

    @Override // defpackage.Qr9iLBAD, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new nd0(new nb0(new e6(0, new en(0, size() - 1, 1)), new b2ZJblxo(2, this), 1));
    }

    @Override // defpackage.Qr9iLBAD
    public final int qoPGr6Ce() {
        return ((Matcher) this.NCTxEWno.MdtA4re8).groupCount() + 1;
    }
}
