package com.robinhood.spark;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public final class SparkEventPaths {
    public LinkedList paths = new LinkedList();

    public final void reset() {
        LinkedList linkedList = this.paths;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((SparkEventPath) it.next()).path.reset();
        }
        linkedList.clear();
    }
}
