package androidx.compose.ui.node;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.layout.VerticalRuler;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class RulerTrackingMap {
    public Object layoutNodes;
    public Object newRulers;
    public int size;
    public Object rulers = new VerticalRuler[32];
    public Object values = new float[32];
    public Serializable accessFlags = new byte[32];

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    public RulerTrackingMap() {
        MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
        this.layoutNodes = new MutableScatterSet();
        this.newRulers = new MutableScatterSet();
    }
}
