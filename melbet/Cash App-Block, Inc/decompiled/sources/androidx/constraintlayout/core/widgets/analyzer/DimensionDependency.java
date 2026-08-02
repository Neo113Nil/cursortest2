package androidx.constraintlayout.core.widgets.analyzer;

import java.util.Iterator;

/* loaded from: classes3.dex */
public class DimensionDependency extends DependencyNode {
    public int wrapValue;

    public DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.mType = 2;
        } else {
            this.mType = 3;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public final void resolve(int i) {
        if (this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = i;
        Iterator it = this.mDependencies.iterator();
        while (it.hasNext()) {
            Dependency dependency = (Dependency) it.next();
            dependency.update(dependency);
        }
    }
}
