package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.ArraySet;
import androidx.collection.IntIntMapKt;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.AndroidComposeUiFlags;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsNode_androidKt;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.Lifecycle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u009d\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\n\u009d\u0002\u009e\u0002\u009f\u0002 \u0002¡\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010-\u001a\u00020.H\u0002J\u0010\u0010z\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020{H\u0016J\u0010\u0010|\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020{H\u0016J\u0010\u0010}\u001a\u00020.2\u0006\u0010~\u001a\u00020\u0016H\u0016J\u0010\u0010\u007f\u001a\u00020.2\u0006\u0010~\u001a\u00020\u0016H\u0016J.\u0010\u0080\u0001\u001a\u00020\u00162\u0007\u0010\u0081\u0001\u001a\u00020\u00162\u0007\u0010\u0082\u0001\u001a\u00020\f2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J<\u0010\u0080\u0001\u001a\u00020\u00162\f\u0010]\u001a\b\u0012\u0004\u0012\u00020_0^2\u0007\u0010\u0081\u0001\u001a\u00020\u00162\u0007\u0010\u0082\u0001\u001a\u00020\f2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\t\u0010\u0089\u0001\u001a\u00020\u0016H\u0002J\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010F2\u0007\u0010\u008b\u0001\u001a\u00020\fH\u0002J\u000b\u0010\u008c\u0001\u001a\u0004\u0018\u00010FH\u0002J\u0013\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020_H\u0002J2\u0010\u0090\u0001\u001a\u00030\u008e\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u00012\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\b\u0010\u0094\u0001\u001a\u00030\u0092\u00012\b\u0010\u0095\u0001\u001a\u00030\u0092\u0001H\u0002J%\u0010\u0096\u0001\u001a\u00020.2\u0007\u0010\u008b\u0001\u001a\u00020\f2\u0007\u0010\u0097\u0001\u001a\u00020F2\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0002J\u001c\u0010\u009a\u0001\u001a\u00020.2\b\u0010\u008f\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u0097\u0001\u001a\u00020FH\u0002J\u0017\u0010\u009b\u0001\u001a\u00020.*\u00020F2\b\u0010\u008f\u0001\u001a\u00030\u0099\u0001H\u0002J\u0011\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001*\u00030\u009e\u0001H\u0002J\u001c\u0010\u009f\u0001\u001a\u00020.2\b\u0010\u008f\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u0097\u0001\u001a\u00020FH\u0002J\u0012\u0010 \u0001\u001a\u00020\u00162\u0007\u0010\u008b\u0001\u001a\u00020\fH\u0002J\u0012\u0010¡\u0001\u001a\u00020\u00162\u0007\u0010\u008b\u0001\u001a\u00020\fH\u0002JA\u0010¢\u0001\u001a\u00020\u00162\u0007\u0010\u008b\u0001\u001a\u00020\f2\u0007\u0010£\u0001\u001a\u00020\f2\u000b\b\u0002\u0010¤\u0001\u001a\u0004\u0018\u00010\f2\u0011\b\u0002\u0010¥\u0001\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010+H\u0002¢\u0006\u0003\u0010¦\u0001J\u0012\u0010§\u0001\u001a\u00020\u00162\u0007\u0010¨\u0001\u001a\u00020\u0015H\u0002J\u001b\u0010©\u0001\u001a\u00020\u00152\u0007\u0010\u008b\u0001\u001a\u00020\f2\u0007\u0010£\u0001\u001a\u00020\fH\u0003JD\u0010ª\u0001\u001a\u00020\u00152\u0007\u0010\u008b\u0001\u001a\u00020\f2\t\u0010«\u0001\u001a\u0004\u0018\u00010\f2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\f2\t\u0010®\u0001\u001a\u0004\u0018\u00010OH\u0002¢\u0006\u0003\u0010¯\u0001J\u0012\u0010°\u0001\u001a\u00020\u00162\u0007\u0010\u008b\u0001\u001a\u00020\fH\u0002J'\u0010±\u0001\u001a\u00020\u00162\u0007\u0010\u008b\u0001\u001a\u00020\f2\u0007\u0010²\u0001\u001a\u00020\f2\n\u0010³\u0001\u001a\u0005\u0018\u00010´\u0001H\u0002J\u000e\u0010µ\u0001\u001a\u00020\u0016*\u00030\u0099\u0001H\u0003J\u000e\u0010¶\u0001\u001a\u00020\u0016*\u00030\u0099\u0001H\u0002J,\u0010·\u0001\u001a\u00030\u0084\u0001*\u00030\u0099\u00012\b\u0010¸\u0001\u001a\u00030\u0099\u00012\b\u0010¹\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\bº\u0001\u0010»\u0001J,\u0010¼\u0001\u001a\u00030\u0084\u0001*\u00030\u0099\u00012\b\u0010¸\u0001\u001a\u00030\u0099\u00012\b\u0010½\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b¾\u0001\u0010»\u0001J0\u0010¿\u0001\u001a\u00020.2\u0007\u0010\u008b\u0001\u001a\u00020\f2\u0007\u0010\u0097\u0001\u001a\u00020F2\u0007\u0010À\u0001\u001a\u00020n2\n\u0010³\u0001\u001a\u0005\u0018\u00010´\u0001H\u0002J(\u0010Ã\u0001\u001a\u00030Ä\u00012\b\u0010\u008f\u0001\u001a\u00030\u0099\u00012\b\u0010Å\u0001\u001a\u00030\u008e\u00012\b\u0010Æ\u0001\u001a\u00030Ç\u0001H\u0002J\u0019\u0010È\u0001\u001a\u00030Ä\u0001*\u00030\u008e\u00012\b\u0010Å\u0001\u001a\u00030\u008e\u0001H\u0002J\"\u0010É\u0001\u001a\u0005\u0018\u00010Ê\u00012\n\u0010Ë\u0001\u001a\u0005\u0018\u00010\u0099\u00012\b\u0010Ì\u0001\u001a\u00030Ä\u0001H\u0002J,\u0010Í\u0001\u001a\u00030Î\u0001*\u00030Ç\u00012\b\u0010Ï\u0001\u001a\u00030Ð\u00012\b\u0010Ñ\u0001\u001a\u00030Ò\u0001H\u0002¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J%\u0010Õ\u0001\u001a\u0005\u0018\u00010\u008e\u0001*\u00030Î\u00012\b\u0010Ö\u0001\u001a\u00030\u0092\u00012\b\u0010×\u0001\u001a\u00030\u0092\u0001H\u0002J\u0011\u0010Ø\u0001\u001a\u0005\u0018\u00010Ù\u0001*\u00030Î\u0001H\u0002J%\u0010Ú\u0001\u001a\u0005\u0018\u00010Û\u0001*\u00030Î\u00012\b\u0010Ö\u0001\u001a\u00030\u0092\u00012\b\u0010×\u0001\u001a\u00030\u0092\u0001H\u0002J'\u0010Õ\u0001\u001a\u00030\u008e\u0001*\u00030Ä\u00012\n\b\u0002\u0010Ö\u0001\u001a\u00030\u0092\u00012\n\b\u0002\u0010×\u0001\u001a\u00030\u0092\u0001H\u0002J\u0019\u0010Ü\u0001\u001a\u00020\u00162\b\u0010¨\u0001\u001a\u00030Ý\u0001H\u0000¢\u0006\u0003\bÞ\u0001J#\u0010ß\u0001\u001a\u00020\f2\b\u0010à\u0001\u001a\u00030\u0092\u00012\b\u0010á\u0001\u001a\u00030\u0092\u0001H\u0001¢\u0006\u0003\bâ\u0001J\u0012\u0010ã\u0001\u001a\u00020.2\u0007\u0010\u008b\u0001\u001a\u00020\fH\u0002J\u0013\u0010ä\u0001\u001a\u00030å\u00012\u0007\u0010æ\u0001\u001a\u00020{H\u0016J4\u0010ç\u0001\u001a\u0005\u0018\u0001Hè\u0001\"\t\b\u0000\u0010è\u0001*\u00020O2\n\u0010®\u0001\u001a\u0005\u0018\u0001Hè\u00012\t\b\u0001\u0010Ï\u0001\u001a\u00020\fH\u0002¢\u0006\u0003\u0010é\u0001J\u000f\u0010ì\u0001\u001a\u00020.H\u0000¢\u0006\u0003\bí\u0001J\u0013\u0010î\u0001\u001a\u00020.H\u0080@¢\u0006\u0006\bï\u0001\u0010ð\u0001J\u0018\u0010ñ\u0001\u001a\u00020.2\u0007\u0010ò\u0001\u001a\u00020WH\u0000¢\u0006\u0003\bó\u0001J\u0012\u0010ô\u0001\u001a\u00020.2\u0007\u0010ò\u0001\u001a\u00020WH\u0002J\u0012\u0010õ\u0001\u001a\u00020.2\u0007\u0010ò\u0001\u001a\u00020WH\u0002J\u001b\u0010ö\u0001\u001a\u00020.2\u0007\u0010ò\u0001\u001a\u00020W2\u0007\u0010÷\u0001\u001a\u00020cH\u0002J\t\u0010ø\u0001\u001a\u00020.H\u0002J\t\u0010ù\u0001\u001a\u00020.H\u0002J\u0018\u0010ú\u0001\u001a\u00020.2\r\u0010û\u0001\u001a\b\u0012\u0004\u0012\u00020_0^H\u0002J\"\u0010\u0080\u0002\u001a\u00020\u00162\u0007\u0010\u0081\u0002\u001a\u00020\f2\u000e\u0010\u0082\u0002\u001a\t\u0012\u0005\u0012\u00030þ\u00010+H\u0002J\u0013\u0010\u0083\u0002\u001a\u00020.2\b\u0010\u0084\u0002\u001a\u00030þ\u0001H\u0002J&\u0010\u0085\u0002\u001a\u00020.2\u0007\u0010\u0086\u0002\u001a\u00020\f2\u0007\u0010¤\u0001\u001a\u00020\f2\t\u0010\u0087\u0002\u001a\u0004\u0018\u00010nH\u0002J\u001c\u0010\u0088\u0002\u001a\u00020.2\b\u0010\u0089\u0002\u001a\u00030\u0099\u00012\u0007\u0010\u008a\u0002\u001a\u00020vH\u0002J\u0012\u0010\u008b\u0002\u001a\u00020\f2\u0007\u0010\u0081\u0002\u001a\u00020\fH\u0002J.\u0010\u008c\u0002\u001a\u00020\u00162\b\u0010\u008f\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u008d\u0002\u001a\u00020\f2\u0007\u0010\u008e\u0002\u001a\u00020\u00162\u0007\u0010\u008f\u0002\u001a\u00020\u0016H\u0002J\u0012\u0010\u0090\u0002\u001a\u00020.2\u0007\u0010\u0086\u0002\u001a\u00020\fH\u0002J.\u0010\u0091\u0002\u001a\u00020\u00162\b\u0010\u008f\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u0092\u0002\u001a\u00020\f2\u0007\u0010\u0093\u0002\u001a\u00020\f2\u0007\u0010\u0094\u0002\u001a\u00020\u0016H\u0002J\u0013\u0010\u0095\u0002\u001a\u00020\f2\b\u0010\u008f\u0001\u001a\u00030\u0099\u0001H\u0002J\u0013\u0010\u0096\u0002\u001a\u00020\f2\b\u0010\u008f\u0001\u001a\u00030\u0099\u0001H\u0002J\u0013\u0010\u0097\u0002\u001a\u00020\u00162\b\u0010\u008f\u0001\u001a\u00030\u0099\u0001H\u0002J!\u0010\u0098\u0002\u001a\u0005\u0018\u00010\u0099\u00022\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0099\u00012\u0007\u0010\u008d\u0002\u001a\u00020\fH\u0002J\u0017\u0010\u009a\u0002\u001a\u0004\u0018\u00010n2\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0002J\u0011\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009e\u0001*\u00030\u009c\u0002H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R0\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010!R\u0014\u00104\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010!R\u001e\u00105\u001a\u0004\u0018\u00010\u0016X\u0080\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010=\u001a\u0004\u0018\u00010<8BX\u0082\u0004¢\u0006\f\u0012\u0004\b>\u0010\u000e\u001a\u0004\b?\u0010@R\u0012\u0010A\u001a\u00060BR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010FX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020K0JX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0N0NX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0Q0NX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010S\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010TR\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020W0VX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020.0YX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020_0^8BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u000e\u0010b\u001a\u00020cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010d\u001a\u00020eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001a\u0010j\u001a\u00020eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010g\"\u0004\bl\u0010iR\u0014\u0010m\u001a\u00020nX\u0080D¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020nX\u0080D¢\u0006\b\n\u0000\u001a\u0004\br\u0010pR\u000e\u0010s\u001a\u00020tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010u\u001a\b\u0012\u0004\u0012\u00020v0JX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020vX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u008d\u0001\u001a\u00030\u008e\u0001*\u00020F8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0010\u0010ê\u0001\u001a\u00030ë\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010ü\u0001\u001a\n\u0012\u0005\u0012\u00030þ\u00010ý\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ÿ\u0001\u001a\u000f\u0012\u0005\u0012\u00030þ\u0001\u0012\u0004\u0012\u00020.0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006¢\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "view", "Landroidx/compose/ui/platform/AndroidComposeView;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "hoveredVirtualViewId", "", "getHoveredVirtualViewId$ui$annotations", "()V", "getHoveredVirtualViewId$ui", "()I", "setHoveredVirtualViewId$ui", "(I)V", "onSendAccessibilityEvent", "Lkotlin/Function1;", "Landroid/view/accessibility/AccessibilityEvent;", "", "getOnSendAccessibilityEvent$ui$annotations", "getOnSendAccessibilityEvent$ui", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui", "(Lkotlin/jvm/functions/Function1;)V", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "value", "accessibilityForceEnabledForTesting", "getAccessibilityForceEnabledForTesting$ui", "()Z", "setAccessibilityForceEnabledForTesting$ui", "(Z)V", "SendRecurringAccessibilityEventsIntervalMillis", "", "getSendRecurringAccessibilityEventsIntervalMillis$ui", "()J", "setSendRecurringAccessibilityEventsIntervalMillis$ui", "(J)V", "_enabledServices", "", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "resetEnabledAccessibilityServiceList", "", "enabledServices", "getEnabledServices", "()Ljava/util/List;", "isEnabled", "isEnabled$ui", "isTouchExplorationEnabled", "requestFromAccessibilityToolForTesting", "getRequestFromAccessibilityToolForTesting$ui", "()Ljava/lang/Boolean;", "setRequestFromAccessibilityToolForTesting$ui", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "legacyMainHandler", "Landroid/os/Handler;", "handler", "getHandler$annotations", "getHandler", "()Landroid/os/Handler;", "nodeProvider", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "accessibilityFocusedVirtualViewId", "focusedVirtualViewId", "currentlyAccessibilityFocusedANI", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "currentlyFocusedANI", "sendingFocusAffectingEvent", "pendingHorizontalScrollEvents", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "pendingVerticalScrollEvents", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "", "labelToActionId", "Landroidx/collection/MutableObjectIntMap;", "accessibilityCursorPosition", "previousTraversedNode", "Ljava/lang/Integer;", "subtreeChangedLayoutNodes", "Landroidx/collection/ArraySet;", "Landroidx/compose/ui/node/LayoutNode;", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "currentSemanticsNodesInvalidated", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "currentSemanticsNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/semantics/SemanticsNodeWithAdjustedBounds;", "getCurrentSemanticsNodes", "()Landroidx/collection/IntObjectMap;", "paneDisplayed", "Landroidx/collection/MutableIntSet;", "idToBeforeMap", "Landroidx/collection/MutableIntIntMap;", "getIdToBeforeMap$ui", "()Landroidx/collection/MutableIntIntMap;", "setIdToBeforeMap$ui", "(Landroidx/collection/MutableIntIntMap;)V", "idToAfterMap", "getIdToAfterMap$ui", "setIdToAfterMap$ui", "ExtraDataTestTraversalBeforeVal", "", "getExtraDataTestTraversalBeforeVal$ui", "()Ljava/lang/String;", "ExtraDataTestTraversalAfterVal", "getExtraDataTestTraversalAfterVal$ui", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "previousSemanticsNodes", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "previousSemanticsRoot", "checkingForSemanticsChanges", "drawingOrder", "onViewAttachedToWindow", "Landroid/view/View;", "onViewDetachedFromWindow", "onAccessibilityStateChanged", "enabled", "onTouchExplorationStateChanged", "canScroll", "vertical", "direction", "position", "Landroidx/compose/ui/geometry/Offset;", "canScroll-0AR0LA0$ui", "(ZIJ)Z", "canScroll-moWRBKg", "(Landroidx/collection/IntObjectMap;ZIJ)Z", "isRequestFromAccessibilityTool", "createNodeInfo", "virtualViewId", "emptyNodeInfoOrNull", "boundsInScreen", "Landroid/graphics/Rect;", "node", "toBoundsInScreen", "left", "", "top", "right", "bottom", "populateAccessibilityNodeInfoProperties", "info", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "setContentInvalid", "setInvisibleIfEmptyBounds", "toSpannableString", "Landroid/text/SpannableString;", "Landroidx/compose/ui/text/AnnotatedString;", "setText", "isAccessibilityFocused", "requestAccessibilityFocus", "sendEventForVirtualView", "eventType", "contentChangeType", "contentDescription", "(IILjava/lang/Integer;Ljava/util/List;)Z", "sendEvent", NotificationCompat.CATEGORY_EVENT, "createEvent", "createTextSelectionChangedEvent", "fromIndex", "toIndex", "itemCount", "text", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "clearAccessibilityFocus", "performActionHelper", "action", "arguments", "Landroid/os/Bundle;", "legacyScrollOntoScreen", "scrollOntoScreen", "adjustForReversedScrollingAndRtl", "scrollableAncestor", "offset", "adjustForReversedScrollingAndRtl-RE3cj74", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/semantics/SemanticsNode;J)J", "scrollDxDyForNodeVisible", "offsetAdjustment", "scrollDxDyForNodeVisible-RE3cj74", "addExtraDataToAccessibilityNodeInfoHelper", "extraDataKey", "getBoundsInScreen", "(Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)Landroid/graphics/Rect;", "getShapeBounds", "Landroidx/compose/ui/geometry/Rect;", "nodeBoundsInScreen", "shape", "Landroidx/compose/ui/graphics/Shape;", "toBoundsRelativeToNodeBounds", "toScreenCoords", "Landroid/graphics/RectF;", "textNode", "bounds", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "createOutline-12SF9DM", "(Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "toAndroidRect", "leftOffset", "topOffset", "toCornerArray", "", "toRegion", "Landroid/graphics/Region;", "dispatchHoverEvent", "Landroid/view/MotionEvent;", "dispatchHoverEvent$ui", "hitTestSemanticsAt", "x", "y", "hitTestSemanticsAt$ui", "updateHoveredVirtualView", "getAccessibilityNodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "host", "trimToSize", "T", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "onSemanticsChange", "onSemanticsChange$ui", "boundsUpdatesEventLoop", "boundsUpdatesEventLoop$ui", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLayoutChange", "layoutNode", "onLayoutChange$ui", "notifySubtreeAccessibilityStateChangedIfNeeded", "sendTypeViewScrolledAccessibilityEvent", "sendSubtreeChangeAccessibilityEvents", "subtreeChangedSemanticsNodesIds", "checkForSemanticsChanges", "updateSemanticsNodesCopyAndPanes", "sendSemanticsPropertyChangeEvents", "newSemanticsNodes", "scrollObservationScopes", "", "Landroidx/compose/ui/platform/ScrollObservationScope;", "scheduleScrollEventIfNeededLambda", "registerScrollingId", "id", "oldScrollObservationScopes", "scheduleScrollEventIfNeeded", "scrollObservationScope", "sendPaneChangeEvents", "semanticsNodeId", "title", "sendAccessibilitySemanticsStructureChangeEvents", "newNode", "oldNode", "semanticsNodeIdToAccessibilityVirtualNodeId", "traverseAtGranularity", "granularity", "forward", "extendSelection", "sendPendingTextTraversedAtGranularityEvent", "setAccessibilitySelection", "start", "end", "traversalMode", "getAccessibilitySelectionStart", "getAccessibilitySelectionEnd", "isAccessibilitySelectionExtendable", "getIteratorForGranularity", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIterableTextForAccessibility", "getTextForTextField", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Companion", "PendingTextTraversedEvent", "ComposeAccessibilityNodeProvider", "Api24Impl", "Api29Impl", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final int CONTENT_CHANGE_TYPE_CHECKED = 8192;
    public static final String ClassName = "android.view.View";
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataShapeRectCornersKey = "androidx.compose.ui.semantics.shapeCorners";
    public static final String ExtraDataShapeRectKey = "androidx.compose.ui.semantics.shapeRect";
    public static final String ExtraDataShapeRegionKey = "androidx.compose.ui.semantics.shapeRegion";
    public static final int ExtraDataShapeTypeGeneric = 2;
    public static final String ExtraDataShapeTypeKey = "androidx.compose.ui.semantics.shapeType";
    public static final int ExtraDataShapeTypeRectangle = 0;
    public static final int ExtraDataShapeTypeRounded = 1;
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private List<? extends AccessibilityServiceInfo> _enabledServices;
    private int accessibilityCursorPosition;
    private int accessibilityFocusedVirtualViewId;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final Channel<Unit> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private AccessibilityNodeInfoCompat currentlyAccessibilityFocusedANI;
    private AccessibilityNodeInfoCompat currentlyFocusedANI;
    private final MutableIntIntMap drawingOrder;
    private int focusedVirtualViewId;
    private MutableIntIntMap idToAfterMap;
    private MutableIntIntMap idToBeforeMap;
    private SparseArrayCompat<MutableObjectIntMap<CharSequence>> labelToActionId;
    private final Handler legacyMainHandler;
    private ComposeAccessibilityNodeProvider nodeProvider;
    private MutableIntSet paneDisplayed;
    private final MutableIntObjectMap<ScrollAxisRange> pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final MutableIntObjectMap<ScrollAxisRange> pendingVerticalScrollEvents;
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private Boolean requestFromAccessibilityToolForTesting;
    private final Function1<ScrollObservationScope, Unit> scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    public static final int $stable = 8;
    private static final IntList AccessibilityActionsResourceIds = IntListKt.intListOf(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private Function1<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new Function1<AccessibilityEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(AndroidComposeViewAccessibilityDelegateCompat.this.getView().getParent().requestSendAccessibilityEvent(AndroidComposeViewAccessibilityDelegateCompat.this.getView(), accessibilityEvent));
        }
    };

    private static /* synthetic */ void getHandler$annotations() {
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui$annotations() {
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui$annotations() {
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.legacyMainHandler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.pendingVerticalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.actionIdToLabel = new SparseArrayCompat<>(0, 1, null);
        this.labelToActionId = new SparseArrayCompat<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>(0, 1, null);
        this.boundsUpdateChannel = ChannelKt.Channel$default(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
        this.paneDisplayed = new MutableIntSet(0, 1, null);
        this.idToBeforeMap = new MutableIntIntMap(0, 1, null);
        this.idToAfterMap = new MutableIntIntMap(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
        this.drawingOrder = IntIntMapKt.mutableIntIntMapOf();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$0(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new Function1<ScrollObservationScope, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScrollObservationScope scrollObservationScope) {
                invoke2(scrollObservationScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ScrollObservationScope scrollObservationScope) {
                AndroidComposeViewAccessibilityDelegateCompat.this.scheduleScrollEventIfNeeded(scrollObservationScope);
            }
        };
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    /* renamed from: getHoveredVirtualViewId$ui, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    public final void setHoveredVirtualViewId$ui(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final Function1<AccessibilityEvent, Boolean> getOnSendAccessibilityEvent$ui() {
        return this.onSendAccessibilityEvent;
    }

    public final void setOnSendAccessibilityEvent$ui(Function1<? super AccessibilityEvent, Boolean> function1) {
        this.onSendAccessibilityEvent = function1;
    }

    /* renamed from: getAccessibilityForceEnabledForTesting$ui, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    public final void setAccessibilityForceEnabledForTesting$ui(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.currentSemanticsNodesInvalidated = true;
    }

    /* renamed from: getSendRecurringAccessibilityEventsIntervalMillis$ui, reason: from getter */
    public final long getSendRecurringAccessibilityEventsIntervalMillis() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui(long j) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j;
    }

    private final void resetEnabledAccessibilityServiceList() {
        this._enabledServices = null;
    }

    private final List<AccessibilityServiceInfo> getEnabledServices() {
        List list = this._enabledServices;
        if (list != null) {
            return list;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this._enabledServices = enabledAccessibilityServiceList;
        return enabledAccessibilityServiceList;
    }

    public final boolean isEnabled$ui() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !getEnabledServices().isEmpty();
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* renamed from: getRequestFromAccessibilityToolForTesting$ui, reason: from getter */
    public final Boolean getRequestFromAccessibilityToolForTesting() {
        return this.requestFromAccessibilityToolForTesting;
    }

    public final void setRequestFromAccessibilityToolForTesting$ui(Boolean bool) {
        this.requestFromAccessibilityToolForTesting = bool;
    }

    private final Handler getHandler() {
        if (AndroidComposeUiFlags.isViewBasedSemanticsHandlerEnabled) {
            return this.view.getHandler();
        }
        return this.legacyMainHandler;
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getAction", "()I", "getGranularity", "getFromIndex", "getToIndex", "getTraverseTime", "()J", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    private static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner(), -1, new Function1<SemanticsNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SemanticsNode semanticsNode) {
                    return Boolean.valueOf(SemanticsNode_androidKt.isAccessibilityIgnoredLink(semanticsNode));
                }
            });
            if (isEnabled$ui()) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.setTraversalValues(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    /* renamed from: getIdToBeforeMap$ui, reason: from getter */
    public final MutableIntIntMap getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    public final void setIdToBeforeMap$ui(MutableIntIntMap mutableIntIntMap) {
        this.idToBeforeMap = mutableIntIntMap;
    }

    /* renamed from: getIdToAfterMap$ui, reason: from getter */
    public final MutableIntIntMap getIdToAfterMap() {
        return this.idToAfterMap;
    }

    public final void setIdToAfterMap$ui(MutableIntIntMap mutableIntIntMap) {
        this.idToAfterMap = mutableIntIntMap;
    }

    /* renamed from: getExtraDataTestTraversalBeforeVal$ui, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* renamed from: getExtraDataTestTraversalAfterVal$ui, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (this.accessibilityManager.isEnabled()) {
            resetEnabledAccessibilityServiceList();
        }
        this.accessibilityManager.addAccessibilityStateChangeListener(this);
        this.accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Handler handler = getHandler();
        Intrinsics.checkNotNull(handler);
        handler.removeCallbacks(this.semanticsChangeChecker);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean enabled) {
        resetEnabledAccessibilityServiceList();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean enabled) {
        resetEnabledAccessibilityServiceList();
    }

    /* renamed from: canScroll-0AR0LA0$ui, reason: not valid java name */
    public final boolean m8747canScroll0AR0LA0$ui(boolean vertical, int direction, long position) {
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m8744canScrollmoWRBKg(getCurrentSemanticsNodes(), vertical, direction, position);
        }
        return false;
    }

    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    private final boolean m8744canScrollmoWRBKg(IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes, boolean vertical, int direction, long position) {
        SemanticsPropertyKey<ScrollAxisRange> horizontalScrollAxisRange;
        ScrollAxisRange scrollAxisRange;
        if (Offset.m6516equalsimpl0(position, Offset.INSTANCE.m6534getUnspecifiedF1C5BW0()) || (((9223372034707292159L & position) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (vertical) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else {
            if (vertical) {
                throw new NoWhenBranchMatchedException();
            }
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        }
        Object[] objArr = currentSemanticsNodes.values;
        long[] jArr = currentSemanticsNodes.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((j & 255) < 128) {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3];
                        if (IntRectKt.toRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m6545containsk4lQ0M(position) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig(), horizontalScrollAxisRange)) != null) {
                            int i4 = scrollAxisRange.getReverseScrolling() ? -direction : direction;
                            if (direction == 0 && scrollAxisRange.getReverseScrolling()) {
                                i4 = -1;
                            }
                            if (i4 < 0) {
                                if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
                                    j >>= 8;
                                }
                                z = true;
                                j >>= 8;
                            } else {
                                if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue()) {
                                    j >>= 8;
                                }
                                z = true;
                                j >>= 8;
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i == length) {
                return z;
            }
            i++;
        }
    }

    private final boolean isRequestFromAccessibilityTool() {
        Boolean bool = this.requestFromAccessibilityToolForTesting;
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            return true;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) false)) {
            return false;
        }
        return AccessibilityManagerCompat.isRequestFromAccessibilityTool(this.accessibilityManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfoCompat createNodeInfo(int virtualViewId) {
        if (this.view.getComposeViewContext().getLifecycleOwner().getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            return emptyNodeInfoOrNull();
        }
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(virtualViewId);
        if (semanticsNodeWithAdjustedBounds == null) {
            return emptyNodeInfoOrNull();
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        boolean areEqual = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getIsSensitiveData()), (Object) true);
        if (areEqual && !isRequestFromAccessibilityTool()) {
            return null;
        }
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        obtain.setAccessibilityDataSensitive(areEqual);
        if (virtualViewId == -1) {
            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
            obtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            Integer valueOf = parent != null ? Integer.valueOf(parent.getId()) : null;
            if (valueOf == null) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("semanticsNode " + virtualViewId + " has null parent");
                throw new KotlinNothingValueException();
            }
            int intValue = valueOf.intValue();
            obtain.setParent(this.view, intValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? intValue : -1);
        }
        obtain.setSource(this.view, virtualViewId);
        obtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(virtualViewId, obtain, semanticsNode);
        return obtain;
    }

    private final AccessibilityNodeInfoCompat emptyNodeInfoOrNull() {
        if (this.accessibilityManager.isEnabled()) {
            return null;
        }
        return AccessibilityNodeInfoCompat.obtain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect boundsInScreen(SemanticsNodeWithAdjustedBounds node) {
        IntRect adjustedBounds = node.getAdjustedBounds();
        return toBoundsInScreen(adjustedBounds.getLeft(), adjustedBounds.getTop(), adjustedBounds.getRight(), adjustedBounds.getBottom());
    }

    private final Rect toBoundsInScreen(float left, float top, float right, float bottom) {
        long mo8233localToScreenMKHz9U = this.view.mo8233localToScreenMKHz9U(Offset.m6511constructorimpl((Float.floatToRawIntBits(top) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        long mo8233localToScreenMKHz9U2 = this.view.mo8233localToScreenMKHz9U(Offset.m6511constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32)));
        int i = (int) (mo8233localToScreenMKHz9U >> 32);
        int i2 = (int) (mo8233localToScreenMKHz9U2 >> 32);
        int i3 = (int) (mo8233localToScreenMKHz9U & 4294967295L);
        int i4 = (int) (mo8233localToScreenMKHz9U2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    private final void populateAccessibilityNodeInfoProperties(int virtualViewId, AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
        String infoStateDescriptionOrNull;
        boolean infoIsCheckable;
        boolean enabled;
        boolean enabled2;
        boolean enabled3;
        boolean isScreenReaderFocusable;
        View semanticsIdToView;
        boolean enabled4;
        boolean enabled5;
        boolean isRtl;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        boolean isRtl2;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        boolean enabled6;
        String accessibilityExtraKey;
        boolean excludeLineAndPageGranularities;
        boolean enabled7;
        boolean z;
        boolean enabled8;
        SemanticsNode semanticsNode2;
        boolean z2;
        SemanticsNode semanticsNode3;
        SemanticsConfiguration config;
        Resources resources = this.view.getContext().getResources();
        info.setClassName(ClassName);
        if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText())) {
            info.setClassName(TextFieldClassName);
        }
        if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getText())) {
            info.setClassName(TextClassName);
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
        if (role != null) {
            role.getValue();
            if (semanticsNode.isFake$ui() || semanticsNode.getReplacedChildren$ui().isEmpty()) {
                if (Role.m8877equalsimpl0(role.getValue(), Role.INSTANCE.m8888getTabo7Vup1c())) {
                    info.setRoleDescription(resources.getString(R.string.tab));
                } else if (Role.m8877equalsimpl0(role.getValue(), Role.INSTANCE.m8887getSwitcho7Vup1c())) {
                    info.setRoleDescription(resources.getString(R.string.switch_role));
                } else {
                    String m8851toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m8851toLegacyClassNameV4PA4sw(role.getValue());
                    if (!Role.m8877equalsimpl0(role.getValue(), Role.INSTANCE.m8885getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui() || semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        info.setClassName(m8851toLegacyClassNameV4PA4sw);
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        info.setPackageName(this.view.getContext().getPackageName());
        info.setImportantForAccessibility(SemanticsOwnerKt.isImportantForAccessibility(semanticsNode));
        boolean isRequestFromAccessibilityTool = isRequestFromAccessibilityTool();
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode4 = replacedChildren$ui.get(i2);
            if (getCurrentSemanticsNodes().containsKey(semanticsNode4.getId())) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(semanticsNode4.getLayoutNode());
                if (semanticsNode4.getId() != -1) {
                    if (androidViewHolder != null) {
                        info.addChild(androidViewHolder);
                    } else {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(semanticsNode4.getId());
                        boolean areEqual = (semanticsNodeWithAdjustedBounds == null || (semanticsNode3 = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null || (config = semanticsNode3.getConfig()) == null) ? false : Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getIsSensitiveData()), (Object) true);
                        if (isRequestFromAccessibilityTool || !areEqual) {
                            info.addChild(this.view, semanticsNode4.getId());
                        }
                    }
                    this.drawingOrder.put(semanticsNode4.getId(), i);
                    i++;
                }
            }
        }
        if (virtualViewId == this.accessibilityFocusedVirtualViewId) {
            info.setAccessibilityFocused(true);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            info.setAccessibilityFocused(false);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(semanticsNode, info);
        setContentInvalid(semanticsNode, info);
        infoStateDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoStateDescriptionOrNull(semanticsNode, resources);
        info.setStateDescription(infoStateDescriptionOrNull);
        infoIsCheckable = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoIsCheckable(semanticsNode);
        info.setCheckable(infoIsCheckable);
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                info.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                info.setChecked(false);
            }
            Unit unit3 = Unit.INSTANCE;
            Unit unit4 = Unit.INSTANCE;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (role == null ? false : Role.m8877equalsimpl0(role.getValue(), Role.INSTANCE.m8888getTabo7Vup1c())) {
                info.setSelected(booleanValue);
            } else {
                info.setChecked(booleanValue);
            }
            Unit unit5 = Unit.INSTANCE;
            Unit unit6 = Unit.INSTANCE;
        }
        if (!semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
            info.setContentDescription(list != null ? (String) CollectionsKt.firstOrNull(list) : null);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getTestTag());
        if (str != null) {
            SemanticsNode semanticsNode5 = semanticsNode;
            while (true) {
                if (semanticsNode5 == null) {
                    z2 = false;
                    break;
                } else {
                    if (semanticsNode5.getUnmergedConfig().contains(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())) {
                        z2 = ((Boolean) semanticsNode5.getUnmergedConfig().get(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())).booleanValue();
                        break;
                    }
                    semanticsNode5 = semanticsNode5.getParent();
                }
            }
            if (z2) {
                info.setViewIdResourceName(str);
            }
        }
        if (((Unit) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHeading())) != null) {
            info.setHeading(true);
            Unit unit7 = Unit.INSTANCE;
            Unit unit8 = Unit.INSTANCE;
        }
        if (((Unit) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getTextEntryKey())) != null) {
            info.setTextEntryKey(true);
            Unit unit9 = Unit.INSTANCE;
            Unit unit10 = Unit.INSTANCE;
        }
        if (virtualViewId != -1) {
            int orDefault = this.drawingOrder.getOrDefault(semanticsNode.getId(), -1);
            if (orDefault != -1) {
                info.setDrawingOrder(orDefault);
                Unit unit11 = Unit.INSTANCE;
            } else {
                Integer.valueOf(Log.w(LogTag, "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?"));
            }
        }
        info.setPassword(semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
        info.setEditable(Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getIsEditable()), (Object) true));
        Integer num = (Integer) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getMaxTextLength());
        info.setMaxTextLength(num != null ? num.intValue() : -1);
        enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        info.setEnabled(enabled);
        info.setFocusable(semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getFocused()));
        if (info.isFocusable()) {
            info.setFocused(((Boolean) semanticsNode.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getFocused())).booleanValue());
            if (info.isFocused()) {
                info.addAction(2);
                this.focusedVirtualViewId = virtualViewId;
            } else {
                info.addAction(1);
            }
        }
        info.setVisibleToUser(!SemanticsOwnerKt.isHidden(semanticsNode));
        if (ComposeUiFlags.isAccessibilityShouldIncludeOffscreenChildrenEnabled) {
            if (semanticsNode.isFake$ui()) {
                semanticsNode2 = semanticsNode.getParent();
                Intrinsics.checkNotNull(semanticsNode2);
            } else {
                semanticsNode2 = semanticsNode;
            }
            setInvisibleIfEmptyBounds(info, semanticsNode2);
        }
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getLiveRegion());
        if (liveRegionMode != null) {
            int value = liveRegionMode.getValue();
            info.setLiveRegion((!LiveRegionMode.m8868equalsimpl0(value, LiveRegionMode.INSTANCE.m8873getPolite0phEisY()) && LiveRegionMode.m8868equalsimpl0(value, LiveRegionMode.INSTANCE.m8872getAssertive0phEisY())) ? 2 : 1);
            Unit unit12 = Unit.INSTANCE;
            Unit unit13 = Unit.INSTANCE;
        }
        info.setClickable(false);
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnClick());
        if (accessibilityAction != null) {
            boolean areEqual2 = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getSelected()), (Object) true);
            if (!(role == null ? false : Role.m8877equalsimpl0(role.getValue(), Role.INSTANCE.m8888getTabo7Vup1c()))) {
                if (!(role == null ? false : Role.m8877equalsimpl0(role.getValue(), Role.INSTANCE.m8886getRadioButtono7Vup1c()))) {
                    z = false;
                    info.setClickable(z || (z && !areEqual2));
                    enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                    if (enabled8 && info.isClickable()) {
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
                    }
                    Unit unit14 = Unit.INSTANCE;
                    Unit unit15 = Unit.INSTANCE;
                }
            }
            z = true;
            info.setClickable(z || (z && !areEqual2));
            enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled8) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            Unit unit142 = Unit.INSTANCE;
            Unit unit152 = Unit.INSTANCE;
        }
        info.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnLongClick());
        if (accessibilityAction2 != null) {
            info.setLongClickable(true);
            enabled7 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled7) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            Unit unit16 = Unit.INSTANCE;
            Unit unit17 = Unit.INSTANCE;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCopyText());
        if (accessibilityAction3 != null) {
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            Unit unit18 = Unit.INSTANCE;
            Unit unit19 = Unit.INSTANCE;
        }
        enabled2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled2) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetText());
            if (accessibilityAction4 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                Unit unit20 = Unit.INSTANCE;
                Unit unit21 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnImeAction());
            if (accessibilityAction5 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                Unit unit22 = Unit.INSTANCE;
                Unit unit23 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCutText());
            if (accessibilityAction6 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                Unit unit24 = Unit.INSTANCE;
                Unit unit25 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPasteText());
            if (accessibilityAction7 != null) {
                if (info.isFocused() && this.view.getClipboardManager().hasText()) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                Unit unit26 = Unit.INSTANCE;
                Unit unit27 = Unit.INSTANCE;
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (!(iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0)) {
            info.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetSelection());
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            info.addAction(256);
            info.addAction(512);
            info.setMovementGranularities(11);
            List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                excludeLineAndPageGranularities = AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode);
                if (!excludeLineAndPageGranularities) {
                    info.setMovementGranularities(info.getMovementGranularities() | 20);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ExtraDataIdKey);
            CharSequence text = info.getText();
            if (!(text == null || text.length() == 0) && semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                arrayList.add(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY);
            }
            if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTestTag())) {
                arrayList.add(ExtraDataTestTagKey);
            }
            if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getShape())) {
                arrayList.add(ExtraDataShapeTypeKey);
                arrayList.add(ExtraDataShapeRectKey);
                arrayList.add(ExtraDataShapeRectCornersKey);
                arrayList.add(ExtraDataShapeRegionKey);
            }
            ScatterSet<SemanticsPropertyKey<?>> accessibilityExtraKeys$ui = semanticsNode.getUnmergedConfig().getAccessibilityExtraKeys$ui();
            if (accessibilityExtraKeys$ui != null) {
                Object[] objArr = accessibilityExtraKeys$ui.elements;
                long[] jArr = accessibilityExtraKeys$ui.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            long j2 = j;
                            for (int i5 = 0; i5 < i4; i5++) {
                                if (((j2 & 255) < 128) && (accessibilityExtraKey = ((SemanticsPropertyKey) objArr[(i3 << 3) + i5]).getAccessibilityExtraKey()) != null) {
                                    arrayList.add(accessibilityExtraKey);
                                    Unit unit28 = Unit.INSTANCE;
                                    Unit unit29 = Unit.INSTANCE;
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                Unit unit30 = Unit.INSTANCE;
            }
            info.setAvailableExtraData(arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetProgress())) {
                info.setClassName("android.widget.SeekBar");
            } else {
                info.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                info.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetProgress())) {
                enabled6 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                if (enabled6) {
                    if (progressBarRangeInfo.getCurrent() < RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    }
                    if (progressBarRangeInfo.getCurrent() > RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.addSetProgressAction(info, semanticsNode);
        }
        CollectionInfo_androidKt.setCollectionInfo(semanticsNode, info);
        CollectionInfo_androidKt.setCollectionItemInfo(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            enabled5 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled5) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    isRtl2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    if (!isRtl2) {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    info.addAction(accessibilityActionCompat2);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    if (!isRtl) {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    info.addAction(accessibilityActionCompat);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            enabled4 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled4) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.addPageActions(info, semanticsNode);
        }
        info.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getPaneTitle()));
        enabled3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled3) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getExpand());
            if (accessibilityAction10 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                Unit unit31 = Unit.INSTANCE;
                Unit unit32 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCollapse());
            if (accessibilityAction11 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                Unit unit33 = Unit.INSTANCE;
                Unit unit34 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getDismiss());
            if (accessibilityAction12 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                Unit unit35 = Unit.INSTANCE;
                Unit unit36 = Unit.INSTANCE;
            }
            if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getCustomActions())) {
                List list3 = (List) semanticsNode.getUnmergedConfig().get(SemanticsActions.INSTANCE.getCustomActions());
                int size2 = list3.size();
                IntList intList = AccessibilityActionsResourceIds;
                if (size2 >= intList._size) {
                    throw new IllegalStateException("Can't have more than " + intList._size + " custom actions for one widget");
                }
                SparseArrayCompat<CharSequence> sparseArrayCompat = new SparseArrayCompat<>(0, 1, null);
                MutableObjectIntMap<CharSequence> mutableObjectIntMapOf = ObjectIntMapKt.mutableObjectIntMapOf();
                if (this.labelToActionId.containsKey(virtualViewId)) {
                    MutableObjectIntMap<CharSequence> mutableObjectIntMap = this.labelToActionId.get(virtualViewId);
                    MutableIntList mutableIntList = new MutableIntList(0, 1, null);
                    int[] iArr = intList.content;
                    int i6 = intList._size;
                    for (int i7 = 0; i7 < i6; i7++) {
                        mutableIntList.add(iArr[i7]);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list3.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i8);
                        Intrinsics.checkNotNull(mutableObjectIntMap);
                        if (mutableObjectIntMap.containsKey(customAccessibilityAction.getLabel())) {
                            int i9 = mutableObjectIntMap.get(customAccessibilityAction.getLabel());
                            sparseArrayCompat.put(i9, customAccessibilityAction.getLabel());
                            mutableObjectIntMapOf.set(customAccessibilityAction.getLabel(), i9);
                            mutableIntList.remove(i9);
                            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i9, customAccessibilityAction.getLabel()));
                            Unit unit37 = Unit.INSTANCE;
                        } else {
                            Boolean.valueOf(arrayList2.add(customAccessibilityAction));
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i10 = 0; i10 < size4; i10++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i10);
                        int i11 = mutableIntList.get(i10);
                        sparseArrayCompat.put(i11, customAccessibilityAction2.getLabel());
                        mutableObjectIntMapOf.set(customAccessibilityAction2.getLabel(), i11);
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i11, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i12 = 0; i12 < size5; i12++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list3.get(i12);
                        int i13 = AccessibilityActionsResourceIds.get(i12);
                        sparseArrayCompat.put(i13, customAccessibilityAction3.getLabel());
                        mutableObjectIntMapOf.set(customAccessibilityAction3.getLabel(), i13);
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i13, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.put(virtualViewId, sparseArrayCompat);
                this.labelToActionId.put(virtualViewId, mutableObjectIntMapOf);
            }
        }
        isScreenReaderFocusable = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isScreenReaderFocusable(semanticsNode, resources);
        info.setScreenReaderFocusable(isScreenReaderFocusable);
        int orDefault2 = this.idToBeforeMap.getOrDefault(virtualViewId, -1);
        if (orDefault2 != -1) {
            View semanticsIdToView2 = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui(), orDefault2);
            if (semanticsIdToView2 != null) {
                info.setTraversalBefore(semanticsIdToView2);
            } else {
                info.setTraversalBefore(this.view, orDefault2);
            }
            addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, this.ExtraDataTestTraversalBeforeVal, null);
        }
        int orDefault3 = this.idToAfterMap.getOrDefault(virtualViewId, -1);
        if (orDefault3 != -1 && (semanticsIdToView = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui(), orDefault3)) != null) {
            info.setTraversalAfter(semanticsIdToView);
            addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, this.ExtraDataTestTraversalAfterVal, null);
        }
        String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName());
        if (str2 != null) {
            info.setClassName(str2);
            Unit unit38 = Unit.INSTANCE;
            Unit unit39 = Unit.INSTANCE;
        }
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final void setContentInvalid(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        if (node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getError())) {
            info.setContentInvalid(true);
            info.setError((CharSequence) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getError()));
        }
    }

    private final void setInvisibleIfEmptyBounds(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
        if (semanticsNode.getTouchBoundsInRoot().isEmpty()) {
            accessibilityNodeInfoCompat.setVisibleToUser(false);
        }
    }

    private final SpannableString toSpannableString(AnnotatedString annotatedString) {
        return (SpannableString) trimToSize(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), ParcelSafeTextLength);
    }

    private final void setText(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        AnnotatedString infoText;
        infoText = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoText(node);
        info.setText(infoText != null ? toSpannableString(infoText) : null);
    }

    private final boolean isAccessibilityFocused(int virtualViewId) {
        return this.accessibilityFocusedVirtualViewId == virtualViewId;
    }

    private final boolean requestAccessibilityFocus(int virtualViewId) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        int i = this.accessibilityFocusedVirtualViewId;
        if (i != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final boolean sendEventForVirtualView(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !isEnabled$ui()) {
            return false;
        }
        AccessibilityEvent createEvent = createEvent(virtualViewId, eventType);
        if (contentChangeType != null) {
            createEvent.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            createEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(createEvent);
    }

    private final boolean sendEvent(AccessibilityEvent event) {
        if (!isEnabled$ui()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(event).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final AccessibilityEvent createEvent(int virtualViewId, int eventType) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(eventType);
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, virtualViewId);
        if (isEnabled$ui() && (semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(virtualViewId)) != null) {
            obtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
            AccessibilityEventCompat.setAccessibilityDataSensitive(obtain, Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig(), SemanticsProperties.INSTANCE.getIsSensitiveData()), (Object) true));
        }
        return obtain;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent createEvent = createEvent(virtualViewId, 8192);
        if (fromIndex != null) {
            createEvent.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            createEvent.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            createEvent.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            createEvent.getText().add(text);
        }
        return createEvent;
    }

    private final boolean clearAccessibilityFocus(int virtualViewId) {
        if (!isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean performActionHelper(int virtualViewId, int action, Bundle arguments) {
        SemanticsNode semanticsNode;
        Function0 function0;
        boolean enabled;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        float f;
        int i;
        float f2;
        float intBitsToFloat;
        AccessibilityAction accessibilityAction;
        Function0 function05;
        float intBitsToFloat2;
        boolean isRtl;
        AccessibilityAction accessibilityAction2;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function0 function010;
        Function0 function011;
        Function1 function1;
        AccessibilityAction accessibilityAction3;
        Function1 function12;
        Function0 function012;
        CharSequence charSequence;
        List list;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(virtualViewId);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return false;
        }
        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getIsSensitiveData()), (Object) true) && !isRequestFromAccessibilityTool()) {
            return false;
        }
        if (action == 64) {
            return requestAccessibilityFocus(virtualViewId);
        }
        if (action == 128) {
            return clearAccessibilityFocus(virtualViewId);
        }
        if (action == 256 || action == 512) {
            if (arguments != null) {
                return traverseAtGranularity(semanticsNode, arguments.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT), action == 256, arguments.getBoolean(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN));
            }
            return false;
        }
        if (action == 16384) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCopyText());
            if (accessibilityAction4 == null || (function0 = (Function0) accessibilityAction4.getAction()) == null) {
                return false;
            }
            return ((Boolean) function0.invoke()).booleanValue();
        }
        if (action != 131072) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled) {
                return false;
            }
            if (action == 1) {
                if (this.view.isInTouchMode()) {
                    this.view.requestFocusFromTouch();
                }
                AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getRequestFocus());
                if (accessibilityAction5 == null || (function02 = (Function0) accessibilityAction5.getAction()) == null) {
                    return false;
                }
                return ((Boolean) function02.invoke()).booleanValue();
            }
            if (action != 2) {
                Boolean bool = null;
                switch (action) {
                    case 16:
                        AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnClick());
                        if (accessibilityAction6 != null && (function03 = (Function0) accessibilityAction6.getAction()) != null) {
                            bool = (Boolean) function03.invoke();
                        }
                        sendEventForVirtualView$default(this, virtualViewId, 1, null, null, 12, null);
                        if (bool != null) {
                            return bool.booleanValue();
                        }
                        return false;
                    case 32:
                        AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnLongClick());
                        if (accessibilityAction7 == null || (function04 = (Function0) accessibilityAction7.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function04.invoke()).booleanValue();
                    case 4096:
                    case 8192:
                        break;
                    case 32768:
                        AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPasteText());
                        if (accessibilityAction8 == null || (function07 = (Function0) accessibilityAction8.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function07.invoke()).booleanValue();
                    case 65536:
                        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCutText());
                        if (accessibilityAction9 == null || (function08 = (Function0) accessibilityAction9.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function08.invoke()).booleanValue();
                    case 262144:
                        AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getExpand());
                        if (accessibilityAction10 == null || (function09 = (Function0) accessibilityAction10.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function09.invoke()).booleanValue();
                    case 524288:
                        AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCollapse());
                        if (accessibilityAction11 == null || (function010 = (Function0) accessibilityAction11.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function010.invoke()).booleanValue();
                    case 1048576:
                        AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getDismiss());
                        if (accessibilityAction12 == null || (function011 = (Function0) accessibilityAction12.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function011.invoke()).booleanValue();
                    case 2097152:
                        String string = arguments != null ? arguments.getString(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE) : null;
                        AccessibilityAction accessibilityAction13 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetText());
                        if (accessibilityAction13 == null || (function1 = (Function1) accessibilityAction13.getAction()) == null) {
                            return false;
                        }
                        if (string == null) {
                            string = "";
                        }
                        return ((Boolean) function1.invoke(new AnnotatedString(string, null, 2, null))).booleanValue();
                    case android.R.id.accessibilityActionShowOnScreen:
                        if (AndroidComposeUiFlags.isAccessibilityShowOnScreenNestedScrollingEnabled) {
                            return scrollOntoScreen(semanticsNode);
                        }
                        return legacyScrollOntoScreen(semanticsNode);
                    case android.R.id.accessibilityActionSetProgress:
                        if (arguments == null || !arguments.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE) || (accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null || (function12 = (Function1) accessibilityAction3.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function12.invoke(Float.valueOf(arguments.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)))).booleanValue();
                    case android.R.id.accessibilityActionImeEnter:
                        AccessibilityAction accessibilityAction14 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnImeAction());
                        if (accessibilityAction14 == null || (function012 = (Function0) accessibilityAction14.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function012.invoke()).booleanValue();
                    default:
                        switch (action) {
                            case android.R.id.accessibilityActionScrollUp:
                            case android.R.id.accessibilityActionScrollLeft:
                            case android.R.id.accessibilityActionScrollDown:
                            case android.R.id.accessibilityActionScrollRight:
                                break;
                            default:
                                switch (action) {
                                    case android.R.id.accessibilityActionPageUp:
                                        AccessibilityAction accessibilityAction15 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageUp());
                                        if (accessibilityAction15 != null && (r1 = (Function0) accessibilityAction15.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageDown:
                                        AccessibilityAction accessibilityAction16 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageDown());
                                        if (accessibilityAction16 != null && (r1 = (Function0) accessibilityAction16.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageLeft:
                                        AccessibilityAction accessibilityAction17 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageLeft());
                                        if (accessibilityAction17 != null && (r1 = (Function0) accessibilityAction17.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageRight:
                                        AccessibilityAction accessibilityAction18 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageRight());
                                        if (accessibilityAction18 != null && (r1 = (Function0) accessibilityAction18.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    default:
                                        SparseArrayCompat<CharSequence> sparseArrayCompat = this.actionIdToLabel.get(virtualViewId);
                                        if (sparseArrayCompat != null && (charSequence = sparseArrayCompat.get(action)) != null && (list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCustomActions())) != null) {
                                            int size = list.size();
                                            for (int i2 = 0; i2 < size; i2++) {
                                                CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list.get(i2);
                                                if (Intrinsics.areEqual(customAccessibilityAction.getLabel(), charSequence)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                }
                        }
                        return false;
                }
                boolean z = action == 4096;
                boolean z2 = action == 8192;
                boolean z3 = action == 16908345;
                boolean z4 = action == 16908347;
                boolean z5 = action == 16908344;
                boolean z6 = action == 16908346;
                boolean z7 = z3 || z4 || z || z2;
                boolean z8 = z5 || z6 || z || z2;
                if (z || z2) {
                    ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
                    AccessibilityAction accessibilityAction19 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress());
                    if (progressBarRangeInfo != null && accessibilityAction19 != null) {
                        float coerceAtLeast = RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue());
                        float coerceAtMost = RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue());
                        if (progressBarRangeInfo.getSteps() > 0) {
                            f = coerceAtLeast - coerceAtMost;
                            i = progressBarRangeInfo.getSteps() + 1;
                        } else {
                            f = coerceAtLeast - coerceAtMost;
                            i = 20;
                        }
                        float f3 = f / i;
                        if (z2) {
                            f3 = -f3;
                        }
                        Function1 function13 = (Function1) accessibilityAction19.getAction();
                        if (function13 != null) {
                            return ((Boolean) function13.invoke(Float.valueOf(progressBarRangeInfo.getCurrent() + f3))).booleanValue();
                        }
                        return false;
                    }
                }
                long m6552getSizeNHjbRc = LayoutCoordinatesKt.boundsInParent(semanticsNode.getLayoutInfo().getCoordinates()).m6552getSizeNHjbRc();
                Float scrollViewportLength = SemanticsUtils_androidKt.getScrollViewportLength(semanticsNode.getUnmergedConfig());
                AccessibilityAction accessibilityAction20 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getScrollBy());
                if (accessibilityAction20 == null) {
                    return false;
                }
                ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
                if (scrollAxisRange == null || !z7) {
                    f2 = 0.0f;
                } else {
                    if (scrollViewportLength != null) {
                        intBitsToFloat2 = scrollViewportLength.floatValue();
                        f2 = 0.0f;
                    } else {
                        f2 = 0.0f;
                        intBitsToFloat2 = Float.intBitsToFloat((int) (m6552getSizeNHjbRc >> 32));
                    }
                    if (z3 || z2) {
                        intBitsToFloat2 = -intBitsToFloat2;
                    }
                    if (scrollAxisRange.getReverseScrolling()) {
                        intBitsToFloat2 = -intBitsToFloat2;
                    }
                    isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    if (isRtl && (z3 || z4)) {
                        intBitsToFloat2 = -intBitsToFloat2;
                    }
                    if (performActionHelper$canScroll(scrollAxisRange, intBitsToFloat2)) {
                        if (!semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getPageLeft()) && !semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getPageRight())) {
                            Function2 function2 = (Function2) accessibilityAction20.getAction();
                            if (function2 != null) {
                                return ((Boolean) function2.invoke(Float.valueOf(intBitsToFloat2), Float.valueOf(f2))).booleanValue();
                            }
                            return false;
                        }
                        if (intBitsToFloat2 > f2) {
                            accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageRight());
                        } else {
                            accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageLeft());
                        }
                        if (accessibilityAction2 == null || (function06 = (Function0) accessibilityAction2.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function06.invoke()).booleanValue();
                    }
                }
                ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                if (scrollAxisRange2 != null && z8) {
                    if (scrollViewportLength != null) {
                        intBitsToFloat = scrollViewportLength.floatValue();
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & m6552getSizeNHjbRc));
                    }
                    if (z5 || z2) {
                        intBitsToFloat = -intBitsToFloat;
                    }
                    if (scrollAxisRange2.getReverseScrolling()) {
                        intBitsToFloat = -intBitsToFloat;
                    }
                    if (performActionHelper$canScroll(scrollAxisRange2, intBitsToFloat)) {
                        if (!semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getPageUp()) && !semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getPageDown())) {
                            Function2 function22 = (Function2) accessibilityAction20.getAction();
                            if (function22 != null) {
                                return ((Boolean) function22.invoke(Float.valueOf(f2), Float.valueOf(intBitsToFloat))).booleanValue();
                            }
                            return false;
                        }
                        if (intBitsToFloat > f2) {
                            accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageDown());
                        } else {
                            accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageUp());
                        }
                        if (accessibilityAction != null && (function05 = (Function0) accessibilityAction.getAction()) != null) {
                            return ((Boolean) function05.invoke()).booleanValue();
                        }
                    }
                }
                return false;
            }
            if (!Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getFocused()), (Object) true)) {
                return false;
            }
            this.view.getFocusOwner().mo6409clearFocusI7lrPNg(false, true, true, FocusDirection.INSTANCE.m6400getExitdhqQ8s());
            return true;
        }
        boolean accessibilitySelection = setAccessibilitySelection(semanticsNode, arguments != null ? arguments.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT, -1) : -1, arguments != null ? arguments.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT, -1) : -1, false);
        if (accessibilitySelection) {
            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 0, null, null, 12, null);
        }
        return accessibilitySelection;
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        if (f >= 0.0f || scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
            return f > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x001a -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Deprecated(message = "This method is deprecated. Use scrollOntoScreen instead.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean legacyScrollOntoScreen(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        boolean isRtl;
        Function2 function2;
        SemanticsConfiguration unmergedConfig;
        SemanticsConfiguration unmergedConfig2;
        SemanticsNode parent = semanticsNode.getParent();
        if (parent != null && (unmergedConfig2 = parent.getUnmergedConfig()) != null) {
            accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig2, SemanticsActions.INSTANCE.getScrollBy());
            while (parent != null && accessibilityAction == null) {
                parent = parent.getParent();
                if (parent != null && (unmergedConfig = parent.getUnmergedConfig()) != null) {
                    accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsActions.INSTANCE.getScrollBy());
                }
            }
            if (parent != null) {
                androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                return this.view.requestRectangleOnScreen(new Rect((int) Math.floor(boundsInRoot.getLeft()), (int) Math.floor(boundsInRoot.getTop()), MathKt.roundToInt((float) Math.ceil(boundsInRoot.getRight())), MathKt.roundToInt((float) Math.ceil(boundsInRoot.getBottom()))));
            }
            androidx.compose.ui.geometry.Rect boundsInParent = LayoutCoordinatesKt.boundsInParent(parent.getLayoutInfo().getCoordinates());
            LayoutCoordinates parentLayoutCoordinates = parent.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
            androidx.compose.ui.geometry.Rect m6556translatek4lQ0M = boundsInParent.m6556translatek4lQ0M(parentLayoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(parentLayoutCoordinates) : Offset.INSTANCE.m6535getZeroF1C5BW0());
            androidx.compose.ui.geometry.Rect m6559Recttz77jQw = RectKt.m6559Recttz77jQw(semanticsNode.m8891getPositionInRootF1C5BW0(), IntSizeKt.m9919toSizeozmzZPI(semanticsNode.m8894getSizeYbymL2g()));
            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
            float legacyScrollOntoScreen$scrollDelta = legacyScrollOntoScreen$scrollDelta(m6559Recttz77jQw.getLeft() - m6556translatek4lQ0M.getLeft(), m6559Recttz77jQw.getRight() - m6556translatek4lQ0M.getRight());
            if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
                legacyScrollOntoScreen$scrollDelta = -legacyScrollOntoScreen$scrollDelta;
            }
            isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
            if (isRtl) {
                legacyScrollOntoScreen$scrollDelta = -legacyScrollOntoScreen$scrollDelta;
            }
            float legacyScrollOntoScreen$scrollDelta2 = legacyScrollOntoScreen$scrollDelta(m6559Recttz77jQw.getTop() - m6556translatek4lQ0M.getTop(), m6559Recttz77jQw.getBottom() - m6556translatek4lQ0M.getBottom());
            if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
                legacyScrollOntoScreen$scrollDelta2 = -legacyScrollOntoScreen$scrollDelta2;
            }
            return (accessibilityAction == null || (function2 = (Function2) accessibilityAction.getAction()) == null || !((Boolean) function2.invoke(Float.valueOf(legacyScrollOntoScreen$scrollDelta), Float.valueOf(legacyScrollOntoScreen$scrollDelta2))).booleanValue()) ? false : true;
        }
        accessibilityAction = null;
        while (parent != null) {
            parent = parent.getParent();
            if (parent != null) {
                accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsActions.INSTANCE.getScrollBy());
            }
            accessibilityAction = null;
            while (parent != null) {
            }
        }
        if (parent != null) {
        }
    }

    private static final float legacyScrollOntoScreen$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x001a -> B:6:0x001b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean scrollOntoScreen(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        SemanticsConfiguration unmergedConfig;
        SemanticsConfiguration unmergedConfig2;
        SemanticsNode parent = semanticsNode.getParent();
        if (parent != null && (unmergedConfig2 = parent.getUnmergedConfig()) != null) {
            accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig2, SemanticsActions.INSTANCE.getScrollBy());
            while (accessibilityAction == null && parent != null) {
                parent = parent.getParent();
                if (parent != null && (unmergedConfig = parent.getUnmergedConfig()) != null) {
                    accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsActions.INSTANCE.getScrollBy());
                }
            }
            if (parent != null) {
                androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                return this.view.requestRectangleOnScreen(new Rect((int) Math.floor(boundsInRoot.getLeft()), (int) Math.floor(boundsInRoot.getTop()), MathKt.roundToInt((float) Math.ceil(boundsInRoot.getRight())), MathKt.roundToInt((float) Math.ceil(boundsInRoot.getBottom()))));
            }
            long m6535getZeroF1C5BW0 = Offset.INSTANCE.m6535getZeroF1C5BW0();
            boolean z = false;
            while (parent != null) {
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig(), SemanticsActions.INSTANCE.getScrollBy());
                if (accessibilityAction2 != null) {
                    long m8746scrollDxDyForNodeVisibleRE3cj74 = m8746scrollDxDyForNodeVisibleRE3cj74(semanticsNode, parent, m6535getZeroF1C5BW0);
                    long m8743adjustForReversedScrollingAndRtlRE3cj74 = m8743adjustForReversedScrollingAndRtlRE3cj74(semanticsNode, parent, m8746scrollDxDyForNodeVisibleRE3cj74);
                    Function2 function2 = (Function2) accessibilityAction2.getAction();
                    z = (function2 != null && ((Boolean) function2.invoke(Float.valueOf(Float.intBitsToFloat((int) (m8743adjustForReversedScrollingAndRtlRE3cj74 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (m8743adjustForReversedScrollingAndRtlRE3cj74 & 4294967295L))))).booleanValue()) || z;
                    m6535getZeroF1C5BW0 = Offset.m6523minusMKHz9U(m6535getZeroF1C5BW0, m8746scrollDxDyForNodeVisibleRE3cj74);
                }
                parent = parent.getParent();
            }
            return z;
        }
        accessibilityAction = null;
        while (accessibilityAction == null) {
            parent = parent.getParent();
            if (parent != null) {
                accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsActions.INSTANCE.getScrollBy());
            }
            accessibilityAction = null;
            while (accessibilityAction == null) {
            }
        }
        if (parent != null) {
        }
    }

    /* renamed from: adjustForReversedScrollingAndRtl-RE3cj74, reason: not valid java name */
    private final long m8743adjustForReversedScrollingAndRtlRE3cj74(SemanticsNode semanticsNode, SemanticsNode semanticsNode2, long j) {
        boolean isRtl;
        if (Offset.m6516equalsimpl0(j, Offset.INSTANCE.m6535getZeroF1C5BW0())) {
            return j;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
            intBitsToFloat = -intBitsToFloat;
        }
        isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
        if (isRtl) {
            intBitsToFloat = -intBitsToFloat;
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
            intBitsToFloat2 = -intBitsToFloat2;
        }
        return Offset.m6511constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: scrollDxDyForNodeVisible-RE3cj74, reason: not valid java name */
    private final long m8746scrollDxDyForNodeVisibleRE3cj74(SemanticsNode semanticsNode, SemanticsNode semanticsNode2, long j) {
        androidx.compose.ui.geometry.Rect boundsInParent = LayoutCoordinatesKt.boundsInParent(semanticsNode2.getLayoutInfo().getCoordinates());
        LayoutCoordinates parentLayoutCoordinates = semanticsNode2.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
        androidx.compose.ui.geometry.Rect m6556translatek4lQ0M = boundsInParent.m6556translatek4lQ0M(parentLayoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(parentLayoutCoordinates) : Offset.INSTANCE.m6535getZeroF1C5BW0());
        androidx.compose.ui.geometry.Rect m6559Recttz77jQw = RectKt.m6559Recttz77jQw(Offset.m6524plusMKHz9U(semanticsNode.m8891getPositionInRootF1C5BW0(), j), IntSizeKt.m9919toSizeozmzZPI(semanticsNode.m8894getSizeYbymL2g()));
        return Offset.m6511constructorimpl((Float.floatToRawIntBits(scrollDxDyForNodeVisible_RE3cj74$scrollDelta(m6559Recttz77jQw.getLeft() - m6556translatek4lQ0M.getLeft(), m6559Recttz77jQw.getRight() - m6556translatek4lQ0M.getRight())) << 32) | (4294967295L & Float.floatToRawIntBits(scrollDxDyForNodeVisible_RE3cj74$scrollDelta(m6559Recttz77jQw.getTop() - m6556translatek4lQ0M.getTop(), m6559Recttz77jQw.getBottom() - m6556translatek4lQ0M.getBottom()))));
    }

    private static final float scrollDxDyForNodeVisible_RE3cj74$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, AccessibilityNodeInfoCompat info, String extraDataKey, Bundle arguments) {
        SemanticsNode semanticsNode;
        float[] cornerArray;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(virtualViewId);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
            int orDefault = this.idToBeforeMap.getOrDefault(virtualViewId, -1);
            if (orDefault != -1) {
                info.getExtras().putInt(extraDataKey, orDefault);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
            int orDefault2 = this.idToAfterMap.getOrDefault(virtualViewId, -1);
            if (orDefault2 != -1) {
                info.getExtras().putInt(extraDataKey, orDefault2);
                return;
            }
            return;
        }
        int i = 0;
        if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && arguments != null && Intrinsics.areEqual(extraDataKey, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY)) {
            int i2 = arguments.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX, -1);
            int i3 = arguments.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH, -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                    TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig());
                    if (textLayoutResult == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = i2 + i4;
                        if (i5 >= textLayoutResult.getLayoutInput().getText().length()) {
                            arrayList.add(null);
                        } else {
                            arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i5)));
                        }
                    }
                    info.getExtras().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e(LogTag, "Invalid arguments for accessibility character locations");
            return;
        }
        if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTestTag()) && arguments != null && Intrinsics.areEqual(extraDataKey, ExtraDataTestTagKey)) {
            String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getTestTag());
            if (str != null) {
                info.getExtras().putCharSequence(extraDataKey, str);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, ExtraDataIdKey)) {
            info.getExtras().putInt(extraDataKey, semanticsNode.getId());
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, ExtraDataShapeTypeKey)) {
            Shape shape = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getShape());
            if (shape != null) {
                androidx.compose.ui.geometry.Rect shapeBounds = getShapeBounds(semanticsNode, getBoundsInScreen(info), shape);
                Outline m8745createOutline12SF9DM = m8745createOutline12SF9DM(shape, shapeBounds.m6552getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection());
                if (m8745createOutline12SF9DM instanceof Outline.Rectangle) {
                    info.getExtras().putInt(ExtraDataShapeTypeKey, 0);
                    info.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(m8745createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                    return;
                } else if (m8745createOutline12SF9DM instanceof Outline.Rounded) {
                    info.getExtras().putInt(ExtraDataShapeTypeKey, 1);
                    info.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(m8745createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                    info.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, toCornerArray(m8745createOutline12SF9DM));
                    return;
                } else {
                    if (m8745createOutline12SF9DM instanceof Outline.Generic) {
                        info.getExtras().putInt(ExtraDataShapeTypeKey, 2);
                        info.getExtras().putParcelable(ExtraDataShapeRegionKey, toRegion(m8745createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, ExtraDataShapeRectKey)) {
            Shape shape2 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getShape());
            if (shape2 != null) {
                androidx.compose.ui.geometry.Rect shapeBounds2 = getShapeBounds(semanticsNode, getBoundsInScreen(info), shape2);
                Rect androidRect = toAndroidRect(m8745createOutline12SF9DM(shape2, shapeBounds2.m6552getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()), shapeBounds2.getLeft(), shapeBounds2.getTop());
                if (androidRect != null) {
                    info.getExtras().putParcelable(ExtraDataShapeRectKey, androidRect);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, ExtraDataShapeRectCornersKey)) {
            Shape shape3 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getShape());
            if (shape3 == null || (cornerArray = toCornerArray(m8745createOutline12SF9DM(shape3, getShapeBounds(semanticsNode, getBoundsInScreen(info), shape3).m6552getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()))) == null) {
                return;
            }
            info.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, cornerArray);
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, ExtraDataShapeRegionKey)) {
            Shape shape4 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getShape());
            if (shape4 != null) {
                androidx.compose.ui.geometry.Rect shapeBounds3 = getShapeBounds(semanticsNode, getBoundsInScreen(info), shape4);
                Region region = toRegion(m8745createOutline12SF9DM(shape4, shapeBounds3.m6552getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()), shapeBounds3.getLeft(), shapeBounds3.getTop());
                if (region != null) {
                    info.getExtras().putParcelable(ExtraDataShapeRegionKey, region);
                    return;
                }
                return;
            }
            return;
        }
        ScatterSet<SemanticsPropertyKey<?>> accessibilityExtraKeys$ui = semanticsNode.getUnmergedConfig().getAccessibilityExtraKeys$ui();
        if (accessibilityExtraKeys$ui == null) {
            return;
        }
        Object[] objArr = accessibilityExtraKeys$ui.elements;
        long[] jArr = accessibilityExtraKeys$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = i; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i6 << 3) + i8];
                        String accessibilityExtraKey = semanticsPropertyKey.getAccessibilityExtraKey();
                        if (Intrinsics.areEqual(accessibilityExtraKey, extraDataKey)) {
                            Object orNull = SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsPropertyKey);
                            if (orNull instanceof Serializable) {
                                info.getExtras().putSerializable(accessibilityExtraKey, (Serializable) orNull);
                            } else {
                                if (!(orNull instanceof Parcelable)) {
                                    throw new IllegalStateException("Accessibility extra values must be either Serializable or Parcelable.");
                                }
                                info.getExtras().putParcelable(accessibilityExtraKey, (Parcelable) orNull);
                            }
                        } else {
                            continue;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            }
            i6++;
            i = 0;
        }
    }

    private final Rect getBoundsInScreen(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Rect rect = new Rect();
        accessibilityNodeInfoCompat.getBoundsInScreen(rect);
        return rect;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1] */
    private final androidx.compose.ui.geometry.Rect getShapeBounds(SemanticsNode node, Rect nodeBoundsInScreen, final Shape shape) {
        Modifier.Node node2;
        ?? r0 = new SemanticsPropertyReceiver() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1
            private boolean hasMatchedShape;

            public final boolean getHasMatchedShape() {
                return this.hasMatchedShape;
            }

            public final void setHasMatchedShape(boolean z) {
                this.hasMatchedShape = z;
            }

            @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
            public <T> void set(SemanticsPropertyKey<T> key, T value) {
                if (value == Shape.this) {
                    this.hasMatchedShape = true;
                }
            }
        };
        LayoutNode layoutNode = node.getLayoutNode();
        NodeChain nodes = layoutNode.getNodes();
        int m8612constructorimpl = NodeKind.m8612constructorimpl(8);
        Object obj = null;
        if ((nodes.getAggregateChildKindSet() & m8612constructorimpl) != 0) {
            Modifier.Node head = nodes.getHead();
            loop0: while (true) {
                if (head == null) {
                    break;
                }
                if ((head.getKindSet() & m8612constructorimpl) != 0) {
                    Modifier.Node node3 = head;
                    MutableVector mutableVector = null;
                    while (node3 != null) {
                        if (node3 instanceof SemanticsModifierNode) {
                            ((SemanticsModifierNode) node3).applySemantics((SemanticsPropertyReceiver) r0);
                            if (r0.getHasMatchedShape()) {
                                obj = node3;
                                break loop0;
                            }
                        } else if ((node3.getKindSet() & m8612constructorimpl) != 0 && (node3 instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate = ((DelegatingNode) node3).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & m8612constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node3 = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node3 != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(node3);
                                            }
                                            node3 = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node3 = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & m8612constructorimpl) == 0) {
                    break;
                }
                head = head.getChild();
            }
        }
        SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) obj;
        if (semanticsModifierNode == null || (node2 = semanticsModifierNode.getNode()) == null || !node2.getIsAttached()) {
            return LayoutCoordinatesKt.boundsInWindow(layoutNode.getOuterCoordinator$ui(), false);
        }
        LayoutCoordinates requireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(semanticsModifierNode);
        androidx.compose.ui.geometry.Rect localBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(requireLayoutCoordinates).localBoundingBoxOf(requireLayoutCoordinates, false);
        return toBoundsRelativeToNodeBounds(toBoundsInScreen(localBoundingBoxOf.getLeft(), localBoundingBoxOf.getTop(), localBoundingBoxOf.getRight(), localBoundingBoxOf.getBottom()), nodeBoundsInScreen);
    }

    private final androidx.compose.ui.geometry.Rect toBoundsRelativeToNodeBounds(Rect rect, Rect rect2) {
        float f = rect.left - rect2.left;
        float f2 = rect.top - rect2.top;
        return new androidx.compose.ui.geometry.Rect(f, f2, rect.width() + f, rect.height() + f2);
    }

    private final RectF toScreenCoords(SemanticsNode textNode, androidx.compose.ui.geometry.Rect bounds) {
        if (textNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect m6556translatek4lQ0M = bounds.m6556translatek4lQ0M(textNode.m8891getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = textNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect intersect = m6556translatek4lQ0M.overlaps(boundsInRoot) ? m6556translatek4lQ0M.intersect(boundsInRoot) : null;
        if (intersect == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.view;
        float left = intersect.getLeft();
        long mo8233localToScreenMKHz9U = androidComposeView.mo8233localToScreenMKHz9U(Offset.m6511constructorimpl((Float.floatToRawIntBits(intersect.getTop()) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        long mo8233localToScreenMKHz9U2 = this.view.mo8233localToScreenMKHz9U(Offset.m6511constructorimpl((Float.floatToRawIntBits(intersect.getRight()) << 32) | (Float.floatToRawIntBits(intersect.getBottom()) & 4294967295L)));
        int i = (int) (mo8233localToScreenMKHz9U >> 32);
        int i2 = (int) (mo8233localToScreenMKHz9U2 >> 32);
        int i3 = (int) (mo8233localToScreenMKHz9U & 4294967295L);
        int i4 = (int) (mo8233localToScreenMKHz9U2 & 4294967295L);
        return new RectF(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)));
    }

    /* renamed from: createOutline-12SF9DM, reason: not valid java name */
    private final Outline m8745createOutline12SF9DM(Shape shape, long j, LayoutDirection layoutDirection) {
        return shape.mo422createOutlinePq9zytI(j, layoutDirection, this.view.getDensity());
    }

    private final Rect toAndroidRect(Outline outline, float f, float f2) {
        if ((outline instanceof Outline.Rectangle) || (outline instanceof Outline.Rounded)) {
            return toAndroidRect(outline.getRect(), f, f2);
        }
        return null;
    }

    private final float[] toCornerArray(Outline outline) {
        if (!(outline instanceof Outline.Rounded)) {
            return null;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        return new float[]{Float.intBitsToFloat((int) (rounded.getRoundRect().m6569getTopLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m6569getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m6570getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m6570getTopRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m6568getBottomRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m6568getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m6567getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m6567getBottomLeftCornerRadiuskKHJgLs() & 4294967295L))};
    }

    private final Region toRegion(Outline outline, float f, float f2) {
        if (!(outline instanceof Outline.Generic)) {
            return null;
        }
        Outline.Generic generic = (Outline.Generic) outline;
        Region region = new Region(toAndroidRect$default(this, generic.getRect().translate(f, f2), 0.0f, 0.0f, 3, null));
        Region region2 = new Region();
        Path path = generic.getPath();
        if (path instanceof AndroidPath) {
            android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
            internalPath.offset(f, f2);
            region2.setPath(internalPath, region);
            return region2;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    static /* synthetic */ Rect toAndroidRect$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, androidx.compose.ui.geometry.Rect rect, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return androidComposeViewAccessibilityDelegateCompat.toAndroidRect(rect, f, f2);
    }

    private final Rect toAndroidRect(androidx.compose.ui.geometry.Rect rect, float f, float f2) {
        return new Rect((int) (rect.getLeft() + f), (int) (rect.getTop() + f2), (int) (rect.getRight() + f), (int) (rect.getBottom() + f2));
    }

    public final boolean dispatchHoverEvent$ui(MotionEvent event) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int hitTestSemanticsAt$ui = hitTestSemanticsAt$ui(event.getX(), event.getY());
            boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(event);
            updateHoveredVirtualView(hitTestSemanticsAt$ui);
            if (hitTestSemanticsAt$ui == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
        return this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(event);
    }

    public final int hitTestSemanticsAt$ui(float x, float y) {
        int i;
        Owner.CC.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m8518hitTestSemantics6fMxITs$ui$default(this.view.getRoot(), Offset.m6511constructorimpl((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32)), hitTestResult, 0, false, 12, null);
        int lastIndex = CollectionsKt.getLastIndex(hitTestResult);
        while (true) {
            i = Integer.MIN_VALUE;
            if (-1 >= lastIndex) {
                break;
            }
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(hitTestResult.get(lastIndex));
            if (this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(requireLayoutNode) != null) {
                return Integer.MIN_VALUE;
            }
            if (requireLayoutNode.getNodes().m8572hasH91voCI$ui(NodeKind.m8612constructorimpl(8))) {
                i = semanticsNodeIdToAccessibilityVirtualNodeId(requireLayoutNode.getSemanticsId());
                SemanticsNode SemanticsNode = SemanticsNodeKt.SemanticsNode(requireLayoutNode, false);
                if (SemanticsOwnerKt.isImportantForAccessibility(SemanticsNode) && !SemanticsNode_androidKt.isAccessibilityIgnoredLink(SemanticsNode)) {
                    break;
                }
            }
            lastIndex--;
        }
        return i;
    }

    private final void updateHoveredVirtualView(int virtualViewId) {
        int i = this.hoveredVirtualViewId;
        if (i == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        sendEventForVirtualView$default(this, virtualViewId, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i, 256, null, null, 12, null);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View host) {
        return this.nodeProvider;
    }

    private final <T extends CharSequence> T trimToSize(T text, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be greater than 0".toString());
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i = size - 1;
        if (Character.isHighSurrogate(text.charAt(i)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i;
        }
        T t = (T) text.subSequence(0, size);
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.CC.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Unit unit2 = Unit.INSTANCE;
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    public final void onSemanticsChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handler = getHandler();
        if (!isEnabled$ui() || this.checkingForSemanticsChanges || handler == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handler.post(this.semanticsChangeChecker);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r7, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:12:0x0032, B:14:0x005a, B:20:0x006a, B:22:0x0072, B:24:0x007b, B:26:0x0086, B:28:0x0097, B:31:0x00a4, B:32:0x00ab, B:40:0x0047, B:42:0x004e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c6 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object boundsUpdatesEventLoop$ui(Continuation<? super Unit> continuation) {
        AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1;
        int i;
        MutableIntSet mutableIntSet;
        ChannelIterator<Unit> it;
        MutableIntSet mutableIntSet2;
        Object hasNext;
        try {
            if (continuation instanceof AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = (AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) continuation;
                if ((androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label & Integer.MIN_VALUE) != 0) {
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label -= Integer.MIN_VALUE;
                    Object obj = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutableIntSet = new MutableIntSet(0, 1, null);
                        it = this.boundsUpdateChannel.iterator();
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = mutableIntSet;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                        hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } else if (i == 1) {
                        it = (ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        mutableIntSet2 = (MutableIntSet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        mutableIntSet2 = (MutableIntSet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutableIntSet = mutableIntSet2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = mutableIntSet;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                        hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (hasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableIntSet2 = mutableIntSet;
                        obj = hasNext;
                        if (!((Boolean) obj).booleanValue()) {
                            it.next();
                            if (isEnabled$ui()) {
                                int size = this.subtreeChangedLayoutNodes.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    LayoutNode valueAt = this.subtreeChangedLayoutNodes.valueAt(i2);
                                    sendSubtreeChangeAccessibilityEvents(valueAt, mutableIntSet2);
                                    sendTypeViewScrolledAccessibilityEvent(valueAt);
                                }
                                mutableIntSet2.clear();
                                Handler handler = getHandler();
                                if (!this.checkingForSemanticsChanges && handler != null) {
                                    this.checkingForSemanticsChanges = true;
                                    handler.post(this.semanticsChangeChecker);
                                }
                            }
                            this.subtreeChangedLayoutNodes.clear();
                            this.pendingHorizontalScrollEvents.clear();
                            this.pendingVerticalScrollEvents.clear();
                            long j = this.SendRecurringAccessibilityEventsIntervalMillis;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = mutableIntSet2;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = it;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 2;
                        } else {
                            this.subtreeChangedLayoutNodes.clear();
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.subtreeChangedLayoutNodes.clear();
            throw th;
        }
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = new AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, continuation);
        Object obj2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
    }

    public final void onLayoutChange$ui(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo11990trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRange = this.pendingHorizontalScrollEvents.get(semanticsId);
            ScrollAxisRange scrollAxisRange2 = this.pendingVerticalScrollEvents.get(semanticsId);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent createEvent = createEvent(semanticsId, 4096);
            if (scrollAxisRange != null) {
                createEvent.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
                createEvent.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (scrollAxisRange2 != null) {
                createEvent.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
                createEvent.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
            }
            sendEvent(createEvent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, MutableIntSet subtreeChangedSemanticsNodesIds) {
        SemanticsConfiguration semanticsConfiguration;
        LayoutNode findClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes().m8572hasH91voCI$ui(NodeKind.m8612constructorimpl(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        return Boolean.valueOf(layoutNode2.getNodes().m8572hasH91voCI$ui(NodeKind.m8612constructorimpl(8)));
                    }
                });
            }
            if (layoutNode == null || (semanticsConfiguration = layoutNode.getSemanticsConfiguration()) == null) {
                return;
            }
            if (!semanticsConfiguration.getIsMergingSemanticsOfDescendants() && findClosestParentNode != null) {
                layoutNode = findClosestParentNode;
            }
            if (layoutNode != null) {
                int semanticsId = layoutNode.getSemanticsId();
                if (subtreeChangedSemanticsNodesIds.add(semanticsId)) {
                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, null, 8, null);
                }
            }
        }
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Unit unit2 = Unit.INSTANCE;
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                    Unit unit3 = Unit.INSTANCE;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        long j;
        long j2;
        long j3;
        long j4;
        SemanticsConfiguration unmergedConfig;
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        MutableIntSet mutableIntSet2 = this.paneDisplayed;
        int[] iArr = mutableIntSet2.elements;
        long[] jArr = mutableIntSet2.metadata;
        int length = jArr.length - 2;
        long j5 = 128;
        long j6 = 255;
        char c = 7;
        long j7 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j8 = jArr[i];
                int[] iArr2 = iArr;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j8 & j6) < j5) {
                            j3 = j5;
                            int i4 = iArr2[(i << 3) + i3];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i4);
                            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode != null) {
                                j4 = j6;
                                if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle())) {
                                }
                            } else {
                                j4 = j6;
                            }
                            mutableIntSet.add(i4);
                            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(i4);
                            sendPaneChangeEvents(i4, 32, (semanticsNodeCopy == null || (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) == null) ? null : (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle()));
                        } else {
                            j3 = j5;
                            j4 = j6;
                        }
                        j8 >>= 8;
                        i3++;
                        j5 = j3;
                        j6 = j4;
                    }
                    j = j5;
                    j2 = j6;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    j = j5;
                    j2 = j6;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr = iArr2;
                j5 = j;
                j6 = j2;
            }
        } else {
            j = 128;
            j2 = 255;
        }
        this.paneDisplayed.removeAll(mutableIntSet);
        this.previousSemanticsNodes.clear();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes = getCurrentSemanticsNodes();
        int[] iArr3 = currentSemanticsNodes.keys;
        Object[] objArr = currentSemanticsNodes.values;
        long[] jArr2 = currentSemanticsNodes.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i5 = 0;
            while (true) {
                long j9 = jArr2[i5];
                if ((((~j9) << c) & j9 & j7) != j7) {
                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j9 & j2) < j) {
                            int i8 = (i5 << 3) + i7;
                            int i9 = iArr3[i8];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) objArr[i8];
                            if (semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle()) && this.paneDisplayed.add(i9)) {
                                sendPaneChangeEvents(i9, 16, (String) semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig().get(SemanticsProperties.INSTANCE.getPaneTitle()));
                            }
                            this.previousSemanticsNodes.set(i9, new SemanticsNodeCopy(semanticsNodeWithAdjustedBounds2.getSemanticsNode(), getCurrentSemanticsNodes()));
                        }
                        j9 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length2) {
                    break;
                }
                i5++;
                c = 7;
                j7 = -9187201950435737472L;
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    private final void sendSemanticsPropertyChangeEvents(IntObjectMap<SemanticsNodeWithAdjustedBounds> newSemanticsNodes) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        int i2;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        char c;
        int i4;
        int i5;
        SemanticsNode semanticsNode;
        int i6;
        boolean z;
        Object[] objArr;
        int i7;
        int i8;
        Object[] objArr2;
        ArrayList arrayList3;
        int i9;
        long[] jArr3;
        SemanticsNode semanticsNode2;
        int[] iArr3;
        int i10;
        int i11;
        int i12;
        boolean accessibilityEquals;
        String text;
        int i13;
        int i14;
        int i15;
        boolean z2;
        AccessibilityEvent createTextSelectionChangedEvent;
        boolean sendEventForVirtualView$default;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap = newSemanticsNodes;
        ArrayList arrayList4 = new ArrayList(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes);
        androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes.clear();
        int[] iArr4 = intObjectMap.keys;
        long[] jArr4 = intObjectMap.metadata;
        int i16 = 2;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j = jArr4[i17];
            char c2 = 7;
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i18 = 8;
                int i19 = 8 - ((~(i17 - length)) >>> 31);
                long j2 = j;
                int i20 = 0;
                while (i20 < i19) {
                    if ((j2 & 255) < 128) {
                        int i21 = iArr4[(i17 << 3) + i20];
                        SemanticsNodeCopy semanticsNodeCopy = androidComposeViewAccessibilityDelegateCompat.previousSemanticsNodes.get(i21);
                        if (semanticsNodeCopy == null) {
                            i2 = i20;
                            arrayList2 = arrayList4;
                            iArr2 = iArr4;
                            jArr2 = jArr4;
                            i3 = i16;
                            c = c2;
                            i4 = i19;
                        } else {
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap.get(i21);
                            SemanticsNode semanticsNode3 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode3 != null) {
                                MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui = semanticsNode3.getUnmergedConfig().getProps$ui();
                                i3 = i16;
                                Object[] objArr3 = props$ui.keys;
                                Object[] objArr4 = props$ui.values;
                                long[] jArr5 = props$ui.metadata;
                                c = c2;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    int i22 = i18;
                                    SemanticsNode semanticsNode4 = semanticsNode3;
                                    z = false;
                                    int i23 = 0;
                                    while (true) {
                                        long j3 = jArr5[i23];
                                        long[] jArr6 = jArr5;
                                        if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                            long j4 = j3;
                                            int i25 = 0;
                                            while (i25 < i24) {
                                                if ((j4 & 255) < 128) {
                                                    int i26 = (i23 << 3) + i25;
                                                    Object obj = objArr3[i26];
                                                    Object obj2 = objArr4[i26];
                                                    SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                                                    i8 = i20;
                                                    if (((Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) ? androidComposeViewAccessibilityDelegateCompat.registerScrollingId(i21, arrayList4) : false) || !Intrinsics.areEqual(obj2, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsPropertyKey))) {
                                                        if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getPaneTitle())) {
                                                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                                                            String str = (String) obj2;
                                                            if (semanticsNodeCopy.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle())) {
                                                                androidComposeViewAccessibilityDelegateCompat.sendPaneChangeEvents(i21, i22, str);
                                                            }
                                                            Unit unit = Unit.INSTANCE;
                                                        } else {
                                                            if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getStateDescription())) {
                                                                i9 = i25;
                                                                arrayList3 = arrayList4;
                                                                jArr3 = jArr4;
                                                                objArr2 = objArr3;
                                                                i12 = i19;
                                                                i10 = i23;
                                                                semanticsNode2 = semanticsNode4;
                                                                iArr3 = iArr4;
                                                                i11 = i21;
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i21), 2048, 64, null, 8, null);
                                                                Boolean.valueOf(sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 2048, 0, null, 8, null));
                                                            } else {
                                                                i9 = i25;
                                                                arrayList3 = arrayList4;
                                                                jArr3 = jArr4;
                                                                objArr2 = objArr3;
                                                                i10 = i23;
                                                                i12 = i19;
                                                                semanticsNode2 = semanticsNode4;
                                                                iArr3 = iArr4;
                                                                i11 = i21;
                                                                if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getToggleableState())) {
                                                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 2048, 8192, null, 8, null);
                                                                    Boolean.valueOf(sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 2048, 0, null, 8, null));
                                                                } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getError())) {
                                                                    Boolean.valueOf(sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 2048, 3072, null, 8, null));
                                                                } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getProgressBarRangeInfo())) {
                                                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 2048, 64, null, 8, null);
                                                                    Boolean.valueOf(sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 2048, 0, null, 8, null));
                                                                } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getSelected())) {
                                                                    Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
                                                                    if (role == null ? false : Role.m8877equalsimpl0(role.getValue(), Role.INSTANCE.m8888getTabo7Vup1c())) {
                                                                        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getSelected()), (Object) true)) {
                                                                            AccessibilityEvent createEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 4);
                                                                            SemanticsNode copyWithMergingEnabled$ui = semanticsNode2.copyWithMergingEnabled$ui();
                                                                            List list = (List) SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui.getConfig(), SemanticsProperties.INSTANCE.getContentDescription());
                                                                            String fastJoinToString$default = list != null ? ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null) : null;
                                                                            List list2 = (List) SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui.getConfig(), SemanticsProperties.INSTANCE.getText());
                                                                            String fastJoinToString$default2 = list2 != null ? ListUtilsKt.fastJoinToString$default(list2, ",", null, null, 0, null, null, 62, null) : null;
                                                                            if (fastJoinToString$default != null) {
                                                                                createEvent.setContentDescription(fastJoinToString$default);
                                                                                Unit unit2 = Unit.INSTANCE;
                                                                                Unit unit3 = Unit.INSTANCE;
                                                                            }
                                                                            if (fastJoinToString$default2 != null) {
                                                                                Boolean.valueOf(createEvent.getText().add(fastJoinToString$default2));
                                                                            }
                                                                            sendEventForVirtualView$default = androidComposeViewAccessibilityDelegateCompat.sendEvent(createEvent);
                                                                        } else {
                                                                            sendEventForVirtualView$default = sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 2048, 0, null, 8, null);
                                                                        }
                                                                    } else {
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 2048, 64, null, 8, null);
                                                                        sendEventForVirtualView$default = sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 2048, 0, null, 8, null);
                                                                    }
                                                                    Boolean.valueOf(sendEventForVirtualView$default);
                                                                } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getContentDescription())) {
                                                                    int semanticsNodeIdToAccessibilityVirtualNodeId = androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11);
                                                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                    Boolean.valueOf(androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(semanticsNodeIdToAccessibilityVirtualNodeId, 2048, 4, (List) obj2));
                                                                } else {
                                                                    String str2 = "";
                                                                    if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getEditableText())) {
                                                                        if (semanticsNode2.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetText())) {
                                                                            AnnotatedString textForTextField = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                                                            String str3 = textForTextField != null ? textForTextField : "";
                                                                            AnnotatedString textForTextField2 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNode2.getUnmergedConfig());
                                                                            String str4 = textForTextField2 != null ? textForTextField2 : "";
                                                                            CharSequence trimToSize = androidComposeViewAccessibilityDelegateCompat.trimToSize(str4, ParcelSafeTextLength);
                                                                            int length3 = str3.length();
                                                                            int length4 = str4.length();
                                                                            int coerceAtMost = RangesKt.coerceAtMost(length3, length4);
                                                                            int i27 = 0;
                                                                            while (true) {
                                                                                i13 = length3;
                                                                                if (i27 >= coerceAtMost) {
                                                                                    i14 = length4;
                                                                                    break;
                                                                                }
                                                                                i14 = length4;
                                                                                if (str3.charAt(i27) != str4.charAt(i27)) {
                                                                                    break;
                                                                                }
                                                                                i27++;
                                                                                length3 = i13;
                                                                                length4 = i14;
                                                                            }
                                                                            int i28 = 0;
                                                                            while (true) {
                                                                                if (i28 >= coerceAtMost - i27) {
                                                                                    i15 = i28;
                                                                                    break;
                                                                                }
                                                                                i15 = i28;
                                                                                if (str3.charAt((i13 - 1) - i28) != str4.charAt((i14 - 1) - i15)) {
                                                                                    break;
                                                                                } else {
                                                                                    i28 = i15 + 1;
                                                                                }
                                                                            }
                                                                            int i29 = (i13 - i15) - i27;
                                                                            int i30 = (i14 - i15) - i27;
                                                                            boolean contains = semanticsNodeCopy.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword());
                                                                            boolean contains2 = semanticsNode2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword());
                                                                            boolean contains3 = semanticsNodeCopy.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText());
                                                                            boolean z3 = contains3 && !contains && contains2;
                                                                            boolean z4 = contains3 && contains && !contains2;
                                                                            if (z3 || z4) {
                                                                                z2 = z3;
                                                                                createTextSelectionChangedEvent = androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 0, 0, Integer.valueOf(i14), trimToSize);
                                                                            } else {
                                                                                z2 = z3;
                                                                                createTextSelectionChangedEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 16);
                                                                                createTextSelectionChangedEvent.setFromIndex(i27);
                                                                                createTextSelectionChangedEvent.setRemovedCount(i29);
                                                                                createTextSelectionChangedEvent.setAddedCount(i30);
                                                                                createTextSelectionChangedEvent.setBeforeText(str3);
                                                                                createTextSelectionChangedEvent.getText().add(trimToSize);
                                                                            }
                                                                            createTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(createTextSelectionChangedEvent);
                                                                            if (z2 || z4) {
                                                                                long packedValue = ((TextRange) semanticsNode2.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue();
                                                                                createTextSelectionChangedEvent.setFromIndex(TextRange.m9141getStartimpl(packedValue));
                                                                                createTextSelectionChangedEvent.setToIndex(TextRange.m9136getEndimpl(packedValue));
                                                                                androidComposeViewAccessibilityDelegateCompat.sendEvent(createTextSelectionChangedEvent);
                                                                            }
                                                                            Unit unit4 = Unit.INSTANCE;
                                                                        } else {
                                                                            Boolean.valueOf(sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), 2048, Integer.valueOf(i3), null, 8, null));
                                                                        }
                                                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getTextSelectionRange())) {
                                                                        AnnotatedString textForTextField3 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNode2.getUnmergedConfig());
                                                                        if (textForTextField3 != null && (text = textForTextField3.getText()) != null) {
                                                                            str2 = text;
                                                                        }
                                                                        long packedValue2 = ((TextRange) semanticsNode2.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue();
                                                                        androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i11), Integer.valueOf(TextRange.m9141getStartimpl(packedValue2)), Integer.valueOf(TextRange.m9136getEndimpl(packedValue2)), Integer.valueOf(str2.length()), androidComposeViewAccessibilityDelegateCompat.trimToSize(str2, ParcelSafeTextLength)));
                                                                        androidComposeViewAccessibilityDelegateCompat.sendPendingTextTraversedAtGranularityEvent(semanticsNode2.getId());
                                                                        Unit unit5 = Unit.INSTANCE;
                                                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) {
                                                                        androidComposeViewAccessibilityDelegateCompat.notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode2.getLayoutNode());
                                                                        ScrollObservationScope findById = SemanticsUtils_androidKt.findById(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes, i11);
                                                                        Intrinsics.checkNotNull(findById);
                                                                        findById.setHorizontalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()));
                                                                        findById.setVerticalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()));
                                                                        androidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded(findById);
                                                                        Unit unit6 = Unit.INSTANCE;
                                                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getFocused())) {
                                                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                        if (((Boolean) obj2).booleanValue()) {
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode2.getId()), 8));
                                                                        }
                                                                        Boolean.valueOf(sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode2.getId()), 2048, 0, null, 8, null));
                                                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsActions.INSTANCE.getCustomActions())) {
                                                                        List list3 = (List) semanticsNode2.getUnmergedConfig().get(SemanticsActions.INSTANCE.getCustomActions());
                                                                        List list4 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), SemanticsActions.INSTANCE.getCustomActions());
                                                                        if (list4 != null) {
                                                                            MutableScatterSet mutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
                                                                            int size = list3.size();
                                                                            for (int i31 = 0; i31 < size; i31++) {
                                                                                mutableScatterSetOf.add(((CustomAccessibilityAction) list3.get(i31)).getLabel());
                                                                            }
                                                                            MutableScatterSet mutableScatterSetOf2 = ScatterSetKt.mutableScatterSetOf();
                                                                            int size2 = list4.size();
                                                                            for (int i32 = 0; i32 < size2; i32++) {
                                                                                mutableScatterSetOf2.add(((CustomAccessibilityAction) list4.get(i32)).getLabel());
                                                                            }
                                                                            z = !Intrinsics.areEqual(mutableScatterSetOf, mutableScatterSetOf2);
                                                                        } else if (!list3.isEmpty()) {
                                                                            z = true;
                                                                        }
                                                                        Unit unit7 = Unit.INSTANCE;
                                                                    } else {
                                                                        if (obj2 instanceof AccessibilityAction) {
                                                                            accessibilityEquals = AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals((AccessibilityAction) obj2, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsPropertyKey));
                                                                            if (accessibilityEquals) {
                                                                                z = false;
                                                                                Unit unit8 = Unit.INSTANCE;
                                                                            }
                                                                        }
                                                                        z = true;
                                                                        Unit unit82 = Unit.INSTANCE;
                                                                    }
                                                                }
                                                            }
                                                            j4 >>= 8;
                                                            i25 = i9 + 1;
                                                            i19 = i12;
                                                            i21 = i11;
                                                            i22 = 8;
                                                            iArr4 = iArr3;
                                                            semanticsNode4 = semanticsNode2;
                                                            i20 = i8;
                                                            arrayList4 = arrayList3;
                                                            objArr3 = objArr2;
                                                            i23 = i10;
                                                            jArr4 = jArr3;
                                                        }
                                                    }
                                                } else {
                                                    i8 = i20;
                                                }
                                                i9 = i25;
                                                arrayList3 = arrayList4;
                                                jArr3 = jArr4;
                                                objArr2 = objArr3;
                                                i10 = i23;
                                                i12 = i19;
                                                semanticsNode2 = semanticsNode4;
                                                iArr3 = iArr4;
                                                i11 = i21;
                                                j4 >>= 8;
                                                i25 = i9 + 1;
                                                i19 = i12;
                                                i21 = i11;
                                                i22 = 8;
                                                iArr4 = iArr3;
                                                semanticsNode4 = semanticsNode2;
                                                i20 = i8;
                                                arrayList4 = arrayList3;
                                                objArr3 = objArr2;
                                                i23 = i10;
                                                jArr4 = jArr3;
                                            }
                                            i2 = i20;
                                            arrayList2 = arrayList4;
                                            jArr2 = jArr4;
                                            objArr = objArr3;
                                            i7 = i23;
                                            i4 = i19;
                                            semanticsNode = semanticsNode4;
                                            iArr2 = iArr4;
                                            i6 = i21;
                                            if (i24 != i22) {
                                                break;
                                            }
                                        } else {
                                            i2 = i20;
                                            arrayList2 = arrayList4;
                                            jArr2 = jArr4;
                                            objArr = objArr3;
                                            i7 = i23;
                                            i4 = i19;
                                            semanticsNode = semanticsNode4;
                                            iArr2 = iArr4;
                                            i6 = i21;
                                        }
                                        if (i7 == length2) {
                                            break;
                                        }
                                        int i33 = i7 + 1;
                                        i19 = i4;
                                        i21 = i6;
                                        iArr4 = iArr2;
                                        semanticsNode4 = semanticsNode;
                                        jArr5 = jArr6;
                                        jArr4 = jArr2;
                                        arrayList4 = arrayList2;
                                        objArr3 = objArr;
                                        i22 = 8;
                                        i23 = i33;
                                        i20 = i2;
                                    }
                                } else {
                                    i2 = i20;
                                    semanticsNode = semanticsNode3;
                                    arrayList2 = arrayList4;
                                    iArr2 = iArr4;
                                    jArr2 = jArr4;
                                    i6 = i21;
                                    i4 = i19;
                                    z = false;
                                }
                                if (!z) {
                                    z = AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(semanticsNode, semanticsNodeCopy.getUnmergedConfig());
                                }
                                if (z) {
                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i6), 2048, 0, null, 8, null);
                                }
                            } else {
                                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("no value for specified key");
                                throw new KotlinNothingValueException();
                            }
                        }
                        i5 = 8;
                    } else {
                        i2 = i20;
                        arrayList2 = arrayList4;
                        iArr2 = iArr4;
                        jArr2 = jArr4;
                        i3 = i16;
                        c = c2;
                        i4 = i19;
                        i5 = i18;
                    }
                    j2 >>= i5;
                    i20 = i2 + 1;
                    androidComposeViewAccessibilityDelegateCompat = this;
                    intObjectMap = newSemanticsNodes;
                    i19 = i4;
                    i18 = i5;
                    i16 = i3;
                    c2 = c;
                    iArr4 = iArr2;
                    jArr4 = jArr2;
                    arrayList4 = arrayList2;
                }
                arrayList = arrayList4;
                iArr = iArr4;
                jArr = jArr4;
                i = i16;
                if (i19 != i18) {
                    return;
                }
            } else {
                arrayList = arrayList4;
                iArr = iArr4;
                jArr = jArr4;
                i = i16;
            }
            if (i17 == length) {
                return;
            }
            i17++;
            androidComposeViewAccessibilityDelegateCompat = this;
            intObjectMap = newSemanticsNodes;
            i16 = i;
            iArr4 = iArr;
            jArr4 = jArr;
            arrayList4 = arrayList;
        }
    }

    private final boolean registerScrollingId(int id, List<ScrollObservationScope> oldScrollObservationScopes) {
        boolean z;
        ScrollObservationScope findById = SemanticsUtils_androidKt.findById(oldScrollObservationScopes, id);
        if (findById != null) {
            z = false;
        } else {
            ScrollObservationScope scrollObservationScope = new ScrollObservationScope(id, this.scrollObservationScopes, null, null, null, null);
            z = true;
            findById = scrollObservationScope;
        }
        this.scrollObservationScopes.add(findById);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            OwnerSnapshotObserver snapshotObserver = this.view.getSnapshotObserver();
            snapshotObserver.observer.observeReads(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    int semanticsNodeIdToAccessibilityVirtualNodeId;
                    IntObjectMap currentSemanticsNodes;
                    IntObjectMap currentSemanticsNodes2;
                    IntObjectMap currentSemanticsNodes3;
                    SemanticsNode semanticsNode;
                    LayoutNode layoutNode;
                    MutableIntObjectMap mutableIntObjectMap;
                    MutableIntObjectMap mutableIntObjectMap2;
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
                    Rect boundsInScreen;
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
                    Rect boundsInScreen2;
                    ScrollAxisRange horizontalScrollAxisRange = ScrollObservationScope.this.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = ScrollObservationScope.this.getVerticalScrollAxisRange();
                    Float oldXValue = ScrollObservationScope.this.getOldXValue();
                    Float oldYValue = ScrollObservationScope.this.getOldYValue();
                    float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (floatValue != 0.0f || floatValue2 != 0.0f) {
                        semanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(ScrollObservationScope.this.getSemanticsNodeId());
                        currentSemanticsNodes = this.getCurrentSemanticsNodes();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) currentSemanticsNodes.get(this.accessibilityFocusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                accessibilityNodeInfoCompat2 = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                                if (accessibilityNodeInfoCompat2 != null) {
                                    boundsInScreen2 = androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds);
                                    accessibilityNodeInfoCompat2.setBoundsInScreen(boundsInScreen2);
                                    Unit unit = Unit.INSTANCE;
                                }
                            } catch (IllegalStateException unused) {
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        currentSemanticsNodes2 = this.getCurrentSemanticsNodes();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) currentSemanticsNodes2.get(this.focusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds2 != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            try {
                                accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat2.currentlyFocusedANI;
                                if (accessibilityNodeInfoCompat != null) {
                                    boundsInScreen = androidComposeViewAccessibilityDelegateCompat2.boundsInScreen(semanticsNodeWithAdjustedBounds2);
                                    accessibilityNodeInfoCompat.setBoundsInScreen(boundsInScreen);
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            } catch (IllegalStateException unused2) {
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                        this.getView().invalidate();
                        currentSemanticsNodes3 = this.getCurrentSemanticsNodes();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) currentSemanticsNodes3.get(semanticsNodeIdToAccessibilityVirtualNodeId);
                        if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this;
                            if (horizontalScrollAxisRange != null) {
                                mutableIntObjectMap2 = androidComposeViewAccessibilityDelegateCompat3.pendingHorizontalScrollEvents;
                                mutableIntObjectMap2.set(semanticsNodeIdToAccessibilityVirtualNodeId, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                mutableIntObjectMap = androidComposeViewAccessibilityDelegateCompat3.pendingVerticalScrollEvents;
                                mutableIntObjectMap.set(semanticsNodeIdToAccessibilityVirtualNodeId, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat3.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        ScrollObservationScope.this.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        ScrollObservationScope.this.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }
            });
        }
    }

    private final void sendPaneChangeEvents(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNodeId), 32);
        createEvent.setContentChangeTypes(contentChangeType);
        if (title != null) {
            createEvent.getText().add(title);
        }
        sendEvent(createEvent);
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode newNode, SemanticsNodeCopy oldNode) {
        MutableIntSet mutableIntSetOf = IntSetKt.mutableIntSetOf();
        List<SemanticsNode> replacedChildren$ui = newNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = replacedChildren$ui.get(i);
            if (getCurrentSemanticsNodes().containsKey(semanticsNode.getId())) {
                if (!oldNode.getChildren().contains(semanticsNode.getId())) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                    return;
                }
                mutableIntSetOf.add(semanticsNode.getId());
            }
        }
        MutableIntSet children = oldNode.getChildren();
        int[] iArr = children.elements;
        long[] jArr = children.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128 && !mutableIntSetOf.contains(iArr[(i2 << 3) + i4])) {
                            notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                            return;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        List<SemanticsNode> replacedChildren$ui2 = newNode.getReplacedChildren$ui();
        int size2 = replacedChildren$ui2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui2.get(i5);
            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(semanticsNode2.getId());
            if (semanticsNodeCopy != null && getCurrentSemanticsNodes().containsKey(semanticsNode2.getId())) {
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode2, semanticsNodeCopy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int id) {
        if (id == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return id;
    }

    private final boolean traverseAtGranularity(SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int i;
        int i2;
        int id = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        String str = iterableTextForAccessibility;
        if (str == null || str.length() == 0 || (iteratorForGranularity = getIteratorForGranularity(node, granularity)) == null) {
            return false;
        }
        int accessibilitySelectionEnd = getAccessibilitySelectionEnd(node);
        if (accessibilitySelectionEnd == -1) {
            accessibilitySelectionEnd = forward ? 0 : iterableTextForAccessibility.length();
        }
        int[] following = forward ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
        if (following == null) {
            return false;
        }
        int i3 = following[0];
        int i4 = following[1];
        if (extendSelection && isAccessibilitySelectionExtendable(node)) {
            i = getAccessibilitySelectionStart(node);
            if (i == -1) {
                i = forward ? i3 : i4;
            }
            i2 = forward ? i4 : i3;
        } else {
            i = forward ? i4 : i3;
            i2 = i;
        }
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(node, forward ? 256 : 512, granularity, i3, i4, SystemClock.uptimeMillis());
        setAccessibilitySelection(node, i, i2, true);
        return true;
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int semanticsNodeId) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (semanticsNodeId != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                createEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent.setAction(pendingTextTraversedEvent.getAction());
                createEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final boolean setAccessibilitySelection(SemanticsNode node, int start, int end, boolean traversalMode) {
        String iterableTextForAccessibility;
        boolean enabled;
        if (node.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetSelection())) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(node);
            if (enabled) {
                Function3 function3 = (Function3) ((AccessibilityAction) node.getUnmergedConfig().get(SemanticsActions.INSTANCE.getSetSelection())).getAction();
                if (function3 != null) {
                    return ((Boolean) function3.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
                }
                return false;
            }
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > iterableTextForAccessibility.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        String str = iterableTextForAccessibility;
        boolean z = str.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(node.getId()), z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(iterableTextForAccessibility.length()) : null, str));
        sendPendingTextTraversedAtGranularityEvent(node.getId());
        return true;
    }

    private final int getAccessibilitySelectionStart(SemanticsNode node) {
        if (!node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription()) && node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return TextRange.m9141getStartimpl(((TextRange) node.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode node) {
        if (!node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription()) && node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return TextRange.m9136getEndimpl(((TextRange) node.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode node) {
        return !node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription()) && node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText());
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode node, int granularity) {
        AccessibilityIterators.AbstractTextSegmentIterator companion;
        TextLayoutResult textLayoutResult;
        if (node == null) {
            return null;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        String str = iterableTextForAccessibility;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            companion = AccessibilityIterators.CharacterTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            ((AccessibilityIterators.CharacterTextSegmentIterator) companion).initialize(iterableTextForAccessibility);
        } else if (granularity == 2) {
            companion = AccessibilityIterators.WordTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            ((AccessibilityIterators.WordTextSegmentIterator) companion).initialize(iterableTextForAccessibility);
        } else {
            if (granularity != 4) {
                if (granularity == 8) {
                    companion = AccessibilityIterators.ParagraphTextSegmentIterator.INSTANCE.getInstance();
                    companion.initialize(iterableTextForAccessibility);
                } else if (granularity != 16) {
                    return null;
                }
            }
            if (!node.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(node.getUnmergedConfig())) == null) {
                return null;
            }
            if (granularity == 4) {
                companion = AccessibilityIterators.LineTextSegmentIterator.INSTANCE.getInstance();
                ((AccessibilityIterators.LineTextSegmentIterator) companion).initialize(iterableTextForAccessibility, textLayoutResult);
            } else {
                AccessibilityIterators.AbstractTextSegmentIterator companion2 = AccessibilityIterators.PageTextSegmentIterator.INSTANCE.getInstance();
                ((AccessibilityIterators.PageTextSegmentIterator) companion2).initialize(iterableTextForAccessibility, textLayoutResult, node);
                companion = companion2;
            }
        }
        return companion;
    }

    private final String getIterableTextForAccessibility(SemanticsNode node) {
        AnnotatedString annotatedString;
        if (node == null) {
            return null;
        }
        if (node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) node.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText())) {
            AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "createAccessibilityNodeInfo", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "virtualViewId", "", "performAction", "", "action", "arguments", "Landroid/os/Bundle;", "addExtraDataToAccessibilityNodeInfo", "", "info", "extraDataKey", "", "findFocus", "focus", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    private final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int virtualViewId) {
            AccessibilityNodeInfoCompat createNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(virtualViewId);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent) {
                if (virtualViewId == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = createNodeInfo;
                }
                if (virtualViewId == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = createNodeInfo;
                }
            }
            return createNodeInfo;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int virtualViewId, int action, Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(virtualViewId, action, arguments);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, AccessibilityNodeInfoCompat info, String extraDataKey, Bundle arguments) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat findFocus(int focus) {
            if (focus == 1) {
                if (AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                    return null;
                }
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
            }
            if (focus == 2) {
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityFocusedVirtualViewId);
            }
            throw new IllegalArgumentException("Unknown focus type: " + focus);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "<init>", "()V", "addSetProgressAction", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    private static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @JvmStatic
        public static final void addSetProgressAction(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            boolean enabled;
            AccessibilityAction accessibilityAction;
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "<init>", "()V", "addPageActions", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    private static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void addPageActions(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            boolean enabled;
            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                if (role == null ? false : Role.m8877equalsimpl0(role.getValue(), Role.INSTANCE.m8882getCarouselo7Vup1c())) {
                    return;
                }
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageUp());
                if (accessibilityAction != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageDown());
                if (accessibilityAction2 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageLeft());
                if (accessibilityAction3 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageRight());
                if (accessibilityAction4 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }
}
