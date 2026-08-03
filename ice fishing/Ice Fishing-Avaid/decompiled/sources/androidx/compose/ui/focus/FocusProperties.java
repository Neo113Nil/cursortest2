package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 A2\u00020\u0001:\u0001AR\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR$\u0010\u001e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR$\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eRB\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\t0%2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\t0%8V@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-RF\u00101\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0%¢\u0006\u0002\b02\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0%¢\u0006\u0002\b08V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-RB\u00104\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\t0%2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\t0%8V@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b5\u0010)\u001a\u0004\b6\u0010+\"\u0004\b7\u0010-RF\u00108\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0%¢\u0006\u0002\b02\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0%¢\u0006\u0002\b08V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010+\"\u0004\b:\u0010-R$\u0010<\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "", "canFocus", "", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "_", "Landroidx/compose/ui/focus/FocusRequester;", "next", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "previous", "getPrevious", "setPrevious", "up", "getUp", "setUp", "down", "getDown", "setDown", "left", "getLeft", "setLeft", "right", "getRight", "setRight", "start", "getStart", "setStart", "end", "getEnd", "setEnd", "value", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "enter", "getEnter$annotations", "()V", "getEnter", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "", "Lkotlin/ExtensionFunctionType;", "onEnter", "getOnEnter", "setOnEnter", "exit", "getExit$annotations", "getExit", "setExit", "onExit", "getOnExit", "setOnExit", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "getFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "setFocusRect", "(Landroidx/compose/ui/geometry/Rect;)V", "Companion", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public interface FocusProperties {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean getCanFocus();

    FocusRequester getDown();

    FocusRequester getEnd();

    Function1<FocusDirection, FocusRequester> getEnter();

    Function1<FocusDirection, FocusRequester> getExit();

    Rect getFocusRect();

    FocusRequester getLeft();

    FocusRequester getNext();

    Function1<FocusEnterExitScope, Unit> getOnEnter();

    Function1<FocusEnterExitScope, Unit> getOnExit();

    FocusRequester getPrevious();

    FocusRequester getRight();

    FocusRequester getStart();

    FocusRequester getUp();

    void setCanFocus(boolean z);

    void setDown(FocusRequester focusRequester);

    void setEnd(FocusRequester focusRequester);

    @Deprecated(message = "Use onEnter instead", replaceWith = @ReplaceWith(expression = "onEnter", imports = {}))
    void setEnter(Function1<? super FocusDirection, FocusRequester> function1);

    @Deprecated(message = "Use onExit instead", replaceWith = @ReplaceWith(expression = "onExit", imports = {}))
    void setExit(Function1<? super FocusDirection, FocusRequester> function1);

    void setFocusRect(Rect rect);

    void setLeft(FocusRequester focusRequester);

    void setNext(FocusRequester focusRequester);

    void setOnEnter(Function1<? super FocusEnterExitScope, Unit> function1);

    void setOnExit(Function1<? super FocusEnterExitScope, Unit> function1);

    void setPrevious(FocusRequester focusRequester);

    void setRight(FocusRequester focusRequester);

    void setStart(FocusRequester focusRequester);

    void setUp(FocusRequester focusRequester);

    /* compiled from: FocusProperties.kt */
    /* renamed from: androidx.compose.ui.focus.FocusProperties$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$setDown(FocusProperties _this, FocusRequester focusRequester) {
        }

        public static void $default$setEnd(FocusProperties _this, FocusRequester focusRequester) {
        }

        public static void $default$setFocusRect(FocusProperties _this, Rect rect) {
        }

        public static void $default$setLeft(FocusProperties _this, FocusRequester focusRequester) {
        }

        public static void $default$setNext(FocusProperties _this, FocusRequester focusRequester) {
        }

        public static void $default$setOnEnter(FocusProperties _this, Function1 function1) {
        }

        public static void $default$setOnExit(FocusProperties _this, Function1 function1) {
        }

        public static void $default$setPrevious(FocusProperties _this, FocusRequester focusRequester) {
        }

        public static void $default$setRight(FocusProperties _this, FocusRequester focusRequester) {
        }

        public static void $default$setStart(FocusProperties _this, FocusRequester focusRequester) {
        }

        public static void $default$setUp(FocusProperties _this, FocusRequester focusRequester) {
        }

        static {
            Companion companion = FocusProperties.INSTANCE;
        }

        public static /* synthetic */ void getEnter$annotations() {
        }

        public static /* synthetic */ void getExit$annotations() {
        }

        @Deprecated(message = "Use onEnter instead", replaceWith = @ReplaceWith(expression = "onEnter", imports = {}))
        public static void $default$setEnter(FocusProperties _this, Function1 function1) {
            Function1<? super FocusEnterExitScope, Unit> usingEnterExitScope;
            usingEnterExitScope = FocusPropertiesKt.toUsingEnterExitScope(function1);
            _this.setOnEnter(usingEnterExitScope);
        }

        @Deprecated(message = "Use onExit instead", replaceWith = @ReplaceWith(expression = "onExit", imports = {}))
        public static void $default$setExit(FocusProperties _this, Function1 function1) {
            Function1<? super FocusEnterExitScope, Unit> usingEnterExitScope;
            usingEnterExitScope = FocusPropertiesKt.toUsingEnterExitScope(function1);
            _this.setOnExit(usingEnterExitScope);
        }
    }

    /* compiled from: FocusProperties.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties$Companion;", "", "<init>", "()V", "UnsetFocusRect", "Landroidx/compose/ui/geometry/Rect;", "getUnsetFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Rect UnsetFocusRect = new Rect(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

        private Companion() {
        }

        public final Rect getUnsetFocusRect() {
            return UnsetFocusRect;
        }
    }
}
