package com.airbnb.lottie.compose;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\f\u0010\u0018\u001a\u00020\u0016*\u00020\u0019H\u0016R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "create", "equals", "", "other", "", "hashCode", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LottieAnimationSizeElement extends ModifierNodeElement {
    public static final int $stable = 0;
    private final int height;
    private final int width;

    public LottieAnimationSizeElement(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ LottieAnimationSizeElement copy$default(LottieAnimationSizeElement lottieAnimationSizeElement, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = lottieAnimationSizeElement.width;
        }
        if ((i3 & 2) != 0) {
            i2 = lottieAnimationSizeElement.height;
        }
        return lottieAnimationSizeElement.copy(i, i2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* bridge */ /* synthetic */ boolean all(Function1 function1) {
        return super.all(function1);
    }

    public boolean any(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final LottieAnimationSizeElement copy(int width, int height) {
        return new LottieAnimationSizeElement(width, height);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LottieAnimationSizeNode create() {
        return new LottieAnimationSizeNode(this.width, this.height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) other;
        return this.width == lottieAnimationSizeElement.width && this.height == lottieAnimationSizeElement.height;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public Object foldIn(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public Object foldOut(Object obj, Function2 function2) {
        return function2.invoke(this, obj);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.getClass();
        inspectorInfo.setName("Lottie Size");
        inspectorInfo.getProperties().set(Integer.valueOf(this.width), "width");
        inspectorInfo.getProperties().set(Integer.valueOf(this.height), "height");
    }

    @Override // androidx.compose.ui.Modifier
    public /* bridge */ /* synthetic */ Modifier then(Modifier modifier) {
        return super.then(modifier);
    }

    public String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.width, this.height, "LottieAnimationSizeElement(width=", ", height=", ")");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LottieAnimationSizeNode node) {
        node.getClass();
        node.setWidth(this.width);
        node.setHeight(this.height);
    }
}
