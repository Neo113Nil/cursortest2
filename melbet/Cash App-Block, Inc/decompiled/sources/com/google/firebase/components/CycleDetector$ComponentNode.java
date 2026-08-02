package com.google.firebase.components;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class CycleDetector$ComponentNode {
    public final Component component;
    public final HashSet dependencies = new HashSet();
    public final HashSet dependents = new HashSet();

    public CycleDetector$ComponentNode(Component component) {
        this.component = component;
    }
}
