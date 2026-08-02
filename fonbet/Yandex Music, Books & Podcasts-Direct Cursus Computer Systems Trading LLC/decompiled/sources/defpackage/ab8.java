package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class ab8 extends x6 {
    public final /* synthetic */ int c = 0;
    public final Object d;
    public final Object e;

    public ab8(wac wacVar) {
        this.e = wacVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.d = arrayDeque;
        File file = wacVar.a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (!file.isFile()) {
            this.a = 2;
        } else {
            file.getClass();
            arrayDeque.push(new tac(file));
        }
    }

    @Override // defpackage.x6
    public final void a() {
        File file;
        File a;
        switch (this.c) {
            case 0:
                Iterator it = (Iterator) this.d;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((HashSet) this.e).add(next)) {
                        this.b = next;
                        this.a = 1;
                        break;
                    }
                }
                this.a = 2;
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.d;
                while (true) {
                    vac vacVar = (vac) arrayDeque.peek();
                    if (vacVar == null) {
                        file = null;
                    } else {
                        a = vacVar.a();
                        if (a == null) {
                            arrayDeque.pop();
                        } else if (!a.equals(vacVar.a) && a.isDirectory() && arrayDeque.size() < ((wac) this.e).f) {
                            arrayDeque.push(b(a));
                        }
                    }
                }
                file = a;
                if (file == null) {
                    this.a = 2;
                    break;
                } else {
                    this.b = file;
                    this.a = 1;
                    break;
                }
                break;
        }
    }

    public rac b(File file) {
        int ordinal = ((wac) this.e).b.ordinal();
        if (ordinal == 0) {
            return new uac(this, file);
        }
        if (ordinal == 1) {
            return new sac(this, file);
        }
        b6e.s();
        return null;
    }

    public ab8(Iterator it, s3f s3fVar) {
        it.getClass();
        this.d = it;
        this.e = new HashSet();
    }
}
