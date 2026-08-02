package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class GroupedLinkedMap$LinkedEntry {
    public final Object key;
    public ArrayList values;
    public GroupedLinkedMap$LinkedEntry prev = this;
    public GroupedLinkedMap$LinkedEntry next = this;

    public GroupedLinkedMap$LinkedEntry(Poolable poolable) {
        this.key = poolable;
    }
}
