package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class hc0 {
    public int AvO7iQsrTN;
    public int EljAMC1QTz;
    public int OOA6hdeuvCS;
    public Object encWxUiV2;

    public hc0() {
        if (x51.EljAMC1QTz == null) {
            x51.EljAMC1QTz = new x51(8);
        }
    }

    public int GWasM1elztuh(int i) {
        if (i < this.AvO7iQsrTN) {
            return ((ByteBuffer) this.encWxUiV2).getShort(this.EljAMC1QTz + i);
        }
        return 0;
    }

    public void X1lG3V04pd() {
        while (true) {
            int i = this.OOA6hdeuvCS;
            ic0 ic0Var = (ic0) this.encWxUiV2;
            if (i >= ic0Var.JFJ3QoxA || ic0Var.AvO7iQsrTN[i] >= 0) {
                return;
            } else {
                this.OOA6hdeuvCS = i + 1;
            }
        }
    }

    public void Yi7zF1RB1() {
        if (((ic0) this.encWxUiV2).E7jCp8Ls != this.AvO7iQsrTN) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return this.OOA6hdeuvCS < ((ic0) this.encWxUiV2).JFJ3QoxA;
    }

    public void remove() {
        ic0 ic0Var = (ic0) this.encWxUiV2;
        Yi7zF1RB1();
        if (this.EljAMC1QTz == -1) {
            o4.jivtDDk9H("Call next() before removing element from the iterator.");
            return;
        }
        ic0Var.Yi7zF1RB1();
        ic0Var.JFJ3QoxA(this.EljAMC1QTz);
        this.EljAMC1QTz = -1;
        this.AvO7iQsrTN = ic0Var.E7jCp8Ls;
    }
}
