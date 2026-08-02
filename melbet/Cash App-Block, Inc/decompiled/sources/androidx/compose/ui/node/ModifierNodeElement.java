package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElement;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public abstract class ModifierNodeElement implements Modifier.Element {
    public static final int $stable = 0;
    private InspectorInfo _inspectorValues;

    public abstract Modifier.Node create();

    public final Sequence<ValueElement> getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    public final InspectorInfo getInspectorValues() {
        InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo != null) {
            return inspectorInfo;
        }
        InspectorInfo inspectorInfo2 = new InspectorInfo();
        inspectorInfo2.setName(Reflection.factory.getOrCreateKotlinClass(getClass()).getSimpleName());
        inspectableProperties(inspectorInfo2);
        this._inspectorValues = inspectorInfo2;
        return inspectorInfo2;
    }

    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        List sortedWith = ArraysKt___ArraysKt.sortedWith(getClass().getDeclaredFields(), new ViewPager.AnonymousClass1(2));
        int size = sortedWith.size();
        for (int i = 0; i < size; i++) {
            Field field = (Field) sortedWith.get(i);
            if (!field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    inspectorInfo.getProperties().set(field.get(this), field.getName());
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }

    public abstract void update(Modifier.Node node);
}
