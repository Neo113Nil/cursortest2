package androidx.compose.foundation.text.selection;

import androidx.autofill.HintConstants;
import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SelectionManager.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u009a\u0001\u001a\u00020\u0017H\u0002J\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009c\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0000¢\u0006\u0003\b\u009f\u0001J\t\u0010 \u0001\u001a\u00020\u0017H\u0002J\u000f\u0010¡\u0001\u001a\u00020SH\u0000¢\u0006\u0003\b¢\u0001J:\u0010£\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\b0¥\u00010¤\u00012\b\u0010¦\u0001\u001a\u00030§\u00012\t\u0010¨\u0001\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0003\b©\u0001J\u000f\u0010ª\u0001\u001a\u00020\u0010H\u0000¢\u0006\u0003\b«\u0001J\u000f\u0010¬\u0001\u001a\u00020\u0017H\u0000¢\u0006\u0003\b\u00ad\u0001J\u000f\u0010®\u0001\u001a\u00020\u0010H\u0000¢\u0006\u0003\b¯\u0001J\u000f\u0010°\u0001\u001a\u00020\u0010H\u0000¢\u0006\u0003\b±\u0001J\u0011\u0010²\u0001\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0003\b³\u0001J\u001f\u0010´\u0001\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0005\u0012\u00030µ\u0001\u0018\u00010¤\u0001H\u0000¢\u0006\u0003\b¶\u0001J\u0083\u0001\u0010·\u0001\u001a\u00020\u00172q\b\u0004\u0010¸\u0001\u001aj\u0012\u0017\u0012\u00150§\u0001¢\u0006\u000f\bº\u0001\u0012\n\b»\u0001\u0012\u0005\b\b(¦\u0001\u0012\u0016\u0012\u00140$¢\u0006\u000f\bº\u0001\u0012\n\b»\u0001\u0012\u0005\b\b(¼\u0001\u0012\u0016\u0012\u00140µ\u0001¢\u0006\u000e\bº\u0001\u0012\t\b»\u0001\u0012\u0004\b\b(\n\u0012\u0016\u0012\u00140\u0010¢\u0006\u000f\bº\u0001\u0012\n\b»\u0001\u0012\u0005\b\b(½\u0001\u0012\u0004\u0012\u00020\u00100¹\u0001H\u0080\b¢\u0006\u0003\b¾\u0001J\u000f\u0010¿\u0001\u001a\u00020\u0017H\u0000¢\u0006\u0003\bÀ\u0001J\t\u0010Ä\u0001\u001a\u00020\u0017H\u0002J\t\u0010Å\u0001\u001a\u00020\u0017H\u0002J\u000f\u0010Æ\u0001\u001a\u00020\u0010H\u0000¢\u0006\u0003\bÇ\u0001J\t\u0010È\u0001\u001a\u00020\u0017H\u0002J\u000b\u0010É\u0001\u001a\u0004\u0018\u00010JH\u0002J\u0007\u0010Ê\u0001\u001a\u00020\u0017J\u0011\u0010Ë\u0001\u001a\u00030Ì\u00012\u0007\u0010Í\u0001\u001a\u00020\u0010J\r\u0010Î\u0001\u001a\u00020F*\u00020FH\u0002J\u001d\u0010Ï\u0001\u001a\u00020F*\u00020F2\u000e\u0010¸\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170Ð\u0001H\u0002J$\u0010Ñ\u0001\u001a\u00020R2\u0007\u0010Ò\u0001\u001a\u00020S2\u0007\u0010Ó\u0001\u001a\u00020RH\u0002¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J.\u0010Ö\u0001\u001a\u00020\u00172\u0007\u0010×\u0001\u001a\u00020R2\u0007\u0010Í\u0001\u001a\u00020\u00102\b\u0010Ø\u0001\u001a\u00030Ù\u0001H\u0002¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J8\u0010Ü\u0001\u001a\u00020\u00102\t\u0010Ý\u0001\u001a\u0004\u0018\u00010R2\u0006\u0010Q\u001a\u00020R2\u0007\u0010Í\u0001\u001a\u00020\u00102\b\u0010Ø\u0001\u001a\u00030Ù\u0001H\u0000¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J7\u0010Ü\u0001\u001a\u00020\u00102\u0007\u0010×\u0001\u001a\u00020R2\u0007\u0010à\u0001\u001a\u00020R2\u0007\u0010Í\u0001\u001a\u00020\u00102\b\u0010Ø\u0001\u001a\u00030Ù\u0001H\u0000¢\u0006\u0006\bá\u0001\u0010â\u0001J0\u0010ã\u0001\u001a\u0005\u0018\u00010\u0087\u00012\u0007\u0010×\u0001\u001a\u00020R2\u0007\u0010à\u0001\u001a\u00020R2\u0007\u0010Í\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0006\bä\u0001\u0010å\u0001J\u001c\u0010æ\u0001\u001a\u00020\u00172\b\u0010ç\u0001\u001a\u00030\u0087\u00012\u0007\u0010è\u0001\u001a\u00020\bH\u0002J\u000f\u0010é\u0001\u001a\u00020\u0010H\u0001¢\u0006\u0003\bê\u0001J\u0018\u0010ë\u0001\u001a\u00020\u00172\u0007\u0010×\u0001\u001a\u00020R¢\u0006\u0005\bì\u0001\u0010cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R@\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00170\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010#\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u00020.8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R+\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b=\u0010\u0012\"\u0004\b>\u0010\u0014R\u0014\u0010A\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0012R\u001a\u0010B\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0012\"\u0004\bD\u0010\u0014R\u0011\u0010E\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001d\u0010I\u001a\u0004\u0018\u00010J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bK\u0010LR\u0011\u0010O\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\bP\u0010HR\u0010\u0010Q\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010T\u001a\u0004\u0018\u00010S2\b\u0010\t\u001a\u0004\u0018\u00010S@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR+\u0010Y\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010@\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R+\u0010_\u001a\u00020R2\u0006\u0010;\u001a\u00020R8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010@\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR+\u0010e\u001a\u00020R2\u0006\u0010;\u001a\u00020R8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bh\u0010@\u001a\u0004\bf\u0010a\"\u0004\bg\u0010cR/\u0010i\u001a\u0004\u0018\u00010R2\b\u0010;\u001a\u0004\u0018\u00010R8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bn\u0010@\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR/\u0010o\u001a\u0004\u0018\u00010R2\b\u0010;\u001a\u0004\u0018\u00010R8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010@\u001a\u0004\bp\u0010k\"\u0004\bq\u0010mR/\u0010t\u001a\u0004\u0018\u00010s2\b\u0010;\u001a\u0004\u0018\u00010s8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010@\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0011\u0010z\u001a\u00020{8F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0011\u0010~\u001a\u00020{8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010}R3\u0010\u0080\u0001\u001a\u0004\u0018\u00010R2\b\u0010;\u001a\u0004\u0018\u00010R8F@BX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010@\u001a\u0005\b\u0081\u0001\u0010k\"\u0005\b\u0082\u0001\u0010mR\u0016\u0010\u0084\u0001\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u0012R-\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b\u0088\u0001\u00100\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u000f\u0010\u008d\u0001\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\"\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R'\u0010Á\u0001\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@@X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÂ\u0001\u0010\u0012\"\u0005\bÃ\u0001\u0010\u0014¨\u0006í\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "_selection", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/selection/Selection;", "value", "selection", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "_isInTouchMode", "", "isInTouchMode", "()Z", "setInTouchMode", "(Z)V", "newOnSelectionChange", "Lkotlin/Function1;", "", "onSelectionChange", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "onCopyHandler", "Landroidx/compose/ui/text/AnnotatedString;", "getOnCopyHandler", "setOnCopyHandler", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "toolbarRequester", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "getToolbarRequester$foundation$annotations", "()V", "getToolbarRequester$foundation", "()Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "setToolbarRequester$foundation", "(Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;)V", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "<set-?>", "hasFocus", "getHasFocus", "setHasFocus", "hasFocus$delegate", "Landroidx/compose/runtime/MutableState;", "isDraggingInProgress", "shouldIgnoreCopyKeyEvent", "getShouldIgnoreCopyKeyEvent$foundation", "setShouldIgnoreCopyKeyEvent$foundation", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "derivedContentRect", "Landroidx/compose/ui/geometry/Rect;", "getDerivedContentRect", "()Landroidx/compose/ui/geometry/Rect;", "derivedContentRect$delegate", "Landroidx/compose/runtime/State;", "contextMenuAreaModifier", "getContextMenuAreaModifier", "previousPosition", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "getContainerLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "positionChangeState", "getPositionChangeState", "()Lkotlin/Unit;", "setPositionChangeState", "(Lkotlin/Unit;)V", "positionChangeState$delegate", "dragBeginPosition", "getDragBeginPosition-F1C5BW0$foundation", "()J", "setDragBeginPosition-k-4lQ0M", "(J)V", "dragBeginPosition$delegate", "dragTotalDistance", "getDragTotalDistance-F1C5BW0$foundation", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance$delegate", "startHandlePosition", "getStartHandlePosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setStartHandlePosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "startHandlePosition$delegate", "endHandlePosition", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "endHandlePosition$delegate", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "startHandleLineHeight", "", "getStartHandleLineHeight", "()F", "endHandleLineHeight", "getEndHandleLineHeight", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "setCurrentDragPosition-_kEHs6E", "currentDragPosition$delegate", "shouldShowMagnifier", "getShouldShowMagnifier", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getPreviousSelectionLayout$foundation$annotations", "getPreviousSelectionLayout$foundation", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "setPreviousSelectionLayout$foundation", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)V", "isLongPressOrClickSelection", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$foundation", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope$foundation", "(Lkotlinx/coroutines/CoroutineScope;)V", "platformSelectionBehaviors", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "getPlatformSelectionBehaviors$foundation", "()Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "setPlatformSelectionBehaviors$foundation", "(Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;)V", "suggestSelectionForLongPressOrDoubleClick", "getAnchorSelectable", "Landroidx/compose/foundation/text/selection/Selectable;", "anchor", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getAnchorSelectable$foundation", "updateHandleOffsets", "requireContainerCoordinates", "requireContainerCoordinates$foundation", "selectAllInSelectable", "Lkotlin/Pair;", "Landroidx/collection/LongObjectMap;", "selectableId", "", "previousSelection", "selectAllInSelectable$foundation", "isEntireContainerSelected", "isEntireContainerSelected$foundation", "selectAll", "selectAll$foundation", "isTriviallyCollapsedSelection", "isTriviallyCollapsedSelection$foundation", "isNonEmptySelection", "isNonEmptySelection$foundation", "getSelectedText", "getSelectedText$foundation", "getContextTextAndSelection", "Landroidx/compose/ui/text/TextRange;", "getContextTextAndSelection$foundation", "forEachSelectableWithSelection", "block", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "text", "isLastSelectable", "forEachSelectableWithSelection$foundation", "copy", "copy$foundation", "showToolbar", "getShowToolbar$foundation", "setShowToolbar$foundation", "toolbarCopy", "updateSelectionToolbar", "canCopy", "canCopy$foundation", "updateSelectionTextToolbar", "getContentRect", "onRelease", "handleDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "isStartHandle", "addContextMenuComponents", "onClearSelectionRequested", "Lkotlin/Function0;", "convertToContainerCoordinates", "layoutCoordinates", "offset", "convertToContainerCoordinates-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "startSelection", "position", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "startSelection-9KIMszo", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "updateSelection", "newPosition", "updateSelection-qNKwrvQ$foundation", "(Landroidx/compose/ui/geometry/Offset;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "previousHandlePosition", "updateSelection-jyLRC_s$foundation", "(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "getSelectionLayout", "getSelectionLayout-Wko1d7g", "(JJZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "selectionChanged", "selectionLayout", "newSelection", "shouldPerformHaptics", "shouldPerformHaptics$foundation", "selectWordAtPositionIfNotAlreadySelected", "selectWordAtPositionIfNotAlreadySelected-k-4lQ0M", "foundation"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SelectionManager {
    public static final int $stable = 8;
    private LayoutCoordinates containerLayoutCoordinates;
    private CoroutineScope coroutineScope;
    private HapticFeedback hapticFeedBack;
    private boolean isLongPressOrClickSelection;
    private Function1<? super AnnotatedString, Unit> onCopyHandler;
    private PlatformSelectionBehaviors platformSelectionBehaviors;
    private Offset previousPosition;
    private SelectionLayout previousSelectionLayout;
    private final SelectionRegistrarImpl selectionRegistrar;
    private boolean shouldIgnoreCopyKeyEvent;
    private boolean showToolbar;
    private TextToolbar textToolbar;
    private final MutableState<Selection> _selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState<Boolean> _isInTouchMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private Function1<? super Selection, Unit> onSelectionChange = new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit onSelectionChange$lambda$0;
            onSelectionChange$lambda$0 = SelectionManager.onSelectionChange$lambda$0(SelectionManager.this, (Selection) obj);
            return onSelectionChange$lambda$0;
        }
    };
    private ToolbarRequester toolbarRequester = new ToolbarRequesterImpl();
    private FocusRequester focusRequester = new FocusRequester();

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final MutableState hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: derivedContentRect$delegate, reason: from kotlin metadata */
    private final State derivedContentRect = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Rect contentRect;
            contentRect = SelectionManager.this.getContentRect();
            return contentRect;
        }
    });

    /* renamed from: positionChangeState$delegate, reason: from kotlin metadata */
    private final MutableState positionChangeState = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());

    /* renamed from: dragBeginPosition$delegate, reason: from kotlin metadata */
    private final MutableState dragBeginPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m6508boximpl(Offset.INSTANCE.m6535getZeroF1C5BW0()), null, 2, null);

    /* renamed from: dragTotalDistance$delegate, reason: from kotlin metadata */
    private final MutableState dragTotalDistance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m6508boximpl(Offset.INSTANCE.m6535getZeroF1C5BW0()), null, 2, null);

    /* renamed from: startHandlePosition$delegate, reason: from kotlin metadata */
    private final MutableState startHandlePosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: endHandlePosition$delegate, reason: from kotlin metadata */
    private final MutableState endHandlePosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public static /* synthetic */ void getPreviousSelectionLayout$foundation$annotations() {
    }

    public static /* synthetic */ void getToolbarRequester$foundation$annotations() {
    }

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        this.selectionRegistrar = selectionRegistrarImpl;
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation(new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$0;
                _init_$lambda$0 = SelectionManager._init_$lambda$0(SelectionManager.this, ((Long) obj).longValue());
                return _init_$lambda$0;
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation(new Function4() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Unit _init_$lambda$1;
                _init_$lambda$1 = SelectionManager._init_$lambda$1(SelectionManager.this, ((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, (Offset) obj3, (SelectionAdjustment) obj4);
                return _init_$lambda$1;
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation(new Function2() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit _init_$lambda$2;
                _init_$lambda$2 = SelectionManager._init_$lambda$2(SelectionManager.this, ((Boolean) obj).booleanValue(), ((Long) obj2).longValue());
                return _init_$lambda$2;
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation(new Function6() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                boolean _init_$lambda$3;
                _init_$lambda$3 = SelectionManager._init_$lambda$3(SelectionManager.this, ((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, (Offset) obj3, (Offset) obj4, ((Boolean) obj5).booleanValue(), (SelectionAdjustment) obj6);
                return Boolean.valueOf(_init_$lambda$3);
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation(new Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$4;
                _init_$lambda$4 = SelectionManager._init_$lambda$4(SelectionManager.this);
                return _init_$lambda$4;
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation(new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$5;
                _init_$lambda$5 = SelectionManager._init_$lambda$5(SelectionManager.this, ((Long) obj).longValue());
                return _init_$lambda$5;
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation(new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$6;
                _init_$lambda$6 = SelectionManager._init_$lambda$6(SelectionManager.this, ((Long) obj).longValue());
                return _init_$lambda$6;
            }
        });
    }

    public final Selection getSelection() {
        return this._selection.getValue();
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final boolean isInTouchMode() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final void setInTouchMode(boolean z) {
        if (this._isInTouchMode.getValue().booleanValue() != z) {
            this._isInTouchMode.setValue(Boolean.valueOf(z));
            updateSelectionToolbar();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSelectionChange$lambda$0(SelectionManager selectionManager, Selection selection) {
        selectionManager.setSelection(selection);
        return Unit.INSTANCE;
    }

    public final Function1<Selection, Unit> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final void setOnSelectionChange(final Function1<? super Selection, Unit> function1) {
        this.onSelectionChange = new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _set_onSelectionChange_$lambda$0;
                _set_onSelectionChange_$lambda$0 = SelectionManager._set_onSelectionChange_$lambda$0(SelectionManager.this, function1, (Selection) obj);
                return _set_onSelectionChange_$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_onSelectionChange_$lambda$0(SelectionManager selectionManager, Function1 function1, Selection selection) {
        selectionManager.setSelection(selection);
        function1.invoke(selection);
        return Unit.INSTANCE;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final Function1<AnnotatedString, Unit> getOnCopyHandler() {
        return this.onCopyHandler;
    }

    public final void setOnCopyHandler(Function1<? super AnnotatedString, Unit> function1) {
        this.onCopyHandler = function1;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    /* renamed from: getToolbarRequester$foundation, reason: from getter */
    public final ToolbarRequester getToolbarRequester() {
        return this.toolbarRequester;
    }

    public final void setToolbarRequester$foundation(ToolbarRequester toolbarRequester) {
        this.toolbarRequester = toolbarRequester;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDraggingInProgress() {
        return getDraggingHandle() != null;
    }

    /* renamed from: getShouldIgnoreCopyKeyEvent$foundation, reason: from getter */
    public final boolean getShouldIgnoreCopyKeyEvent() {
        return this.shouldIgnoreCopyKeyEvent;
    }

    public final void setShouldIgnoreCopyKeyEvent$foundation(boolean z) {
        this.shouldIgnoreCopyKeyEvent = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_modifier_$lambda$0(SelectionManager selectionManager) {
        selectionManager.onRelease();
        return Unit.INSTANCE;
    }

    public final Modifier getModifier() {
        return addContextMenuComponents(KeyInputModifierKt.onKeyEvent(SelectionGesturesKt.updateSelectionTouchMode(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(Modifier.INSTANCE, new Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _get_modifier_$lambda$0;
                _get_modifier_$lambda$0 = SelectionManager._get_modifier_$lambda$0(SelectionManager.this);
                return _get_modifier_$lambda$0;
            }
        }), new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _get_modifier_$lambda$1;
                _get_modifier_$lambda$1 = SelectionManager._get_modifier_$lambda$1(SelectionManager.this, (LayoutCoordinates) obj);
                return _get_modifier_$lambda$1;
            }
        }), this.focusRequester), new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _get_modifier_$lambda$2;
                _get_modifier_$lambda$2 = SelectionManager._get_modifier_$lambda$2(SelectionManager.this, (FocusState) obj);
                return _get_modifier_$lambda$2;
            }
        }), false, null, 3, null), new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _get_modifier_$lambda$3;
                _get_modifier_$lambda$3 = SelectionManager._get_modifier_$lambda$3(SelectionManager.this, ((Boolean) obj).booleanValue());
                return _get_modifier_$lambda$3;
            }
        }), new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m2387invokeZmokQxo(keyEvent.m7966unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m2387invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (SelectionManager.this.getShouldIgnoreCopyKeyEvent() || !SelectionManager_androidKt.m2394isCopyKeyEventZmokQxo(keyEvent)) {
                    z = false;
                } else {
                    SelectionManager.this.copy$foundation();
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).then(getShouldShowMagnifier() ? SelectionManager_androidKt.selectionMagnifier(Modifier.INSTANCE, this) : Modifier.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_modifier_$lambda$1(SelectionManager selectionManager, LayoutCoordinates layoutCoordinates) {
        selectionManager.setContainerLayoutCoordinates(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_modifier_$lambda$2(SelectionManager selectionManager, FocusState focusState) {
        if (!focusState.getHasFocus() && selectionManager.getHasFocus()) {
            selectionManager.onRelease();
        }
        selectionManager.setHasFocus(focusState.getHasFocus());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_modifier_$lambda$3(SelectionManager selectionManager, boolean z) {
        selectionManager.setInTouchMode(z);
        return Unit.INSTANCE;
    }

    private final Rect getDerivedContentRect() {
        return (Rect) this.derivedContentRect.getValue();
    }

    public final Modifier getContextMenuAreaModifier() {
        return TextContextMenuToolbarHandlerModifierKt.textContextMenuToolbarHandler$default(TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(Modifier.INSTANCE, new SelectionManager$contextMenuAreaModifier$1(this, null)), this.toolbarRequester, new SelectionManager$contextMenuAreaModifier$2(this, null), null, new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Rect _get_contextMenuAreaModifier_$lambda$0;
                _get_contextMenuAreaModifier_$lambda$0 = SelectionManager._get_contextMenuAreaModifier_$lambda$0(SelectionManager.this, (LayoutCoordinates) obj);
                return _get_contextMenuAreaModifier_$lambda$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect _get_contextMenuAreaModifier_$lambda$0(SelectionManager selectionManager, LayoutCoordinates layoutCoordinates) {
        Rect derivedContentRect = selectionManager.getDerivedContentRect();
        if (derivedContentRect == null) {
            return null;
        }
        LayoutCoordinates layoutCoordinates2 = selectionManager.containerLayoutCoordinates;
        if (layoutCoordinates2 != null) {
            return TextContextMenuToolbarHandlerModifierKt.translateRootToDestination(derivedContentRect, layoutCoordinates2, layoutCoordinates);
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset m6508boximpl = layoutCoordinates != null ? Offset.m6508boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (Intrinsics.areEqual(this.previousPosition, m6508boximpl)) {
            return;
        }
        this.previousPosition = m6508boximpl;
        updateHandleOffsets();
        updateSelectionToolbar();
    }

    private final Unit getPositionChangeState() {
        this.positionChangeState.getValue();
        return Unit.INSTANCE;
    }

    private final void setPositionChangeState(Unit unit) {
        this.positionChangeState.setValue(unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m2373setDragBeginPositionk4lQ0M(long j) {
        this.dragBeginPosition.setValue(Offset.m6508boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragBeginPosition-F1C5BW0$foundation, reason: not valid java name */
    public final long m2379getDragBeginPositionF1C5BW0$foundation() {
        return ((Offset) this.dragBeginPosition.getValue()).m6529unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m2374setDragTotalDistancek4lQ0M(long j) {
        this.dragTotalDistance.setValue(Offset.m6508boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragTotalDistance-F1C5BW0$foundation, reason: not valid java name */
    public final long m2380getDragTotalDistanceF1C5BW0$foundation() {
        return ((Offset) this.dragTotalDistance.getValue()).m6529unboximpl();
    }

    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    private final void m2376setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m2382getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition.getValue();
    }

    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    private final void m2375setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m2381getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    public final float getStartHandleLineHeight() {
        Selectable anchorSelectable$foundation;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation = getAnchorSelectable$foundation(selection.getStart())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation.getLineHeight(selection.getStart().getOffset());
    }

    public final float getEndHandleLineHeight() {
        Selectable anchorSelectable$foundation;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation = getAnchorSelectable$foundation(selection.getEnd())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation.getLineHeight(selection.getEnd().getOffset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m2372setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m2378getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    private final boolean getShouldShowMagnifier() {
        return isDraggingInProgress() && isInTouchMode() && !isTriviallyCollapsedSelection$foundation();
    }

    /* renamed from: getPreviousSelectionLayout$foundation, reason: from getter */
    public final SelectionLayout getPreviousSelectionLayout() {
        return this.previousSelectionLayout;
    }

    public final void setPreviousSelectionLayout$foundation(SelectionLayout selectionLayout) {
        this.previousSelectionLayout = selectionLayout;
    }

    /* renamed from: getCoroutineScope$foundation, reason: from getter */
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final void setCoroutineScope$foundation(CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
    }

    /* renamed from: getPlatformSelectionBehaviors$foundation, reason: from getter */
    public final PlatformSelectionBehaviors getPlatformSelectionBehaviors() {
        return this.platformSelectionBehaviors;
    }

    public final void setPlatformSelectionBehaviors$foundation(PlatformSelectionBehaviors platformSelectionBehaviors) {
        this.platformSelectionBehaviors = platformSelectionBehaviors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(SelectionManager selectionManager, long j) {
        if (selectionManager.selectionRegistrar.getSubselections().containsKey(j)) {
            selectionManager.setPositionChangeState(Unit.INSTANCE);
            selectionManager.updateHandleOffsets();
            selectionManager.updateSelectionToolbar();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(SelectionManager selectionManager, boolean z, LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
        long m2165coerceIn3MmeM6k;
        long mo8287getSizeYbymL2g = layoutCoordinates.mo8287getSizeYbymL2g();
        Rect rect = new Rect(0.0f, 0.0f, (int) (mo8287getSizeYbymL2g >> 32), (int) (mo8287getSizeYbymL2g & 4294967295L));
        if (SelectionManagerKt.m2389containsInclusiveUv8p0NA(rect, offset.m6529unboximpl())) {
            m2165coerceIn3MmeM6k = offset.m6529unboximpl();
        } else {
            m2165coerceIn3MmeM6k = TextLayoutStateKt.m2165coerceIn3MmeM6k(offset.m6529unboximpl(), rect);
        }
        long m2370convertToContainerCoordinatesR5De75A = selectionManager.m2370convertToContainerCoordinatesR5De75A(layoutCoordinates, m2165coerceIn3MmeM6k);
        if ((9223372034707292159L & m2370convertToContainerCoordinatesR5De75A) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            selectionManager.setInTouchMode(z);
            selectionManager.m2377startSelection9KIMszo(m2370convertToContainerCoordinatesR5De75A, false, selectionAdjustment);
            FocusRequester.m6424requestFocus3ESFkO8$default(selectionManager.focusRequester, 0, 1, null);
            selectionManager.setShowToolbar$foundation(false);
            selectionManager.isLongPressOrClickSelection = true;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(SelectionManager selectionManager, boolean z, long j) {
        Pair<Selection, LongObjectMap<Selection>> selectAllInSelectable$foundation = selectionManager.selectAllInSelectable$foundation(j, selectionManager.getSelection());
        Selection component1 = selectAllInSelectable$foundation.component1();
        LongObjectMap<Selection> component2 = selectAllInSelectable$foundation.component2();
        if (!Intrinsics.areEqual(component1, selectionManager.getSelection())) {
            selectionManager.selectionRegistrar.setSubselections(component2);
            selectionManager.onSelectionChange.invoke(component1);
        }
        selectionManager.setInTouchMode(z);
        FocusRequester.m6424requestFocus3ESFkO8$default(selectionManager.focusRequester, 0, 1, null);
        selectionManager.setShowToolbar$foundation(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$3(SelectionManager selectionManager, boolean z, LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, boolean z2, SelectionAdjustment selectionAdjustment) {
        long m2370convertToContainerCoordinatesR5De75A = selectionManager.m2370convertToContainerCoordinatesR5De75A(layoutCoordinates, offset.m6529unboximpl());
        long m2370convertToContainerCoordinatesR5De75A2 = selectionManager.m2370convertToContainerCoordinatesR5De75A(layoutCoordinates, offset2.m6529unboximpl());
        selectionManager.setInTouchMode(z);
        return selectionManager.m2385updateSelectionqNKwrvQ$foundation(Offset.m6508boximpl(m2370convertToContainerCoordinatesR5De75A), m2370convertToContainerCoordinatesR5De75A2, z2, selectionAdjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(SelectionManager selectionManager) {
        selectionManager.setShowToolbar$foundation(true);
        selectionManager.setDraggingHandle(null);
        selectionManager.m2372setCurrentDragPosition_kEHs6E(null);
        if (selectionManager.isLongPressOrClickSelection && selectionManager.isNonEmptySelection$foundation()) {
            selectionManager.suggestSelectionForLongPressOrDoubleClick();
        }
        selectionManager.isLongPressOrClickSelection = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$5(SelectionManager selectionManager, long j) {
        if (selectionManager.selectionRegistrar.getSubselections().containsKey(j)) {
            selectionManager.onRelease();
            selectionManager.setSelection(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$6(SelectionManager selectionManager, long j) {
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = selectionManager.getSelection();
        if (selection != null && (start = selection.getStart()) != null && j == start.getSelectableId()) {
            selectionManager.m2376setStartHandlePosition_kEHs6E(null);
        }
        Selection selection2 = selectionManager.getSelection();
        if (selection2 != null && (end = selection2.getEnd()) != null && j == end.getSelectableId()) {
            selectionManager.m2375setEndHandlePosition_kEHs6E(null);
        }
        if (selectionManager.selectionRegistrar.getSubselections().containsKey(j)) {
            selectionManager.updateSelectionToolbar();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, androidx.compose.ui.text.TextRange] */
    private final void suggestSelectionForLongPressOrDoubleClick() {
        int i;
        CoroutineScope coroutineScope;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.LongRef longRef = new Ref.LongRef();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ListIterator<Selectable> listIterator = sort.listIterator(sort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            Selection selection = this.selectionRegistrar.getSubselections().get(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            int size = sort.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Selectable selectable = sort.get(i2);
                Selection selection2 = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
                if (selection2 != null) {
                    ?? text = selectable.getText();
                    long TextRange = TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                    boolean z = i2 >= i;
                    long selectableId = selectable.getSelectableId();
                    if (z) {
                        objectRef.element = text;
                        objectRef2.element = TextRange.m9129boximpl(TextRange);
                        longRef.element = selectableId;
                    }
                } else {
                    i2++;
                }
            }
        }
        if (objectRef.element == 0 || objectRef2.element == 0 || longRef.element == 0 || ((CharSequence) objectRef.element).length() <= 0 || (coroutineScope = this.coroutineScope) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(this, objectRef, objectRef2, longRef, null), 3, null);
    }

    public final Selectable getAnchorSelectable$foundation(Selection.AnchorInfo anchor) {
        return this.selectionRegistrar.getSelectableMap$foundation().get(anchor.getSelectableId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.m2389containsInclusiveUv8p0NA(r8, r13) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateHandleOffsets() {
        Offset offset;
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = getSelection();
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        Offset offset2 = null;
        Selectable anchorSelectable$foundation = (selection == null || (start = selection.getStart()) == null) ? null : getAnchorSelectable$foundation(start);
        Selectable anchorSelectable$foundation2 = (selection == null || (end = selection.getEnd()) == null) ? null : getAnchorSelectable$foundation(end);
        LayoutCoordinates layoutCoordinates2 = anchorSelectable$foundation != null ? anchorSelectable$foundation.getLayoutCoordinates() : null;
        LayoutCoordinates layoutCoordinates3 = anchorSelectable$foundation2 != null ? anchorSelectable$foundation2.getLayoutCoordinates() : null;
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || (layoutCoordinates2 == null && layoutCoordinates3 == null)) {
            m2376setStartHandlePosition_kEHs6E(null);
            m2375setEndHandlePosition_kEHs6E(null);
            return;
        }
        Rect visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates);
        if (layoutCoordinates2 != null) {
            long mo2325getHandlePositiondBAh8RU = anchorSelectable$foundation.mo2325getHandlePositiondBAh8RU(selection, true);
            if ((mo2325getHandlePositiondBAh8RU & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                offset = Offset.m6508boximpl(layoutCoordinates.mo8288localPositionOfR5De75A(layoutCoordinates2, mo2325getHandlePositiondBAh8RU));
                long m6529unboximpl = offset.m6529unboximpl();
                if (getDraggingHandle() != Handle.SelectionStart) {
                }
                m2376setStartHandlePosition_kEHs6E(offset);
                if (layoutCoordinates3 != null) {
                    long mo2325getHandlePositiondBAh8RU2 = anchorSelectable$foundation2.mo2325getHandlePositiondBAh8RU(selection, false);
                    if ((9223372034707292159L & mo2325getHandlePositiondBAh8RU2) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                        Offset m6508boximpl = Offset.m6508boximpl(layoutCoordinates.mo8288localPositionOfR5De75A(layoutCoordinates3, mo2325getHandlePositiondBAh8RU2));
                        long m6529unboximpl2 = m6508boximpl.m6529unboximpl();
                        if (getDraggingHandle() == Handle.SelectionEnd || SelectionManagerKt.m2389containsInclusiveUv8p0NA(visibleBounds, m6529unboximpl2)) {
                            offset2 = m6508boximpl;
                        }
                    }
                }
                m2375setEndHandlePosition_kEHs6E(offset2);
            }
        }
        offset = null;
        m2376setStartHandlePosition_kEHs6E(offset);
        if (layoutCoordinates3 != null) {
        }
        m2375setEndHandlePosition_kEHs6E(offset2);
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                InlineClassHelperKt.throwIllegalArgumentException("unattached coordinates");
            }
            return layoutCoordinates;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null coordinates");
        throw new KotlinNothingValueException();
    }

    public final Pair<Selection, LongObjectMap<Selection>> selectAllInSelectable$foundation(long selectableId, Selection previousSelection) {
        HapticFeedback hapticFeedback;
        MutableLongObjectMap mutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        int size = sort.size();
        Selection selection = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            Selection selectAllSelection = selectable.getSelectableId() == selectableId ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                mutableLongObjectMapOf.set(selectable.getSelectableId(), selectAllSelection);
            }
            selection = SelectionManagerKt.merge(selection, selectAllSelection);
        }
        if (isInTouchMode() && !Intrinsics.areEqual(selection, previousSelection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo7577performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7594getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selection, mutableLongObjectMapOf);
    }

    public final boolean isEntireContainerSelected$foundation() {
        Selection selection;
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        if (sort.isEmpty()) {
            return true;
        }
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            AnnotatedString text = selectable.getText();
            if (text.length() != 0 && ((selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId())) == null || Math.abs(selection.getStart().getOffset() - selection.getEnd().getOffset()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final void selectAll$foundation() {
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        if (sort.isEmpty()) {
            return;
        }
        MutableLongObjectMap mutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        int size = sort.size();
        Selection selection = null;
        Selection selection2 = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            Selection selectAllSelection = selectable.getSelectAllSelection();
            if (selectAllSelection != null) {
                if (selection == null) {
                    selection = selectAllSelection;
                }
                mutableLongObjectMapOf.put(selectable.getSelectableId(), selectAllSelection);
                selection2 = selectAllSelection;
            }
        }
        if (mutableLongObjectMapOf.isEmpty()) {
            return;
        }
        if (selection != selection2) {
            Intrinsics.checkNotNull(selection);
            Selection.AnchorInfo start = selection.getStart();
            Intrinsics.checkNotNull(selection2);
            selection = new Selection(start, selection2.getEnd(), false);
        }
        this.selectionRegistrar.setSubselections(mutableLongObjectMapOf);
        this.onSelectionChange.invoke(selection);
        this.previousSelectionLayout = null;
    }

    public final boolean isTriviallyCollapsedSelection$foundation() {
        Selection selection = getSelection();
        if (selection == null) {
            return true;
        }
        return Intrinsics.areEqual(selection.getStart(), selection.getEnd());
    }

    public final boolean isNonEmptySelection$foundation() {
        Selection selection = getSelection();
        if (selection == null || Intrinsics.areEqual(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selection selection2 = this.selectionRegistrar.getSubselections().get(sort.get(i).getSelectableId());
            if (selection2 != null && selection2.getStart().getOffset() != selection2.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final AnnotatedString getSelectedText$foundation() {
        int i;
        if (getSelection() == null || this.selectionRegistrar.getSubselections().isEmpty()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ListIterator<Selectable> listIterator = sort.listIterator(sort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            Selection selection = this.selectionRegistrar.getSubselections().get(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            int size = sort.size();
            int i2 = 0;
            while (i2 < size) {
                Selectable selectable = sort.get(i2);
                Selection selection2 = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
                if (selection2 != null) {
                    AnnotatedString text = selectable.getText();
                    long TextRange = TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                    boolean z = i2 >= i;
                    selectable.getSelectableId();
                    builder.append(text, TextRange.m9139getMinimpl(TextRange), TextRange.m9138getMaximpl(TextRange));
                    if (!z) {
                        builder.append('\n');
                    }
                }
                i2++;
            }
        }
        return builder.toAnnotatedString();
    }

    public final Pair<AnnotatedString, TextRange> getContextTextAndSelection$foundation() {
        int i;
        int i2;
        int i3;
        Pair<AnnotatedString, TextRange> pair;
        Pair<AnnotatedString, TextRange> pair2 = null;
        if (getSelection() != null && !this.selectionRegistrar.getSelectables$foundation().isEmpty()) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
            ListIterator<Selectable> listIterator = sort.listIterator(sort.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                }
                Selection selection = this.selectionRegistrar.getSubselections().get(listIterator.previous().getSelectableId());
                if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            if (i != -1) {
                int size = sort.size();
                int i4 = 0;
                i2 = -1;
                i3 = -1;
                while (i4 < size) {
                    Selectable selectable = sort.get(i4);
                    Selection selection2 = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
                    if (selection2 != null) {
                        AnnotatedString text = selectable.getText();
                        long TextRange = TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                        boolean z = i4 >= i;
                        selectable.getSelectableId();
                        if (i2 == -1) {
                            i2 = TextRange.m9139getMinimpl(TextRange);
                            builder.append(text, 0, TextRange.m9139getMinimpl(TextRange));
                        }
                        pair = pair2;
                        builder.append(text, TextRange.m9139getMinimpl(TextRange), TextRange.m9138getMaximpl(TextRange));
                        if (!z) {
                            builder.append('\n');
                        } else {
                            i3 = builder.getLength();
                            builder.append(text, TextRange.m9138getMaximpl(TextRange), text.length());
                        }
                    } else {
                        pair = pair2;
                    }
                    i4++;
                    pair2 = pair;
                }
            } else {
                i2 = -1;
                i3 = -1;
            }
            return (i2 == -1 || i3 == -1) ? pair2 : new Pair<>(builder.toAnnotatedString(), TextRange.m9129boximpl(TextRangeKt.TextRange(i2, i3)));
        }
        return null;
    }

    public final void forEachSelectableWithSelection$foundation(Function4<? super Long, ? super AnnotatedString, ? super TextRange, ? super Boolean, Boolean> block) {
        int i;
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ListIterator<Selectable> listIterator = sort.listIterator(sort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            Selection selection = this.selectionRegistrar.getSubselections().get(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i == -1) {
            return;
        }
        int size = sort.size();
        int i2 = 0;
        while (i2 < size) {
            Selectable selectable = sort.get(i2);
            Selection selection2 = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            if (selection2 != null) {
                if (!block.invoke(Long.valueOf(selectable.getSelectableId()), selectable.getText(), TextRange.m9129boximpl(TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset())), Boolean.valueOf(i2 >= i)).booleanValue()) {
                    return;
                }
            }
            i2++;
        }
    }

    public final void copy$foundation() {
        Function1<? super AnnotatedString, Unit> function1;
        AnnotatedString selectedText$foundation = getSelectedText$foundation();
        if (selectedText$foundation != null) {
            if (selectedText$foundation.length() <= 0) {
                selectedText$foundation = null;
            }
            if (selectedText$foundation == null || (function1 = this.onCopyHandler) == null) {
                return;
            }
            function1.invoke(selectedText$foundation);
        }
    }

    /* renamed from: getShowToolbar$foundation, reason: from getter */
    public final boolean getShowToolbar() {
        return this.showToolbar;
    }

    public final void setShowToolbar$foundation(boolean z) {
        this.showToolbar = z;
        updateSelectionToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toolbarCopy() {
        copy$foundation();
        onRelease();
    }

    private final void updateSelectionToolbar() {
        if (getHasFocus()) {
            if (ComposeFoundationFlags.isNewContextMenuEnabled) {
                if (this.showToolbar && isInTouchMode()) {
                    if (getDerivedContentRect() == null) {
                        return;
                    }
                    this.toolbarRequester.show();
                    return;
                }
                this.toolbarRequester.hide();
                return;
            }
            updateSelectionTextToolbar();
        }
    }

    public final boolean canCopy$foundation() {
        return this.onCopyHandler != null && isNonEmptySelection$foundation();
    }

    private final void updateSelectionTextToolbar() {
        TextToolbar textToolbar = this.textToolbar;
        if (textToolbar == null) {
            return;
        }
        if (this.showToolbar && isInTouchMode()) {
            Rect contentRect = getContentRect();
            if (contentRect == null) {
                return;
            }
            TextToolbar.CC.showMenu$default(textToolbar, contentRect, canCopy$foundation() ? new SelectionManager$updateSelectionTextToolbar$1(this) : null, null, null, isEntireContainerSelected$foundation() ? null : new SelectionManager$updateSelectionTextToolbar$2(this), null, 12, null);
            return;
        }
        if (textToolbar.getStatus() == TextToolbarStatus.Shown) {
            textToolbar.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        List firstAndLast;
        Rect rect;
        getPositionChangeState();
        if (getSelection() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation());
        ArrayList arrayList = new ArrayList(sort.size());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            Pair pair = selection != null ? TuplesKt.to(selectable, selection) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        firstAndLast = SelectionManagerKt.firstAndLast(arrayList);
        if (firstAndLast.isEmpty()) {
            return null;
        }
        Rect selectedRegionRect = SelectionManagerKt.getSelectedRegionRect(firstAndLast, layoutCoordinates);
        rect = SelectionManagerKt.invertedInfiniteRect;
        if (Intrinsics.areEqual(selectedRegionRect, rect)) {
            return null;
        }
        Rect intersect = SelectionManagerKt.visibleBounds(layoutCoordinates).intersect(selectedRegionRect);
        if (intersect.getRight() - intersect.getLeft() < 0.0f || intersect.getBottom() - intersect.getTop() < 0.0f) {
            return null;
        }
        Rect m6556translatek4lQ0M = intersect.m6556translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        return Rect.copy$default(m6556translatek4lQ0M, 0.0f, 0.0f, 0.0f, m6556translatek4lQ0M.getBottom() + (SelectionHandlesKt.getHandleHeight() * 4), 7, null);
    }

    public final void onRelease() {
        HapticFeedback hapticFeedback;
        this.selectionRegistrar.setSubselections(LongObjectMapKt.emptyLongObjectMap());
        setShowToolbar$foundation(false);
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (!isInTouchMode() || (hapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            hapticFeedback.mo7577performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7594getTextHandleMove5zf0vsI());
        }
    }

    public final TextDragObserver handleDragObserver(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1868onDownk4lQ0M(long point) {
                LayoutCoordinates layoutCoordinates;
                Offset m2382getStartHandlePosition_m7T9E = isStartHandle ? this.m2382getStartHandlePosition_m7T9E() : this.m2381getEndHandlePosition_m7T9E();
                if (m2382getStartHandlePosition_m7T9E != null) {
                    m2382getStartHandlePosition_m7T9E.m6529unboximpl();
                    Selection selection = this.getSelection();
                    if (selection == null) {
                        return;
                    }
                    Selectable anchorSelectable$foundation = this.getAnchorSelectable$foundation(isStartHandle ? selection.getStart() : selection.getEnd());
                    if (anchorSelectable$foundation == null || (layoutCoordinates = anchorSelectable$foundation.getLayoutCoordinates()) == null) {
                        return;
                    }
                    long mo2325getHandlePositiondBAh8RU = anchorSelectable$foundation.mo2325getHandlePositiondBAh8RU(selection, isStartHandle);
                    if ((9223372034707292159L & mo2325getHandlePositiondBAh8RU) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                        return;
                    }
                    long m2355getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m2355getAdjustedCoordinatesk4lQ0M(mo2325getHandlePositiondBAh8RU);
                    SelectionManager selectionManager = this;
                    selectionManager.m2372setCurrentDragPosition_kEHs6E(Offset.m6508boximpl(selectionManager.requireContainerCoordinates$foundation().mo8288localPositionOfR5De75A(layoutCoordinates, m2355getAdjustedCoordinatesk4lQ0M)));
                    this.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                    this.setShowToolbar$foundation(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo1870onStart3MmeM6k(long startPoint, SelectionAdjustment selectionAdjustment) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                Selection selection = this.getSelection();
                Intrinsics.checkNotNull(selection);
                Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation().get((isStartHandle ? selection.getStart() : selection.getEnd()).getSelectableId());
                if (selectable != null) {
                    Selectable selectable2 = selectable;
                    LayoutCoordinates layoutCoordinates = selectable2.getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        long mo2325getHandlePositiondBAh8RU = selectable2.mo2325getHandlePositiondBAh8RU(selection, isStartHandle);
                        if ((9223372034707292159L & mo2325getHandlePositiondBAh8RU) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            return;
                        }
                        long m2355getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m2355getAdjustedCoordinatesk4lQ0M(mo2325getHandlePositiondBAh8RU);
                        SelectionManager selectionManager = this;
                        selectionManager.m2373setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation().mo8288localPositionOfR5De75A(layoutCoordinates, m2355getAdjustedCoordinatesk4lQ0M));
                        this.m2374setDragTotalDistancek4lQ0M(Offset.INSTANCE.m6535getZeroF1C5BW0());
                        return;
                    }
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Current selectable should have layout coordinates.");
                    throw new KotlinNothingValueException();
                }
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("SelectionRegistrar should contain the current selection's selectableIds");
                throw new KotlinNothingValueException();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1869onDragk4lQ0M(long delta) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                SelectionManager selectionManager = this;
                selectionManager.m2374setDragTotalDistancek4lQ0M(Offset.m6524plusMKHz9U(selectionManager.m2380getDragTotalDistanceF1C5BW0$foundation(), delta));
                long m6524plusMKHz9U = Offset.m6524plusMKHz9U(this.m2379getDragBeginPositionF1C5BW0$foundation(), this.m2380getDragTotalDistanceF1C5BW0$foundation());
                if (this.m2385updateSelectionqNKwrvQ$foundation(Offset.m6508boximpl(m6524plusMKHz9U), this.m2379getDragBeginPositionF1C5BW0$foundation(), isStartHandle, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                    this.m2373setDragBeginPositionk4lQ0M(m6524plusMKHz9U);
                    this.m2374setDragTotalDistancek4lQ0M(Offset.INSTANCE.m6535getZeroF1C5BW0());
                }
            }

            private final void done() {
                this.setShowToolbar$foundation(true);
                this.setDraggingHandle(null);
                this.m2372setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                done();
            }
        };
    }

    private final Modifier addContextMenuComponents(Modifier modifier) {
        return ComposeFoundationFlags.isNewContextMenuEnabled ? SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents(modifier, this) : modifier;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, final Function0<Unit> function0) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1

            /* compiled from: SelectionManager.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", i = {0}, l = {PointerIconCompat.TYPE_CONTEXT_MENU, PointerIconCompat.TYPE_CROSSHAIR}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"}, v = 1)
            /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $block;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SelectionManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SelectionManager selectionManager, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = selectionManager;
                    this.$block = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
                
                    if (r11 == r0) goto L16;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AwaitPointerEventScope awaitPointerEventScope;
                    boolean isDraggingInProgress;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope2;
                        this.label = 1;
                        obj = TapGestureDetectorKt.awaitPrimaryFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null);
                        if (obj != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            isDraggingInProgress = this.this$0.isDraggingInProgress();
                            if (!isDraggingInProgress) {
                                this.$block.invoke();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 2;
                    obj = DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(awaitPointerEventScope, (PointerInputChange) obj, PointerEventPass.Initial, this);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(SelectionManager.this, function0, null), continuation);
                return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
            }
        });
    }

    /* renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    private final long m2370convertToContainerCoordinatesR5De75A(LayoutCoordinates layoutCoordinates, long offset) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return Offset.INSTANCE.m6534getUnspecifiedF1C5BW0();
        }
        return requireContainerCoordinates$foundation().mo8288localPositionOfR5De75A(layoutCoordinates, offset);
    }

    /* renamed from: startSelection-9KIMszo, reason: not valid java name */
    private final void m2377startSelection9KIMszo(long position, boolean isStartHandle, SelectionAdjustment adjustment) {
        this.previousSelectionLayout = null;
        m2384updateSelectionjyLRC_s$foundation(position, Offset.INSTANCE.m6534getUnspecifiedF1C5BW0(), isStartHandle, adjustment);
    }

    /* renamed from: updateSelection-qNKwrvQ$foundation, reason: not valid java name */
    public final boolean m2385updateSelectionqNKwrvQ$foundation(Offset newPosition, long previousPosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        if (newPosition == null) {
            return false;
        }
        return m2384updateSelectionjyLRC_s$foundation(newPosition.m6529unboximpl(), previousPosition, isStartHandle, adjustment);
    }

    /* renamed from: updateSelection-jyLRC_s$foundation, reason: not valid java name */
    public final boolean m2384updateSelectionjyLRC_s$foundation(long position, long previousHandlePosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
        m2372setCurrentDragPosition_kEHs6E(Offset.m6508boximpl(position));
        SelectionLayout m2371getSelectionLayoutWko1d7g = m2371getSelectionLayoutWko1d7g(position, previousHandlePosition, isStartHandle);
        if (m2371getSelectionLayoutWko1d7g == null || !m2371getSelectionLayoutWko1d7g.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        Selection adjust = adjustment.adjust(m2371getSelectionLayoutWko1d7g);
        if (!Intrinsics.areEqual(adjust, getSelection())) {
            selectionChanged(m2371getSelectionLayoutWko1d7g, adjust);
            this.isLongPressOrClickSelection = false;
        }
        this.previousSelectionLayout = m2371getSelectionLayoutWko1d7g;
        return true;
    }

    /* renamed from: getSelectionLayout-Wko1d7g, reason: not valid java name */
    private final SelectionLayout m2371getSelectionLayoutWko1d7g(long position, long previousHandlePosition, boolean isStartHandle) {
        LayoutCoordinates requireContainerCoordinates$foundation = requireContainerCoordinates$foundation();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation);
        final MutableLongIntMap mutableLongIntMapOf = LongIntMapKt.mutableLongIntMapOf();
        List<Selectable> list = sort;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mutableLongIntMapOf.set(sort.get(i).getSelectableId(), i);
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(position, previousHandlePosition, requireContainerCoordinates$foundation, isStartHandle, (previousHandlePosition & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? null : getSelection(), new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(MutableLongIntMap.this.get(((Number) t).longValue())), Integer.valueOf(MutableLongIntMap.this.get(((Number) t2).longValue())));
            }
        }, null);
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sort.get(i2).appendSelectableInfoToBuilder(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.build();
    }

    private final void selectionChanged(SelectionLayout selectionLayout, Selection newSelection) {
        HapticFeedback hapticFeedback;
        if (shouldPerformHaptics$foundation() && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo7577performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7594getTextHandleMove5zf0vsI());
        }
        this.selectionRegistrar.setSubselections(selectionLayout.createSubSelections(newSelection));
        this.onSelectionChange.invoke(newSelection);
    }

    public final boolean shouldPerformHaptics$foundation() {
        if (isInTouchMode()) {
            List<Selectable> selectables$foundation = this.selectionRegistrar.getSelectables$foundation();
            int size = selectables$foundation.size();
            for (int i = 0; i < size; i++) {
                if (selectables$foundation.get(i).getText().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[LOOP:0: B:8:0x001b->B:13:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[SYNTHETIC] */
    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2383selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long position) {
        LayoutCoordinates layoutCoordinates;
        boolean m1909isPositionInsideSelectionuaM50fQ;
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 != null && layoutCoordinates2.isAttached()) {
            List<Selectable> selectables$foundation = this.selectionRegistrar.getSelectables$foundation();
            int size = selectables$foundation.size();
            for (int i = 0; i < size; i++) {
                Selectable selectable = selectables$foundation.get(i);
                Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
                if (selection != null && (layoutCoordinates = selectable.getLayoutCoordinates()) != null) {
                    long mo8288localPositionOfR5De75A = layoutCoordinates.mo8288localPositionOfR5De75A(layoutCoordinates2, position);
                    TextLayoutResult textLayoutResult = selectable.textLayoutResult();
                    if (textLayoutResult != null) {
                        m1909isPositionInsideSelectionuaM50fQ = TextLayoutHelperKt.m1909isPositionInsideSelectionuaM50fQ(textLayoutResult, mo8288localPositionOfR5De75A, TextRange.m9129boximpl(selection.m2345toTextRanged9O1mEE()));
                        if (!m1909isPositionInsideSelectionuaM50fQ) {
                            return;
                        }
                    }
                }
                m1909isPositionInsideSelectionuaM50fQ = false;
                if (!m1909isPositionInsideSelectionuaM50fQ) {
                }
            }
            m2377startSelection9KIMszo(position, true, SelectionAdjustment.INSTANCE.getWord());
        }
    }
}
