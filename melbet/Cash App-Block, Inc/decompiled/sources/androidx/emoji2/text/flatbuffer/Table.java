package androidx.emoji2.text.flatbuffer;

import androidx.transition.Transition;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class Table {
    public ByteBuffer bb;
    public int bb_pos;
    public int vtable_size;
    public int vtable_start;

    public Table() {
        if (Transition.AnonymousClass1.DEFAULT == null) {
            Transition.AnonymousClass1.DEFAULT = new Transition.AnonymousClass1();
        }
    }

    public final int __offset(int i) {
        if (i < this.vtable_size) {
            return this.bb.getShort(this.vtable_start + i);
        }
        return 0;
    }
}
