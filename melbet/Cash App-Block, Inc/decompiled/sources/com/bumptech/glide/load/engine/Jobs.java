package com.bumptech.glide.load.engine;

import io.noties.markwon.MarkwonVisitor$NodeVisitor;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class Jobs {
    public final HashMap jobs;

    public Jobs(int i) {
        switch (i) {
            case 1:
                this.jobs = new HashMap();
                break;
            default:
                this.jobs = new HashMap();
                new HashMap();
                break;
        }
    }

    public void on(Class cls, MarkwonVisitor$NodeVisitor markwonVisitor$NodeVisitor) {
        this.jobs.put(cls, markwonVisitor$NodeVisitor);
    }
}
