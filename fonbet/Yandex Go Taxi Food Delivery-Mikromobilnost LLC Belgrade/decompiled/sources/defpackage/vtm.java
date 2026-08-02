package defpackage;

import com.yx360.design.compose.atoms.topbar.DsTopBar$ScrollBehavior$State$LastScrollDirection;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class vtm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DsTopBar$ScrollBehavior$State$LastScrollDirection.values().length];
        try {
            iArr[DsTopBar$ScrollBehavior$State$LastScrollDirection.Down.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsTopBar$ScrollBehavior$State$LastScrollDirection.Up.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DsTopBar$ScrollBehavior$State$LastScrollDirection.None.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
