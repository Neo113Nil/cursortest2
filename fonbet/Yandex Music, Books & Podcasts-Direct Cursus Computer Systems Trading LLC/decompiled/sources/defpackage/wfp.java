package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class wfp {
    public static final /* synthetic */ s9f[] a;

    static {
        opi opiVar = new opi(wfp.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        ern.a.getClass();
        a = new s9f[]{opiVar, new opi(wfp.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new opi(wfp.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new opi(wfp.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new opi(wfp.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new opi(wfp.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new opi(wfp.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new opi(wfp.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new opi(wfp.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new opi(wfp.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new opi(wfp.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new opi(wfp.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new opi(wfp.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new opi(wfp.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new opi(wfp.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new opi(wfp.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new opi(wfp.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new opi(wfp.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new opi(wfp.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new opi(wfp.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new opi(wfp.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new opi(wfp.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new opi(wfp.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new opi(wfp.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new opi(wfp.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new opi(wfp.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new opi(wfp.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};
        xfp xfpVar = ufp.a;
        xfp xfpVar2 = hfp.a;
    }

    public static final xfp a(String str) {
        xfp xfpVar = new xfp(str);
        xfpVar.c = true;
        return xfpVar;
    }

    public static final xfp b(String str, Function2 function2) {
        return new xfp(str, true, function2);
    }

    public static final void c(jfp jfpVar) {
        xfp xfpVar = ufp.a;
        jfpVar.o(ufp.i, Unit.a);
    }

    public static void d(jfp jfpVar, Function1 function1) {
        jfpVar.o(hfp.a, new sa(null, function1));
    }

    public static final void e(jfp jfpVar) {
        xfp xfpVar = ufp.a;
        jfpVar.o(ufp.h, Unit.a);
    }

    public static final void f(jfp jfpVar) {
        xfp xfpVar = ufp.a;
        jfpVar.o(ufp.o, Unit.a);
    }

    public static final void g(jfp jfpVar) {
        xfp xfpVar = ufp.a;
        jfpVar.o(ufp.n, Unit.a);
    }

    public static void h(jfp jfpVar, Function0 function0) {
        jfpVar.o(hfp.b, new sa(null, function0));
    }

    public static final void i(jfp jfpVar, ky4 ky4Var) {
        xfp xfpVar = ufp.a;
        xfp xfpVar2 = ufp.f;
        s9f s9fVar = a[21];
        xfpVar2.getClass();
        jfpVar.o(xfpVar2, ky4Var);
    }

    public static final void j(jfp jfpVar, my4 my4Var) {
        xfp xfpVar = ufp.g;
        s9f s9fVar = a[22];
        xfpVar.getClass();
        jfpVar.o(xfpVar, my4Var);
    }

    public static final void k(jfp jfpVar, String str) {
        xfp xfpVar = ufp.a;
        jfpVar.o(ufp.a, t75.c(str));
    }

    public static final void l(jfp jfpVar, List list) {
        xfp xfpVar = hfp.a;
        xfp xfpVar2 = hfp.w;
        s9f s9fVar = a[26];
        xfpVar2.getClass();
        jfpVar.o(xfpVar2, list);
    }

    public static final void m(jfp jfpVar, cwo cwoVar) {
        xfp xfpVar = ufp.a;
        xfp xfpVar2 = ufp.s;
        s9f s9fVar = a[10];
        xfpVar2.getClass();
        jfpVar.o(xfpVar2, cwoVar);
    }

    public static final void n(jfp jfpVar, int i) {
        xfp xfpVar = ufp.j;
        s9f s9fVar = a[3];
        tdg tdgVar = new tdg(i);
        xfpVar.getClass();
        jfpVar.o(xfpVar, tdgVar);
    }

    public static final void o(jfp jfpVar, String str) {
        xfp xfpVar = ufp.a;
        xfp xfpVar2 = ufp.d;
        s9f s9fVar = a[2];
        xfpVar2.getClass();
        jfpVar.o(xfpVar2, str);
    }

    public static void p(jfp jfpVar, Function1 function1) {
        jfpVar.o(hfp.h, new sa(null, function1));
    }

    public static final void q(jfp jfpVar, int i) {
        xfp xfpVar = ufp.w;
        s9f s9fVar = a[12];
        meo meoVar = new meo(i);
        xfpVar.getClass();
        jfpVar.o(xfpVar, meoVar);
    }

    public static final void r(jfp jfpVar, boolean z) {
        xfp xfpVar = ufp.a;
        xfp xfpVar2 = ufp.G;
        s9f s9fVar = a[20];
        Boolean valueOf = Boolean.valueOf(z);
        xfpVar2.getClass();
        jfpVar.o(xfpVar2, valueOf);
    }

    public static final void s(jfp jfpVar, String str) {
        xfp xfpVar = ufp.a;
        xfp xfpVar2 = ufp.b;
        s9f s9fVar = a[0];
        xfpVar2.getClass();
        jfpVar.o(xfpVar2, str);
    }

    public static final void t(jfp jfpVar, String str) {
        xfp xfpVar = ufp.a;
        xfp xfpVar2 = ufp.x;
        s9f s9fVar = a[13];
        xfpVar2.getClass();
        jfpVar.o(xfpVar2, str);
    }

    public static final void u(jfp jfpVar, mn0 mn0Var) {
        xfp xfpVar = ufp.a;
        jfpVar.o(ufp.z, t75.c(mn0Var));
    }

    public static final void v(jfp jfpVar, sls slsVar) {
        xfp xfpVar = ufp.H;
        s9f s9fVar = a[23];
        xfpVar.getClass();
        jfpVar.o(xfpVar, slsVar);
    }

    public static final void w(jfp jfpVar) {
        xfp xfpVar = ufp.m;
        s9f s9fVar = a[6];
        Boolean bool = Boolean.TRUE;
        xfpVar.getClass();
        jfpVar.o(xfpVar, bool);
    }

    public static final void x(jfp jfpVar, float f) {
        xfp xfpVar = ufp.a;
        xfp xfpVar2 = ufp.r;
        s9f s9fVar = a[9];
        Float valueOf = Float.valueOf(f);
        xfpVar2.getClass();
        jfpVar.o(xfpVar2, valueOf);
    }

    public static final void y(jfp jfpVar, cwo cwoVar) {
        xfp xfpVar = ufp.a;
        xfp xfpVar2 = ufp.t;
        s9f s9fVar = a[11];
        xfpVar2.getClass();
        jfpVar.o(xfpVar2, cwoVar);
    }
}
