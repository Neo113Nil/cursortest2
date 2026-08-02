package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class sbj implements e9e {
    public final /* synthetic */ int a;

    public /* synthetic */ sbj(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v68 a73, still in use, count: 2, list:
          (r1v68 a73) from 0x00ab: MOVE (r20v1 a73) = (r1v68 a73)
          (r1v68 a73) from 0x009f: MOVE (r20v5 a73) = (r1v68 a73)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.e9e
    public final void accept(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 2966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbj.accept(java.lang.Object):void");
    }
}
