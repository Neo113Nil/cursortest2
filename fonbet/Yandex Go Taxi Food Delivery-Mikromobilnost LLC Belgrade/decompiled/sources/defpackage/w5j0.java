package defpackage;

import androidx.compose.ui.input.pointer.PointerInteropFilter;

/* loaded from: classes.dex */
public final class w5j0 implements tls {
    public PointerInteropFilter a;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PointerInteropFilter pointerInteropFilter = this.a;
        if (pointerInteropFilter != null) {
            pointerInteropFilter.c = booleanValue;
        }
        return zy11.a;
    }
}
