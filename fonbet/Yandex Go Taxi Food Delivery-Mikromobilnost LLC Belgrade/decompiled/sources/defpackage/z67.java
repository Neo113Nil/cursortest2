package defpackage;

import java.io.File;

/* loaded from: classes10.dex */
public class z67 implements q430 {

    public static class a implements r430 {
        @Override // defpackage.r430
        public final q430 a(ul40 ul40Var) {
            return new z67();
        }
    }

    @Override // defpackage.q430
    public final p430 a(Object obj, int i, int i2, mg70 mg70Var) {
        File file = (File) obj;
        return new p430(new lp60(file), new y67(0, file));
    }

    @Override // defpackage.q430
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
