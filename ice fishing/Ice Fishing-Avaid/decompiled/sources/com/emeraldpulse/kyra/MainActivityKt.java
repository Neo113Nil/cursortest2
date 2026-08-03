package com.emeraldpulse.kyra;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.createyourself.policy.PolicyGateKt$$ExternalSyntheticBackport0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a_\u0010\u0003\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001aY\u0010\u0011\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u0016\u001aY\u0010\u0017\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u001c\u001aE\u0010\u001d\u001a\u00020\u00012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010!\u001a[\u0010\"\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010$\u001a.\u0010%\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b(H\u0003¢\u0006\u0002\u0010)\u001a2\u0010*\u001a\u00020\u0001*\u00020'2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0002\u001a2\u00100\u001a\u00020\u0001*\u00020'2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0002\u001aC\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u00103\u001a/\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u00132\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u00106\u001a=\u00107\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u00109\u001a)\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010<\u001a-\u0010=\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,2\u0006\u0010>\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010?\u001a\u00020@H\u0003¢\u0006\u0002\u0010A\u001a'\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020,2\u0006\u0010>\u001a\u00020,2\b\b\u0002\u0010D\u001a\u00020EH\u0003¢\u0006\u0002\u0010F\u001a\u001d\u0010G\u001a\u00020\u00012\u0006\u0010C\u001a\u00020,2\u0006\u0010H\u001a\u00020IH\u0003¢\u0006\u0002\u0010J\u001a*\u0010K\u001a\u00020\u0001*\u00020'2\u0006\u0010+\u001a\u00020,2\u0006\u0010L\u001a\u00020,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0002\u001a)\u0010M\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\r2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010P\u001a/\u0010Q\u001a\u00020\u00012\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010T\u001a/\u0010U\u001a\u00020\u00012\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010T\u001a/\u0010V\u001a\u00020\u00012\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010T\u001a/\u0010W\u001a\u00020\u00012\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010T\u001aA\u0010X\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u001c\u0010&\u001a\u0018\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\bZ¢\u0006\u0002\b(H\u0003¢\u0006\u0002\u0010[\u001a1\u0010\\\u001a\u00020\u00012\u0006\u0010C\u001a\u00020,2\u0006\u0010>\u001a\u00020,2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010^\u001a#\u0010_\u001a\u00020\u00012\u0006\u0010`\u001a\u00020I2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010b\u001a\u000e\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H\u0002\u001a\u000e\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005H\u0002\u001a\u000e\u0010f\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005H\u0002\u001a\u0016\u0010g\u001a\u00020h2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\u0016\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010j\u001a\u00020,H\u0002\u001a\u0016\u0010k\u001a\u00020h2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H\u0002\u001a\u0016\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\u0006\u0010j\u001a\u00020,H\u0002\u001a\u0016\u0010m\u001a\u00020h2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005H\u0002\u001a\u0016\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\u0006\u0010j\u001a\u00020,H\u0002\u001a\u0016\u0010o\u001a\u00020h2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005H\u0002\u001a\u0016\u0010p\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\u0006\u0010j\u001a\u00020,H\u0002\u001a\u0010\u0010q\u001a\u00020,2\u0006\u0010r\u001a\u00020\rH\u0002\u001a\b\u0010s\u001a\u00020,H\u0002\u001a\u0010\u0010t\u001a\u00020,2\u0006\u0010u\u001a\u00020\rH\u0002\u001a \u0010v\u001a\u00020\u00012\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\bZH\u0003¢\u0006\u0002\u0010w\"\u0010\u0010x\u001a\u00020yX\u0082\u0004¢\u0006\u0004\n\u0002\u0010z\"\u0010\u0010{\u001a\u00020yX\u0082\u0004¢\u0006\u0004\n\u0002\u0010z\"\u0010\u0010|\u001a\u00020yX\u0082\u0004¢\u0006\u0004\n\u0002\u0010z\"\u0010\u0010}\u001a\u00020yX\u0082\u0004¢\u0006\u0004\n\u0002\u0010z\"\u0010\u0010~\u001a\u00020yX\u0082\u0004¢\u0006\u0004\n\u0002\u0010z\"\u0010\u0010\\\u001a\u00020yX\u0082\u0004¢\u0006\u0004\n\u0002\u0010z\"\u0010\u0010\u007f\u001a\u00020yX\u0082\u0004¢\u0006\u0004\n\u0002\u0010z\"\u0011\u0010\u0080\u0001\u001a\u00020yX\u0082\u0004¢\u0006\u0004\n\u0002\u0010z¨\u0006\u0081\u0001²\u0006\u000b\u0010\u0082\u0001\u001a\u00020\rX\u008a\u008e\u0002²\u0006\u000b\u0010\u0083\u0001\u001a\u00020IX\u008a\u008e\u0002²\u0006\u000b\u0010\u0084\u0001\u001a\u00020IX\u008a\u008e\u0002²\u0006\u000b\u0010\u0085\u0001\u001a\u00020IX\u008a\u008e\u0002²\u0006\u000b\u0010\u0086\u0001\u001a\u00020IX\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u0087\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u0088\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u0089\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u008b\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u008c\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u008d\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u008e\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u008f\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u008a\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u0090\u0001\u001a\u00020,X\u008a\u008e\u0002²\u0006\u000b\u0010\u0091\u0001\u001a\u00020,X\u008a\u008e\u0002"}, d2 = {"EmeraldPulseApp", "", "(Landroidx/compose/runtime/Composer;I)V", "RoomsScreen", "rooms", "", "Lcom/emeraldpulse/kyra/RoomChecklist;", "padding", "Landroidx/compose/foundation/layout/PaddingValues;", "onAdd", "Lkotlin/Function0;", "onToggle", "Lkotlin/Function2;", "", "onResetRoom", "Lkotlin/Function1;", "(Ljava/util/List;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SuppliesScreen", "supplies", "Lcom/emeraldpulse/kyra/Supply;", "onChange", "onReset", "(Ljava/util/List;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FixesScreen", "fixes", "Lcom/emeraldpulse/kyra/FixTask;", "onComplete", "onSnooze", "(Ljava/util/List;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CostsScreen", "costs", "Lcom/emeraldpulse/kyra/CostNote;", "onDelete", "(Ljava/util/List;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ScoreScreen", "onResetAll", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ScreenColumn", "content", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "HeroHeader", "title", "", "subtitle", "action", "onAction", "SectionHeader", "RoomCard", "room", "(Lcom/emeraldpulse/kyra/RoomChecklist;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SupplyCard", "supply", "(Lcom/emeraldpulse/kyra/Supply;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "FixCard", "fix", "(Lcom/emeraldpulse/kyra/FixTask;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CostCard", "cost", "(Lcom/emeraldpulse/kyra/CostNote;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MetricCard", "value", NotificationCompat.CATEGORY_PROGRESS, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLandroidx/compose/runtime/Composer;I)V", "StatPill", "label", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatusChip", "urgent", "", "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "EmptyState", "body", "PulseBottomBar", "selectedIndex", "onSelect", "(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AddRoomDialog", "onDismiss", "onSave", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AddSupplyDialog", "AddFixDialog", "AddCostDialog", "EntryDialog", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Field", "onValueChange", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SaveButton", "enabled", "onClick", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "defaultRooms", "defaultSupplies", "defaultFixes", "defaultCosts", "encodeRooms", "Lorg/json/JSONArray;", "decodeRooms", "raw", "encodeSupplies", "decodeSupplies", "encodeFixes", "decodeFixes", "encodeCosts", "decodeCosts", "money", "cents", "today", "readinessMessage", "score", "EmeraldPulseTheme", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DeepEmerald", "Landroidx/compose/ui/graphics/Color;", "J", "Mint", "WarmStone", "Ink", "MutedInk", "Line", "Alert", "app_release", "selectedTab", "roomDialog", "supplyDialog", "fixDialog", "costDialog", "focus", "checks", HintConstants.AUTOFILL_HINT_NAME, "area", "quantity", "minimum", "unit", "interval", "due", "amount", "note"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class MainActivityKt {
    private static final long DeepEmerald = ColorKt.Color(4279196489L);
    private static final long Mint = ColorKt.Color(4288667841L);
    private static final long WarmStone = ColorKt.Color(4294373864L);
    private static final long Ink = ColorKt.Color(4280562221L);
    private static final long MutedInk = ColorKt.Color(4285101167L);
    private static final long Field = ColorKt.Color(4293981679L);
    private static final long Line = ColorKt.Color(4292667359L);
    private static final long Alert = ColorKt.Color(4290272579L);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddCostDialog$lambda$138(Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        AddCostDialog(function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddFixDialog$lambda$125(Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        AddFixDialog(function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddRoomDialog$lambda$96(Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        AddRoomDialog(function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSupplyDialog$lambda$112(Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        AddSupplyDialog(function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CostCard$lambda$77(CostNote costNote, Function1 function1, int i, Composer composer, int i2) {
        CostCard(costNote, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CostsScreen$lambda$65(List list, PaddingValues paddingValues, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        CostsScreen(list, paddingValues, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmeraldPulseApp$lambda$40(int i, Composer composer, int i2) {
        EmeraldPulseApp(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmeraldPulseTheme$lambda$159(Function2 function2, int i, Composer composer, int i2) {
        EmeraldPulseTheme(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EntryDialog$lambda$139(String str, Function0 function0, Function3 function3, int i, Composer composer, int i2) {
        EntryDialog(str, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Field$lambda$140(String str, String str2, Function1 function1, int i, Composer composer, int i2) {
        Field(str, str2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FixCard$lambda$76(FixTask fixTask, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        FixCard(fixTask, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FixesScreen$lambda$59(List list, PaddingValues paddingValues, Function0 function0, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        FixesScreen(list, paddingValues, function0, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricCard$lambda$78(String str, String str2, String str3, float f, int i, Composer composer, int i2) {
        MetricCard(str, str2, str3, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PulseBottomBar$lambda$86(int i, Function1 function1, int i2, Composer composer, int i3) {
        PulseBottomBar(i, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RoomCard$lambda$74(RoomChecklist roomChecklist, Function2 function2, Function1 function1, int i, Composer composer, int i2) {
        RoomCard(roomChecklist, function2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RoomsScreen$lambda$46(List list, PaddingValues paddingValues, Function0 function0, Function2 function2, Function1 function1, int i, Composer composer, int i2) {
        RoomsScreen(list, paddingValues, function0, function2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveButton$lambda$141(boolean z, Function0 function0, int i, Composer composer, int i2) {
        SaveButton(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScoreScreen$lambda$72(List list, List list2, List list3, List list4, PaddingValues paddingValues, Function0 function0, int i, Composer composer, int i2) {
        ScoreScreen(list, list2, list3, list4, paddingValues, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenColumn$lambda$73(PaddingValues paddingValues, Function1 function1, int i, Composer composer, int i2) {
        ScreenColumn(paddingValues, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatPill$lambda$79(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StatPill(str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatusChip$lambda$80(String str, boolean z, int i, Composer composer, int i2) {
        StatusChip(str, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuppliesScreen$lambda$52(List list, PaddingValues paddingValues, Function0 function0, Function2 function2, Function0 function02, int i, Composer composer, int i2) {
        SuppliesScreen(list, paddingValues, function0, function2, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupplyCard$lambda$75(Supply supply, Function2 function2, int i, Composer composer, int i2) {
        SupplyCard(supply, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EmeraldPulseApp(Composer composer, final int i) {
        final MutableState mutableState;
        final MutableState mutableState2;
        final MutableState mutableState3;
        final MutableState mutableState4;
        Composer startRestartGroup = composer.startRestartGroup(-1203292495);
        ComposerKt.sourceInformation(startRestartGroup, "C(EmeraldPulseApp)152@5386L7,153@5410L31,154@5465L33,155@5515L84,156@5619L80,157@5716L78,158@5811L79,159@5913L34,160@5972L34,161@6028L34,162@6085L34,166@6191L146,172@6344L4165,164@6125L4384,297@11352L22,298@11397L122,296@11313L216:MainActivity.kt#f5odrr");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1203292495, i, -1, "com.emeraldpulse.kyra.EmeraldPulseApp (MainActivity.kt:151)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new HomeStore(context);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final HomeStore homeStore = (HomeStore) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableIntState mutableIntState = (MutableIntState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            Object obj = rememberedValue3;
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                SnapshotStateList mutableStateListOf = SnapshotStateKt.mutableStateListOf();
                mutableStateListOf.addAll(homeStore.loadRooms());
                startRestartGroup.updateRememberedValue(mutableStateListOf);
                obj = mutableStateListOf;
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            Object obj2 = rememberedValue4;
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                SnapshotStateList mutableStateListOf2 = SnapshotStateKt.mutableStateListOf();
                mutableStateListOf2.addAll(homeStore.loadSupplies());
                startRestartGroup.updateRememberedValue(mutableStateListOf2);
                obj2 = mutableStateListOf2;
            }
            final SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            Object obj3 = rememberedValue5;
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                SnapshotStateList mutableStateListOf3 = SnapshotStateKt.mutableStateListOf();
                mutableStateListOf3.addAll(homeStore.loadFixes());
                startRestartGroup.updateRememberedValue(mutableStateListOf3);
                obj3 = mutableStateListOf3;
            }
            final SnapshotStateList snapshotStateList3 = (SnapshotStateList) obj3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            Object obj4 = rememberedValue6;
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                SnapshotStateList mutableStateListOf4 = SnapshotStateKt.mutableStateListOf();
                mutableStateListOf4.addAll(homeStore.loadCosts());
                startRestartGroup.updateRememberedValue(mutableStateListOf4);
                obj4 = mutableStateListOf4;
            }
            final SnapshotStateList snapshotStateList4 = (SnapshotStateList) obj4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            final MutableState mutableState5 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            final MutableState mutableState6 = (MutableState) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            final MutableState mutableState7 = (MutableState) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            final MutableState mutableState8 = (MutableState) rememberedValue10;
            startRestartGroup.endReplaceGroup();
            ScaffoldKt.m3799ScaffoldTvnljyQ(null, null, ComposableLambdaKt.rememberComposableLambda(1760277580, true, new MainActivityKt$EmeraldPulseApp$1(mutableIntState), startRestartGroup, 54), null, null, 0, WarmStone, 0L, null, ComposableLambdaKt.rememberComposableLambda(786414658, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(PaddingValues padding, Composer composer2, int i2) {
                    int i3;
                    int EmeraldPulseApp$lambda$2;
                    Intrinsics.checkNotNullParameter(padding, "padding");
                    ComposerKt.sourceInformation(composer2, "C177@6528L3975,173@6365L4138:MainActivity.kt#f5odrr");
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer2.changed(padding) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(786414658, i3, -1, "com.emeraldpulse.kyra.EmeraldPulseApp.<anonymous> (MainActivity.kt:173)");
                    }
                    EnumEntries<PulseTab> entries = PulseTab.getEntries();
                    EmeraldPulseApp$lambda$2 = MainActivityKt.EmeraldPulseApp$lambda$2(MutableIntState.this);
                    AnimatedContentKt.AnimatedContent((PulseTab) entries.get(EmeraldPulseApp$lambda$2), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, "pulse-tab", null, ComposableLambdaKt.rememberComposableLambda(645373783, true, new AnonymousClass1(snapshotStateList, padding, homeStore, snapshotStateList2, snapshotStateList3, snapshotStateList4, mutableState5, mutableState6, mutableState7, mutableState8), composer2, 54), composer2, 1597488, 44);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: MainActivity.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                /* renamed from: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function4<AnimatedContentScope, PulseTab, Composer, Integer, Unit> {
                    final /* synthetic */ MutableState<Boolean> $costDialog$delegate;
                    final /* synthetic */ SnapshotStateList<CostNote> $costs;
                    final /* synthetic */ MutableState<Boolean> $fixDialog$delegate;
                    final /* synthetic */ SnapshotStateList<FixTask> $fixes;
                    final /* synthetic */ PaddingValues $padding;
                    final /* synthetic */ MutableState<Boolean> $roomDialog$delegate;
                    final /* synthetic */ SnapshotStateList<RoomChecklist> $rooms;
                    final /* synthetic */ HomeStore $store;
                    final /* synthetic */ SnapshotStateList<Supply> $supplies;
                    final /* synthetic */ MutableState<Boolean> $supplyDialog$delegate;

                    /* compiled from: MainActivity.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                    /* renamed from: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[PulseTab.values().length];
                            try {
                                iArr[PulseTab.Rooms.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[PulseTab.Supplies.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[PulseTab.Fixes.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[PulseTab.Costs.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[PulseTab.Score.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    AnonymousClass1(SnapshotStateList<RoomChecklist> snapshotStateList, PaddingValues paddingValues, HomeStore homeStore, SnapshotStateList<Supply> snapshotStateList2, SnapshotStateList<FixTask> snapshotStateList3, SnapshotStateList<CostNote> snapshotStateList4, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4) {
                        this.$rooms = snapshotStateList;
                        this.$padding = paddingValues;
                        this.$store = homeStore;
                        this.$supplies = snapshotStateList2;
                        this.$fixes = snapshotStateList3;
                        this.$costs = snapshotStateList4;
                        this.$roomDialog$delegate = mutableState;
                        this.$supplyDialog$delegate = mutableState2;
                        this.$fixDialog$delegate = mutableState3;
                        this.$costDialog$delegate = mutableState4;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, PulseTab pulseTab, Composer composer, Integer num) {
                        invoke(animatedContentScope, pulseTab, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, PulseTab tab, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        Intrinsics.checkNotNullParameter(tab, "tab");
                        ComposerKt.sourceInformation(composer, "C:MainActivity.kt#f5odrr");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(645373783, i, -1, "com.emeraldpulse.kyra.EmeraldPulseApp.<anonymous>.<anonymous> (MainActivity.kt:178)");
                        }
                        int i2 = WhenMappings.$EnumSwitchMapping$0[tab.ordinal()];
                        if (i2 == 1) {
                            composer.startReplaceGroup(1728918120);
                            ComposerKt.sourceInformation(composer, "182@6711L21,183@6765L553,193@7354L329,179@6596L1105");
                            SnapshotStateList<RoomChecklist> snapshotStateList = this.$rooms;
                            PaddingValues paddingValues = this.$padding;
                            composer.startReplaceGroup(5004770);
                            ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
                            final MutableState<Boolean> mutableState = this.$roomDialog$delegate;
                            Object rememberedValue = composer.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0271: CONSTRUCTOR (r3v4 'rememberedValue' java.lang.Object) = (r0v2 'mutableState' androidx.compose.runtime.MutableState<java.lang.Boolean> A[DONT_INLINE]) A[MD:(androidx.compose.runtime.MutableState):void (m)] (LINE:183) call: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2$1$$ExternalSyntheticLambda4.<init>(androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2.1.invoke(androidx.compose.animation.AnimatedContentScope, com.emeraldpulse.kyra.PulseTab, androidx.compose.runtime.Composer, int):void, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2$1$$ExternalSyntheticLambda4, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 27 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 745
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2.AnonymousClass1.invoke(androidx.compose.animation.AnimatedContentScope, com.emeraldpulse.kyra.PulseTab, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
                                MainActivityKt.EmeraldPulseApp$lambda$14(mutableState, true);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$5$lambda$4(SnapshotStateList snapshotStateList, HomeStore homeStore, RoomChecklist room, int i) {
                                Intrinsics.checkNotNullParameter(room, "room");
                                SnapshotStateList snapshotStateList2 = snapshotStateList;
                                Iterator<RoomChecklist> it = snapshotStateList2.iterator();
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i3 = -1;
                                        break;
                                    }
                                    if (Intrinsics.areEqual(it.next().getId(), room.getId())) {
                                        break;
                                    }
                                    i3++;
                                }
                                if (i3 >= 0) {
                                    List<RoomCheckItem> items = ((RoomChecklist) snapshotStateList.get(i3)).getItems();
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
                                    for (Object obj : items) {
                                        int i4 = i2 + 1;
                                        if (i2 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        RoomCheckItem roomCheckItem = (RoomCheckItem) obj;
                                        if (i2 == i) {
                                            roomCheckItem = RoomCheckItem.copy$default(roomCheckItem, null, !roomCheckItem.getDone(), 1, null);
                                        }
                                        arrayList.add(roomCheckItem);
                                        i2 = i4;
                                    }
                                    snapshotStateList.set(i3, RoomChecklist.copy$default((RoomChecklist) snapshotStateList.get(i3), null, null, null, arrayList, 7, null));
                                    homeStore.saveRooms(snapshotStateList2);
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$9$lambda$8(SnapshotStateList snapshotStateList, HomeStore homeStore, RoomChecklist room) {
                                Intrinsics.checkNotNullParameter(room, "room");
                                SnapshotStateList snapshotStateList2 = snapshotStateList;
                                Iterator<RoomChecklist> it = snapshotStateList2.iterator();
                                int i = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i = -1;
                                        break;
                                    }
                                    if (Intrinsics.areEqual(it.next().getId(), room.getId())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (i >= 0) {
                                    List<RoomCheckItem> items = room.getItems();
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
                                    Iterator<T> it2 = items.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(RoomCheckItem.copy$default((RoomCheckItem) it2.next(), null, false, 1, null));
                                    }
                                    snapshotStateList.set(i, RoomChecklist.copy$default(room, null, null, null, arrayList, 7, null));
                                    homeStore.saveRooms(snapshotStateList2);
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$11$lambda$10(MutableState mutableState) {
                                MainActivityKt.EmeraldPulseApp$lambda$17(mutableState, true);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$14$lambda$13(SnapshotStateList snapshotStateList, HomeStore homeStore, Supply supply, int i) {
                                Intrinsics.checkNotNullParameter(supply, "supply");
                                SnapshotStateList snapshotStateList2 = snapshotStateList;
                                Iterator<Supply> it = snapshotStateList2.iterator();
                                int i2 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i2 = -1;
                                        break;
                                    }
                                    if (Intrinsics.areEqual(it.next().getId(), supply.getId())) {
                                        break;
                                    }
                                    i2++;
                                }
                                int i3 = i2;
                                if (i3 >= 0) {
                                    snapshotStateList.set(i3, Supply.copy$default(supply, null, null, null, RangesKt.coerceAtLeast(supply.getQuantity() + i, 0), 0, null, 55, null));
                                    homeStore.saveSupplies(snapshotStateList2);
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$16$lambda$15(SnapshotStateList snapshotStateList, HomeStore homeStore) {
                                List defaultSupplies;
                                snapshotStateList.clear();
                                defaultSupplies = MainActivityKt.defaultSupplies();
                                snapshotStateList.addAll(defaultSupplies);
                                homeStore.saveSupplies(snapshotStateList);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$18$lambda$17(MutableState mutableState) {
                                MainActivityKt.EmeraldPulseApp$lambda$20(mutableState, true);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$21$lambda$20(SnapshotStateList snapshotStateList, HomeStore homeStore, FixTask fix) {
                                Intrinsics.checkNotNullParameter(fix, "fix");
                                SnapshotStateList snapshotStateList2 = snapshotStateList;
                                Iterator<FixTask> it = snapshotStateList2.iterator();
                                int i = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i = -1;
                                        break;
                                    }
                                    if (Intrinsics.areEqual(it.next().getId(), fix.getId())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (i >= 0) {
                                    snapshotStateList.set(i, FixTask.copy$default(fix, null, null, null, 0, fix.getIntervalDays(), null, 47, null));
                                    homeStore.saveFixes(snapshotStateList2);
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$24$lambda$23(SnapshotStateList snapshotStateList, HomeStore homeStore, FixTask fix) {
                                Intrinsics.checkNotNullParameter(fix, "fix");
                                SnapshotStateList snapshotStateList2 = snapshotStateList;
                                Iterator<FixTask> it = snapshotStateList2.iterator();
                                int i = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i = -1;
                                        break;
                                    }
                                    if (Intrinsics.areEqual(it.next().getId(), fix.getId())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (i >= 0) {
                                    snapshotStateList.set(i, FixTask.copy$default(fix, null, null, null, 0, fix.getDaysUntilDue() + 7, null, 47, null));
                                    homeStore.saveFixes(snapshotStateList2);
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$26$lambda$25(MutableState mutableState) {
                                MainActivityKt.EmeraldPulseApp$lambda$23(mutableState, true);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$29$lambda$28(SnapshotStateList snapshotStateList, HomeStore homeStore, final CostNote note) {
                                Intrinsics.checkNotNullParameter(note, "note");
                                SnapshotStateList snapshotStateList2 = snapshotStateList;
                                CollectionsKt.removeAll((List) snapshotStateList2, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: INVOKE 
                                      (wrap:java.util.List:?: CAST (java.util.List) (r1v1 'snapshotStateList2' androidx.compose.runtime.snapshots.SnapshotStateList))
                                      (wrap:kotlin.jvm.functions.Function1:0x0009: CONSTRUCTOR (r3v0 'note' com.emeraldpulse.kyra.CostNote A[DONT_INLINE]) A[MD:(com.emeraldpulse.kyra.CostNote):void (m), WRAPPED] call: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2$1$$ExternalSyntheticLambda0.<init>(com.emeraldpulse.kyra.CostNote):void type: CONSTRUCTOR)
                                     STATIC call: kotlin.collections.CollectionsKt.removeAll(java.util.List, kotlin.jvm.functions.Function1):boolean A[MD:<T>:(java.util.List<T>, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean>):boolean (m)] in method: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2.1.invoke$lambda$29$lambda$28(androidx.compose.runtime.snapshots.SnapshotStateList, com.emeraldpulse.kyra.HomeStore, com.emeraldpulse.kyra.CostNote):kotlin.Unit, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 15 more
                                    */
                                /*
                                    java.lang.String r0 = "note"
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                                    java.util.List r1 = (java.util.List) r1
                                    com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2$1$$ExternalSyntheticLambda0 r0 = new com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2$1$$ExternalSyntheticLambda0
                                    r0.<init>(r3)
                                    kotlin.collections.CollectionsKt.removeAll(r1, r0)
                                    r2.saveCosts(r1)
                                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                                    return r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.emeraldpulse.kyra.MainActivityKt$EmeraldPulseApp$2.AnonymousClass1.invoke$lambda$29$lambda$28(androidx.compose.runtime.snapshots.SnapshotStateList, com.emeraldpulse.kyra.HomeStore, com.emeraldpulse.kyra.CostNote):kotlin.Unit");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final boolean invoke$lambda$29$lambda$28$lambda$27(CostNote costNote, CostNote it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return Intrinsics.areEqual(it.getId(), costNote.getId());
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$31$lambda$30(SnapshotStateList snapshotStateList, SnapshotStateList snapshotStateList2, SnapshotStateList snapshotStateList3, SnapshotStateList snapshotStateList4, HomeStore homeStore) {
                                List defaultRooms;
                                List defaultSupplies;
                                List defaultFixes;
                                List defaultCosts;
                                snapshotStateList.clear();
                                defaultRooms = MainActivityKt.defaultRooms();
                                snapshotStateList.addAll(defaultRooms);
                                snapshotStateList2.clear();
                                defaultSupplies = MainActivityKt.defaultSupplies();
                                snapshotStateList2.addAll(defaultSupplies);
                                snapshotStateList3.clear();
                                defaultFixes = MainActivityKt.defaultFixes();
                                snapshotStateList3.addAll(defaultFixes);
                                snapshotStateList4.clear();
                                defaultCosts = MainActivityKt.defaultCosts();
                                snapshotStateList4.addAll(defaultCosts);
                                homeStore.saveRooms(snapshotStateList);
                                homeStore.saveSupplies(snapshotStateList2);
                                homeStore.saveFixes(snapshotStateList3);
                                homeStore.saveCosts(snapshotStateList4);
                                return Unit.INSTANCE;
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, 806879616, 443);
                    startRestartGroup.startReplaceGroup(-1017718295);
                    ComposerKt.sourceInformation(startRestartGroup, "267@10580L22,268@10625L122,266@10541L216");
                    if (EmeraldPulseApp$lambda$13(mutableState5)) {
                        startRestartGroup.startReplaceGroup(5004770);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue11 = startRestartGroup.rememberedValue();
                        if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            mutableState4 = mutableState5;
                            rememberedValue11 = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit EmeraldPulseApp$lambda$25$lambda$24;
                                    EmeraldPulseApp$lambda$25$lambda$24 = MainActivityKt.EmeraldPulseApp$lambda$25$lambda$24(MutableState.this);
                                    return EmeraldPulseApp$lambda$25$lambda$24;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue11);
                        } else {
                            mutableState4 = mutableState5;
                        }
                        Function0 function0 = (Function0) rememberedValue11;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1746271574);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        boolean changedInstance = startRestartGroup.changedInstance(homeStore);
                        Object rememberedValue12 = startRestartGroup.rememberedValue();
                        if (changedInstance || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue12 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    Unit EmeraldPulseApp$lambda$27$lambda$26;
                                    EmeraldPulseApp$lambda$27$lambda$26 = MainActivityKt.EmeraldPulseApp$lambda$27$lambda$26(SnapshotStateList.this, homeStore, mutableState4, (RoomChecklist) obj5);
                                    return EmeraldPulseApp$lambda$27$lambda$26;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue12);
                        }
                        startRestartGroup.endReplaceGroup();
                        AddRoomDialog(function0, (Function1) rememberedValue12, startRestartGroup, 6);
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1017710182);
                    ComposerKt.sourceInformation(startRestartGroup, "277@10837L24,278@10884L133,276@10796L231");
                    if (EmeraldPulseApp$lambda$16(mutableState6)) {
                        startRestartGroup.startReplaceGroup(5004770);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue13 = startRestartGroup.rememberedValue();
                        if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            mutableState3 = mutableState6;
                            rememberedValue13 = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit EmeraldPulseApp$lambda$29$lambda$28;
                                    EmeraldPulseApp$lambda$29$lambda$28 = MainActivityKt.EmeraldPulseApp$lambda$29$lambda$28(MutableState.this);
                                    return EmeraldPulseApp$lambda$29$lambda$28;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue13);
                        } else {
                            mutableState3 = mutableState6;
                        }
                        Function0 function02 = (Function0) rememberedValue13;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1746271574);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        boolean changedInstance2 = startRestartGroup.changedInstance(homeStore);
                        Object rememberedValue14 = startRestartGroup.rememberedValue();
                        if (changedInstance2 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue14 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    Unit EmeraldPulseApp$lambda$31$lambda$30;
                                    EmeraldPulseApp$lambda$31$lambda$30 = MainActivityKt.EmeraldPulseApp$lambda$31$lambda$30(SnapshotStateList.this, homeStore, mutableState3, (Supply) obj5);
                                    return EmeraldPulseApp$lambda$31$lambda$30;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue14);
                        }
                        startRestartGroup.endReplaceGroup();
                        AddSupplyDialog(function02, (Function1) rememberedValue14, startRestartGroup, 6);
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1017701563);
                    ComposerKt.sourceInformation(startRestartGroup, "287@11101L21,288@11145L121,286@11063L213");
                    if (EmeraldPulseApp$lambda$19(mutableState7)) {
                        startRestartGroup.startReplaceGroup(5004770);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue15 = startRestartGroup.rememberedValue();
                        if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                            mutableState2 = mutableState7;
                            rememberedValue15 = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit EmeraldPulseApp$lambda$33$lambda$32;
                                    EmeraldPulseApp$lambda$33$lambda$32 = MainActivityKt.EmeraldPulseApp$lambda$33$lambda$32(MutableState.this);
                                    return EmeraldPulseApp$lambda$33$lambda$32;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue15);
                        } else {
                            mutableState2 = mutableState7;
                        }
                        Function0 function03 = (Function0) rememberedValue15;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1746271574);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        boolean changedInstance3 = startRestartGroup.changedInstance(homeStore);
                        Object rememberedValue16 = startRestartGroup.rememberedValue();
                        if (changedInstance3 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue16 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    Unit EmeraldPulseApp$lambda$35$lambda$34;
                                    EmeraldPulseApp$lambda$35$lambda$34 = MainActivityKt.EmeraldPulseApp$lambda$35$lambda$34(SnapshotStateList.this, homeStore, mutableState2, (FixTask) obj5);
                                    return EmeraldPulseApp$lambda$35$lambda$34;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue16);
                        }
                        startRestartGroup.endReplaceGroup();
                        AddFixDialog(function03, (Function1) rememberedValue16, startRestartGroup, 6);
                    }
                    startRestartGroup.endReplaceGroup();
                    if (EmeraldPulseApp$lambda$22(mutableState8)) {
                        startRestartGroup.startReplaceGroup(5004770);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue17 = startRestartGroup.rememberedValue();
                        if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                            mutableState = mutableState8;
                            rememberedValue17 = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit EmeraldPulseApp$lambda$37$lambda$36;
                                    EmeraldPulseApp$lambda$37$lambda$36 = MainActivityKt.EmeraldPulseApp$lambda$37$lambda$36(MutableState.this);
                                    return EmeraldPulseApp$lambda$37$lambda$36;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue17);
                        } else {
                            mutableState = mutableState8;
                        }
                        Function0 function04 = (Function0) rememberedValue17;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1746271574);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        boolean changedInstance4 = startRestartGroup.changedInstance(homeStore);
                        Object rememberedValue18 = startRestartGroup.rememberedValue();
                        if (changedInstance4 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue18 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    Unit EmeraldPulseApp$lambda$39$lambda$38;
                                    EmeraldPulseApp$lambda$39$lambda$38 = MainActivityKt.EmeraldPulseApp$lambda$39$lambda$38(SnapshotStateList.this, homeStore, mutableState, (CostNote) obj5);
                                    return EmeraldPulseApp$lambda$39$lambda$38;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue18);
                        }
                        startRestartGroup.endReplaceGroup();
                        AddCostDialog(function04, (Function1) rememberedValue18, startRestartGroup, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            Unit EmeraldPulseApp$lambda$40;
                            EmeraldPulseApp$lambda$40 = MainActivityKt.EmeraldPulseApp$lambda$40(i, (Composer) obj5, ((Integer) obj6).intValue());
                            return EmeraldPulseApp$lambda$40;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int EmeraldPulseApp$lambda$2(MutableIntState mutableIntState) {
                return mutableIntState.getIntValue();
            }

            private static final boolean EmeraldPulseApp$lambda$13(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EmeraldPulseApp$lambda$14(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            private static final boolean EmeraldPulseApp$lambda$16(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EmeraldPulseApp$lambda$17(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            private static final boolean EmeraldPulseApp$lambda$19(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EmeraldPulseApp$lambda$20(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            private static final boolean EmeraldPulseApp$lambda$22(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EmeraldPulseApp$lambda$23(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit EmeraldPulseApp$lambda$25$lambda$24(MutableState mutableState) {
                EmeraldPulseApp$lambda$14(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit EmeraldPulseApp$lambda$27$lambda$26(SnapshotStateList snapshotStateList, HomeStore homeStore, MutableState mutableState, RoomChecklist it) {
                Intrinsics.checkNotNullParameter(it, "it");
                snapshotStateList.add(0, it);
                homeStore.saveRooms(snapshotStateList);
                EmeraldPulseApp$lambda$14(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit EmeraldPulseApp$lambda$29$lambda$28(MutableState mutableState) {
                EmeraldPulseApp$lambda$17(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit EmeraldPulseApp$lambda$31$lambda$30(SnapshotStateList snapshotStateList, HomeStore homeStore, MutableState mutableState, Supply it) {
                Intrinsics.checkNotNullParameter(it, "it");
                snapshotStateList.add(0, it);
                homeStore.saveSupplies(snapshotStateList);
                EmeraldPulseApp$lambda$17(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit EmeraldPulseApp$lambda$33$lambda$32(MutableState mutableState) {
                EmeraldPulseApp$lambda$20(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit EmeraldPulseApp$lambda$35$lambda$34(SnapshotStateList snapshotStateList, HomeStore homeStore, MutableState mutableState, FixTask it) {
                Intrinsics.checkNotNullParameter(it, "it");
                snapshotStateList.add(0, it);
                homeStore.saveFixes(snapshotStateList);
                EmeraldPulseApp$lambda$20(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit EmeraldPulseApp$lambda$37$lambda$36(MutableState mutableState) {
                EmeraldPulseApp$lambda$23(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit EmeraldPulseApp$lambda$39$lambda$38(SnapshotStateList snapshotStateList, HomeStore homeStore, MutableState mutableState, CostNote it) {
                Intrinsics.checkNotNullParameter(it, "it");
                snapshotStateList.add(0, it);
                homeStore.saveCosts(snapshotStateList);
                EmeraldPulseApp$lambda$23(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void RoomsScreen(final List<RoomChecklist> list, final PaddingValues paddingValues, final Function0<Unit> function0, final Function2<? super RoomChecklist, ? super Integer, Unit> function2, final Function1<? super RoomChecklist, Unit> function1, Composer composer, final int i) {
                int i2;
                final Function0<Unit> function02;
                Function2<? super RoomChecklist, ? super Integer, Unit> function22;
                Function1<? super RoomChecklist, Unit> function12;
                float averageOfFloat;
                Composer startRestartGroup = composer.startRestartGroup(1918659237);
                ComposerKt.sourceInformation(startRestartGroup, "C(RoomsScreen)P(4,3!1,2)316@11867L526,316@11845L548:MainActivity.kt#f5odrr");
                if ((i & 6) == 0) {
                    i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= startRestartGroup.changed(paddingValues) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    function02 = function0;
                    i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                } else {
                    function02 = function0;
                }
                if ((i & 3072) == 0) {
                    function22 = function2;
                    i2 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                } else {
                    function22 = function2;
                }
                if ((i & 24576) == 0) {
                    function12 = function1;
                    i2 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                } else {
                    function12 = function1;
                }
                int i3 = i2;
                if ((i3 & 9363) == 9362 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1918659237, i3, -1, "com.emeraldpulse.kyra.RoomsScreen (MainActivity.kt:314)");
                    }
                    if (list.isEmpty()) {
                        averageOfFloat = 0.0f;
                    } else {
                        List<RoomChecklist> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Float.valueOf(((RoomChecklist) it.next()).getProgress()));
                        }
                        averageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList);
                    }
                    startRestartGroup.startReplaceGroup(-1224400529);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(averageOfFloat) | startRestartGroup.changedInstance(list) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final float f = averageOfFloat;
                        final Function2<? super RoomChecklist, ? super Integer, Unit> function23 = function22;
                        final Function1<? super RoomChecklist, Unit> function13 = function12;
                        Function1 function14 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda29
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit RoomsScreen$lambda$45$lambda$44;
                                RoomsScreen$lambda$45$lambda$44 = MainActivityKt.RoomsScreen$lambda$45$lambda$44(f, list, function02, function23, function13, (LazyListScope) obj);
                                return RoomsScreen$lambda$45$lambda$44;
                            }
                        };
                        startRestartGroup.updateRememberedValue(function14);
                        rememberedValue = function14;
                    }
                    startRestartGroup.endReplaceGroup();
                    ScreenColumn(paddingValues, (Function1) rememberedValue, startRestartGroup, (i3 >> 3) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit RoomsScreen$lambda$46;
                            RoomsScreen$lambda$46 = MainActivityKt.RoomsScreen$lambda$46(list, paddingValues, function0, function2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                            return RoomsScreen$lambda$46;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit RoomsScreen$lambda$45$lambda$44(float f, final List list, Function0 function0, final Function2 function2, final Function1 function1, LazyListScope ScreenColumn) {
                Intrinsics.checkNotNullParameter(ScreenColumn, "$this$ScreenColumn");
                HeroHeader(ScreenColumn, "Room rounds", MathKt.roundToInt(f * 100) + "% checked across " + list.size() + " spaces", "Add room", function0);
                if (list.isEmpty()) {
                    EmptyState(ScreenColumn, "No room checklist yet", "Add a room with 3 maintenance checks to start today's round.", function0);
                } else {
                    final Function1 function12 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda34
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Object RoomsScreen$lambda$45$lambda$44$lambda$42;
                            RoomsScreen$lambda$45$lambda$44$lambda$42 = MainActivityKt.RoomsScreen$lambda$45$lambda$44$lambda$42((RoomChecklist) obj);
                            return RoomsScreen$lambda$45$lambda$44$lambda$42;
                        }
                    };
                    final MainActivityKt$RoomsScreen$lambda$45$lambda$44$$inlined$items$default$1 mainActivityKt$RoomsScreen$lambda$45$lambda$44$$inlined$items$default$1 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$RoomsScreen$lambda$45$lambda$44$$inlined$items$default$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Void invoke(RoomChecklist roomChecklist) {
                            return null;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke((RoomChecklist) obj);
                        }
                    };
                    ScreenColumn.items(list.size(), new Function1<Integer, Object>() { // from class: com.emeraldpulse.kyra.MainActivityKt$RoomsScreen$lambda$45$lambda$44$$inlined$items$default$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i) {
                            return Function1.this.invoke(list.get(i));
                        }
                    }, new Function1<Integer, Object>() { // from class: com.emeraldpulse.kyra.MainActivityKt$RoomsScreen$lambda$45$lambda$44$$inlined$items$default$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i) {
                            return Function1.this.invoke(list.get(i));
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$RoomsScreen$lambda$45$lambda$44$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                            int i3;
                            ComposerKt.sourceInformation(composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                            if ((i2 & 6) == 0) {
                                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                            } else {
                                i3 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i3 |= composer.changed(i) ? 32 : 16;
                            }
                            if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            RoomChecklist roomChecklist = (RoomChecklist) list.get(i);
                            composer.startReplaceGroup(1941838855);
                            ComposerKt.sourceInformation(composer, "C*327@12326L37:MainActivity.kt#f5odrr");
                            MainActivityKt.RoomCard(roomChecklist, function2, function1, composer, 0);
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Object RoomsScreen$lambda$45$lambda$44$lambda$42(RoomChecklist it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void SuppliesScreen(final List<Supply> list, final PaddingValues paddingValues, final Function0<Unit> function0, final Function2<? super Supply, ? super Integer, Unit> function2, final Function0<Unit> function02, Composer composer, final int i) {
                Function0<Unit> function03;
                final Function2<? super Supply, ? super Integer, Unit> function22;
                Function0<Unit> function04;
                int i2;
                Composer startRestartGroup = composer.startRestartGroup(-533888237);
                ComposerKt.sourceInformation(startRestartGroup, "C(SuppliesScreen)P(4,3)342@12666L986,342@12644L1008:MainActivity.kt#f5odrr");
                int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
                if ((i & 48) == 0) {
                    i3 |= startRestartGroup.changed(paddingValues) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    function03 = function0;
                    i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                } else {
                    function03 = function0;
                }
                if ((i & 3072) == 0) {
                    function22 = function2;
                    i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                } else {
                    function22 = function2;
                }
                if ((i & 24576) == 0) {
                    function04 = function02;
                    i3 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
                } else {
                    function04 = function02;
                }
                int i4 = i3;
                if ((i4 & 9363) == 9362 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-533888237, i4, -1, "com.emeraldpulse.kyra.SuppliesScreen (MainActivity.kt:340)");
                    }
                    List<Supply> list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (Supply supply : list2) {
                            if (supply.getQuantity() <= supply.getMinimum() && (i2 = i2 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    startRestartGroup.startReplaceGroup(-1224400529);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(i2) | ((i4 & 896) == 256) | startRestartGroup.changedInstance(list) | ((57344 & i4) == 16384) | ((i4 & 7168) == 2048);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function0<Unit> function05 = function03;
                        final int i5 = i2;
                        final Function0<Unit> function06 = function04;
                        Function1 function1 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit SuppliesScreen$lambda$51$lambda$50;
                                SuppliesScreen$lambda$51$lambda$50 = MainActivityKt.SuppliesScreen$lambda$51$lambda$50(i5, function05, list, function06, function22, (LazyListScope) obj);
                                return SuppliesScreen$lambda$51$lambda$50;
                            }
                        };
                        startRestartGroup.updateRememberedValue(function1);
                        rememberedValue = function1;
                    }
                    startRestartGroup.endReplaceGroup();
                    ScreenColumn(paddingValues, (Function1) rememberedValue, startRestartGroup, (i4 >> 3) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SuppliesScreen$lambda$52;
                            SuppliesScreen$lambda$52 = MainActivityKt.SuppliesScreen$lambda$52(list, paddingValues, function0, function2, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                            return SuppliesScreen$lambda$52;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit SuppliesScreen$lambda$51$lambda$50(final int i, Function0 function0, final List list, final Function0 function02, final Function2 function2, LazyListScope ScreenColumn) {
                Intrinsics.checkNotNullParameter(ScreenColumn, "$this$ScreenColumn");
                SectionHeader(ScreenColumn, "Supply inventory", i + " restock alerts", "Add supply", function0);
                LazyListScope.CC.item$default(ScreenColumn, null, null, ComposableLambdaKt.composableLambdaInstance(196255256, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$SuppliesScreen$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i2) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        ComposerKt.sourceInformation(composer, "C345@12781L369:MainActivity.kt#f5odrr");
                        if ((i2 & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(196255256, i2, -1, "com.emeraldpulse.kyra.SuppliesScreen.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:345)");
                        }
                        Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(10));
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        List<Supply> list2 = list;
                        int i3 = i;
                        ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m868spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                        int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
                        Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -419333549, "C346@12892L66,347@12975L89,348@13081L55:MainActivity.kt#f5odrr");
                        MainActivityKt.StatPill("Tracked", String.valueOf(list2.size()), RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 6, 0);
                        MainActivityKt.StatPill("Ready", String.valueOf(RangesKt.coerceAtLeast(list2.size() - i3, 0)), RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 6, 0);
                        MainActivityKt.StatPill("Alerts", String.valueOf(i3), RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 6, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                if (list.isEmpty()) {
                    EmptyState(ScreenColumn, "Inventory is empty", "Add filters, bulbs, batteries, cleaners, or repair supplies.", function0);
                } else {
                    LazyListScope.CC.item$default(ScreenColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-943285572, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$SuppliesScreen$1$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i2) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            ComposerKt.sourceInformation(composer, "C355@13363L143:MainActivity.kt#f5odrr");
                            if ((i2 & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-943285572, i2, -1, "com.emeraldpulse.kyra.SuppliesScreen.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:355)");
                            }
                            ButtonKt.OutlinedButton(function02, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableSingletons$MainActivityKt.INSTANCE.m10379getLambda$438824786$app_release(), composer, 805306416, 508);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    final Function1 function1 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Object SuppliesScreen$lambda$51$lambda$50$lambda$48;
                            SuppliesScreen$lambda$51$lambda$50$lambda$48 = MainActivityKt.SuppliesScreen$lambda$51$lambda$50$lambda$48((Supply) obj);
                            return SuppliesScreen$lambda$51$lambda$50$lambda$48;
                        }
                    };
                    final MainActivityKt$SuppliesScreen$lambda$51$lambda$50$$inlined$items$default$1 mainActivityKt$SuppliesScreen$lambda$51$lambda$50$$inlined$items$default$1 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$SuppliesScreen$lambda$51$lambda$50$$inlined$items$default$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Void invoke(Supply supply) {
                            return null;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke((Supply) obj);
                        }
                    };
                    ScreenColumn.items(list.size(), new Function1<Integer, Object>() { // from class: com.emeraldpulse.kyra.MainActivityKt$SuppliesScreen$lambda$51$lambda$50$$inlined$items$default$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i2) {
                            return Function1.this.invoke(list.get(i2));
                        }
                    }, new Function1<Integer, Object>() { // from class: com.emeraldpulse.kyra.MainActivityKt$SuppliesScreen$lambda$51$lambda$50$$inlined$items$default$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i2) {
                            return Function1.this.invoke(list.get(i2));
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$SuppliesScreen$lambda$51$lambda$50$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                            int i4;
                            ComposerKt.sourceInformation(composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                            if ((i3 & 6) == 0) {
                                i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
                            } else {
                                i4 = i3;
                            }
                            if ((i3 & 48) == 0) {
                                i4 |= composer.changed(i2) ? 32 : 16;
                            }
                            if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            Supply supply = (Supply) list.get(i2);
                            composer.startReplaceGroup(580952650);
                            ComposerKt.sourceInformation(composer, "C*360@13594L28:MainActivity.kt#f5odrr");
                            MainActivityKt.SupplyCard(supply, function2, composer, 0);
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Object SuppliesScreen$lambda$51$lambda$50$lambda$48(Supply it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void FixesScreen(final List<FixTask> list, final PaddingValues paddingValues, final Function0<Unit> function0, final Function1<? super FixTask, Unit> function1, final Function1<? super FixTask, Unit> function12, Composer composer, final int i) {
                int i2;
                Function0<Unit> function02;
                Function1<? super FixTask, Unit> function13;
                Function1<? super FixTask, Unit> function14;
                int i3;
                Composer startRestartGroup = composer.startRestartGroup(952051961);
                ComposerKt.sourceInformation(startRestartGroup, "C(FixesScreen)P(!1,4)375@13918L407,375@13896L429:MainActivity.kt#f5odrr");
                if ((i & 6) == 0) {
                    i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= startRestartGroup.changed(paddingValues) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    function02 = function0;
                    i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                } else {
                    function02 = function0;
                }
                if ((i & 3072) == 0) {
                    function13 = function1;
                    i2 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
                } else {
                    function13 = function1;
                }
                if ((i & 24576) == 0) {
                    function14 = function12;
                    i2 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
                } else {
                    function14 = function12;
                }
                int i4 = i2;
                if ((i4 & 9363) == 9362 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(952051961, i4, -1, "com.emeraldpulse.kyra.FixesScreen (MainActivity.kt:373)");
                    }
                    List<FixTask> list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i3 = 0;
                    } else {
                        Iterator<T> it = list2.iterator();
                        i3 = 0;
                        while (it.hasNext()) {
                            if (((FixTask) it.next()).getDaysUntilDue() <= 7 && (i3 = i3 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    startRestartGroup.startReplaceGroup(-1224400529);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(i3) | ((i4 & 896) == 256) | startRestartGroup.changedInstance(list) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function0<Unit> function03 = function02;
                        final int i5 = i3;
                        final Function1<? super FixTask, Unit> function15 = function13;
                        final Function1<? super FixTask, Unit> function16 = function14;
                        Function1 function17 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda36
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit FixesScreen$lambda$58$lambda$57;
                                FixesScreen$lambda$58$lambda$57 = MainActivityKt.FixesScreen$lambda$58$lambda$57(i5, function03, list, function15, function16, (LazyListScope) obj);
                                return FixesScreen$lambda$58$lambda$57;
                            }
                        };
                        startRestartGroup.updateRememberedValue(function17);
                        rememberedValue = function17;
                    }
                    startRestartGroup.endReplaceGroup();
                    ScreenColumn(paddingValues, (Function1) rememberedValue, startRestartGroup, (i4 >> 3) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda37
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FixesScreen$lambda$59;
                            FixesScreen$lambda$59 = MainActivityKt.FixesScreen$lambda$59(list, paddingValues, function0, function1, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                            return FixesScreen$lambda$59;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit FixesScreen$lambda$58$lambda$57(int i, Function0 function0, List list, final Function1 function1, final Function1 function12, LazyListScope ScreenColumn) {
                Intrinsics.checkNotNullParameter(ScreenColumn, "$this$ScreenColumn");
                SectionHeader(ScreenColumn, "Recurring fixes", i + " due in the next 7 days", "Add fix", function0);
                if (list.isEmpty()) {
                    EmptyState(ScreenColumn, "No recurring fixes", "Add seasonal, monthly, or weekly maintenance tasks.", function0);
                } else {
                    final List sortedWith = CollectionsKt.sortedWith(list, new Comparator() { // from class: com.emeraldpulse.kyra.MainActivityKt$FixesScreen$lambda$58$lambda$57$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(Integer.valueOf(((FixTask) t).getDaysUntilDue()), Integer.valueOf(((FixTask) t2).getDaysUntilDue()));
                        }
                    });
                    final Function1 function13 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Object FixesScreen$lambda$58$lambda$57$lambda$55;
                            FixesScreen$lambda$58$lambda$57$lambda$55 = MainActivityKt.FixesScreen$lambda$58$lambda$57$lambda$55((FixTask) obj);
                            return FixesScreen$lambda$58$lambda$57$lambda$55;
                        }
                    };
                    final MainActivityKt$FixesScreen$lambda$58$lambda$57$$inlined$items$default$1 mainActivityKt$FixesScreen$lambda$58$lambda$57$$inlined$items$default$1 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$FixesScreen$lambda$58$lambda$57$$inlined$items$default$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Void invoke(FixTask fixTask) {
                            return null;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke((FixTask) obj);
                        }
                    };
                    ScreenColumn.items(sortedWith.size(), new Function1<Integer, Object>() { // from class: com.emeraldpulse.kyra.MainActivityKt$FixesScreen$lambda$58$lambda$57$$inlined$items$default$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i2) {
                            return Function1.this.invoke(sortedWith.get(i2));
                        }
                    }, new Function1<Integer, Object>() { // from class: com.emeraldpulse.kyra.MainActivityKt$FixesScreen$lambda$58$lambda$57$$inlined$items$default$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i2) {
                            return Function1.this.invoke(sortedWith.get(i2));
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$FixesScreen$lambda$58$lambda$57$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                            int i4;
                            ComposerKt.sourceInformation(composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                            if ((i3 & 6) == 0) {
                                i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
                            } else {
                                i4 = i3;
                            }
                            if ((i3 & 48) == 0) {
                                i4 |= composer.changed(i2) ? 32 : 16;
                            }
                            if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            FixTask fixTask = (FixTask) sortedWith.get(i2);
                            composer.startReplaceGroup(894853733);
                            ComposerKt.sourceInformation(composer, "C*381@14261L34:MainActivity.kt#f5odrr");
                            MainActivityKt.FixCard(fixTask, function1, function12, composer, 0);
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Object FixesScreen$lambda$58$lambda$57$lambda$55(FixTask it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void CostsScreen(final List<CostNote> list, final PaddingValues paddingValues, final Function0<Unit> function0, final Function1<? super CostNote, Unit> function1, Composer composer, final int i) {
                int i2;
                Function0<Unit> function02;
                Composer startRestartGroup = composer.startRestartGroup(696342729);
                ComposerKt.sourceInformation(startRestartGroup, "C(CostsScreen)P(!1,3)397@14652L511,397@14630L533:MainActivity.kt#f5odrr");
                if ((i & 6) == 0) {
                    i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= startRestartGroup.changed(paddingValues) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    function02 = function0;
                    i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                } else {
                    function02 = function0;
                }
                if ((i & 3072) == 0) {
                    i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                }
                int i3 = i2;
                if ((i3 & 1171) == 1170 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(696342729, i3, -1, "com.emeraldpulse.kyra.CostsScreen (MainActivity.kt:393)");
                    }
                    Iterator<T> it = list.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        i4 += ((CostNote) it.next()).getAmountCents();
                    }
                    final int i5 = 25000;
                    final float coerceIn = RangesKt.coerceIn(i4 / 25000, 0.0f, 1.4f);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                    boolean changed = ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | startRestartGroup.changed(i4) | startRestartGroup.changed(coerceIn) | startRestartGroup.changedInstance(list);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function0<Unit> function03 = function02;
                        final int i6 = i4;
                        Function1 function12 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda32
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit CostsScreen$lambda$64$lambda$63;
                                CostsScreen$lambda$64$lambda$63 = MainActivityKt.CostsScreen$lambda$64$lambda$63(i6, function03, list, i5, coerceIn, function1, (LazyListScope) obj);
                                return CostsScreen$lambda$64$lambda$63;
                            }
                        };
                        startRestartGroup.updateRememberedValue(function12);
                        rememberedValue = function12;
                    }
                    startRestartGroup.endReplaceGroup();
                    ScreenColumn(paddingValues, (Function1) rememberedValue, startRestartGroup, (i3 >> 3) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda35
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit CostsScreen$lambda$65;
                            CostsScreen$lambda$65 = MainActivityKt.CostsScreen$lambda$65(list, paddingValues, function0, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                            return CostsScreen$lambda$65;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit CostsScreen$lambda$64$lambda$63(final int i, Function0 function0, final List list, final int i2, final float f, final Function1 function1, LazyListScope ScreenColumn) {
                Intrinsics.checkNotNullParameter(ScreenColumn, "$this$ScreenColumn");
                SectionHeader(ScreenColumn, "Cost notes", money(i) + " logged this month", "Add cost", function0);
                LazyListScope.CC.item$default(ScreenColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1335081380, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$CostsScreen$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i3) {
                        String money;
                        String money2;
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        ComposerKt.sourceInformation(composer, "C399@14761L103:MainActivity.kt#f5odrr");
                        if ((i3 & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1335081380, i3, -1, "com.emeraldpulse.kyra.CostsScreen.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:399)");
                        }
                        money = MainActivityKt.money(i);
                        money2 = MainActivityKt.money(i2);
                        MainActivityKt.MetricCard("Maintenance budget", money, "Target " + money2, RangesKt.coerceIn(f, 0.0f, 1.0f), composer, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                if (list.isEmpty()) {
                    EmptyState(ScreenColumn, "No cost notes", "Save purchases, contractor visits, or supply runs for a local monthly view.", function0);
                } else {
                    final Function1 function12 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda40
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Object CostsScreen$lambda$64$lambda$63$lambda$61;
                            CostsScreen$lambda$64$lambda$63$lambda$61 = MainActivityKt.CostsScreen$lambda$64$lambda$63$lambda$61((CostNote) obj);
                            return CostsScreen$lambda$64$lambda$63$lambda$61;
                        }
                    };
                    final MainActivityKt$CostsScreen$lambda$64$lambda$63$$inlined$items$default$1 mainActivityKt$CostsScreen$lambda$64$lambda$63$$inlined$items$default$1 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$CostsScreen$lambda$64$lambda$63$$inlined$items$default$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Void invoke(CostNote costNote) {
                            return null;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke((CostNote) obj);
                        }
                    };
                    ScreenColumn.items(list.size(), new Function1<Integer, Object>() { // from class: com.emeraldpulse.kyra.MainActivityKt$CostsScreen$lambda$64$lambda$63$$inlined$items$default$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i3) {
                            return Function1.this.invoke(list.get(i3));
                        }
                    }, new Function1<Integer, Object>() { // from class: com.emeraldpulse.kyra.MainActivityKt$CostsScreen$lambda$64$lambda$63$$inlined$items$default$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i3) {
                            return Function1.this.invoke(list.get(i3));
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$CostsScreen$lambda$64$lambda$63$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope lazyItemScope, int i3, Composer composer, int i4) {
                            int i5;
                            ComposerKt.sourceInformation(composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                            if ((i4 & 6) == 0) {
                                i5 = (composer.changed(lazyItemScope) ? 4 : 2) | i4;
                            } else {
                                i5 = i4;
                            }
                            if ((i4 & 48) == 0) {
                                i5 |= composer.changed(i3) ? 32 : 16;
                            }
                            if (!composer.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            CostNote costNote = (CostNote) list.get(i3);
                            composer.startReplaceGroup(-794004068);
                            ComposerKt.sourceInformation(composer, "C*404@15109L24:MainActivity.kt#f5odrr");
                            MainActivityKt.CostCard(costNote, function1, composer, 0);
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Object CostsScreen$lambda$64$lambda$63$lambda$61(CostNote it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void ScoreScreen(final List<RoomChecklist> list, final List<Supply> list2, final List<FixTask> list3, final List<CostNote> list4, final PaddingValues paddingValues, final Function0<Unit> function0, Composer composer, final int i) {
                final int roundToInt;
                int i2;
                final int roundToInt2;
                int i3;
                final int roundToInt3;
                Composer startRestartGroup = composer.startRestartGroup(1652911278);
                ComposerKt.sourceInformation(startRestartGroup, "C(ScoreScreen)P(4,5,1!1,3)424@16027L1574,424@16005L1596:MainActivity.kt#f5odrr");
                int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
                if ((i & 48) == 0) {
                    i4 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i4 |= startRestartGroup.changedInstance(list3) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changedInstance(list4) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    i4 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
                }
                int i5 = i4;
                if ((74899 & i5) == 74898 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1652911278, i5, -1, "com.emeraldpulse.kyra.ScoreScreen (MainActivity.kt:418)");
                    }
                    if (list.isEmpty()) {
                        roundToInt = 0;
                    } else {
                        List<RoomChecklist> list5 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                        Iterator<T> it = list5.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Float.valueOf(((RoomChecklist) it.next()).getProgress()));
                        }
                        roundToInt = MathKt.roundToInt(CollectionsKt.averageOfFloat(arrayList) * 100);
                    }
                    if (list2.isEmpty()) {
                        roundToInt2 = 0;
                    } else {
                        List<Supply> list6 = list2;
                        if ((list6 instanceof Collection) && list6.isEmpty()) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            for (Supply supply : list6) {
                                if (supply.getQuantity() > supply.getMinimum() && (i2 = i2 + 1) < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                        roundToInt2 = MathKt.roundToInt((i2 / list2.size()) * 100);
                    }
                    if (list3.isEmpty()) {
                        roundToInt3 = 0;
                    } else {
                        List<FixTask> list7 = list3;
                        if ((list7 instanceof Collection) && list7.isEmpty()) {
                            i3 = 0;
                        } else {
                            Iterator<T> it2 = list7.iterator();
                            i3 = 0;
                            while (it2.hasNext()) {
                                if (((FixTask) it2.next()).getDaysUntilDue() > 0 && (i3 = i3 + 1) < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                        roundToInt3 = MathKt.roundToInt((i3 / list3.size()) * 100);
                    }
                    Iterator<T> it3 = list4.iterator();
                    int i6 = 0;
                    while (it3.hasNext()) {
                        i6 += ((CostNote) it3.next()).getAmountCents();
                    }
                    final int coerceIn = RangesKt.coerceIn(100 - MathKt.roundToInt((i6 / 25000.0f) * 35.0f), 35, 100);
                    final int roundToInt4 = MathKt.roundToInt((roundToInt * 0.35f) + (roundToInt2 * 0.25f) + (roundToInt3 * 0.25f) + (coerceIn * 0.15f));
                    startRestartGroup.startReplaceGroup(-1224400529);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(roundToInt4) | startRestartGroup.changed(roundToInt) | startRestartGroup.changed(roundToInt2) | startRestartGroup.changed(roundToInt3) | startRestartGroup.changed(coerceIn) | startRestartGroup.changedInstance(list4) | ((i5 & 458752) == 131072);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit ScoreScreen$lambda$71$lambda$70;
                                ScoreScreen$lambda$71$lambda$70 = MainActivityKt.ScoreScreen$lambda$71$lambda$70(roundToInt4, roundToInt, roundToInt2, roundToInt3, coerceIn, list4, function0, (LazyListScope) obj);
                                return ScoreScreen$lambda$71$lambda$70;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    ScreenColumn(paddingValues, (Function1) rememberedValue, startRestartGroup, (i5 >> 12) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ScoreScreen$lambda$72;
                            ScoreScreen$lambda$72 = MainActivityKt.ScoreScreen$lambda$72(list, list2, list3, list4, paddingValues, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                            return ScoreScreen$lambda$72;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit ScoreScreen$lambda$71$lambda$70(final int i, final int i2, final int i3, final int i4, final int i5, final List list, final Function0 function0, LazyListScope ScreenColumn) {
                Intrinsics.checkNotNullParameter(ScreenColumn, "$this$ScreenColumn");
                LazyListScope.CC.item$default(ScreenColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2124700851, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$ScoreScreen$1$1$1

                    /* compiled from: MainActivity.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                    /* renamed from: com.emeraldpulse.kyra.MainActivityKt$ScoreScreen$1$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
                        final /* synthetic */ int $readiness;

                        AnonymousClass1(int i) {
                            this.$readiness = i;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final float invoke$lambda$2$lambda$1$lambda$0(int i) {
                            return i / 100.0f;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                            invoke(columnScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Card, Composer composer, int i) {
                            long j;
                            String readinessMessage;
                            long j2;
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            ComposerKt.sourceInformation(composer, "C427@16177L722:MainActivity.kt#f5odrr");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(646165157, i, -1, "com.emeraldpulse.kyra.ScoreScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:427)");
                            }
                            Modifier m1201padding3ABfNKs = PaddingKt.m1201padding3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(20));
                            Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(14));
                            final int i2 = this.$readiness;
                            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m868spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
                            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1201padding3ABfNKs);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
                            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, -1648057903, "C428@16282L93,429@16396L81,430@16498L93,432@16672L20,431@16612L269:MainActivity.kt#f5odrr");
                            TextKt.m4292TextNvy7gAk("Readiness score", null, Color.INSTANCE.m6823getWhite0d7_KjU(), null, TextUnitKt.getSp(24), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597830, 0, 262058);
                            String valueOf = String.valueOf(i2);
                            j = MainActivityKt.Mint;
                            TextKt.m4292TextNvy7gAk(valueOf, null, j, null, TextUnitKt.getSp(56), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597824, 0, 262058);
                            readinessMessage = MainActivityKt.readinessMessage(i2);
                            TextKt.m4292TextNvy7gAk(readinessMessage, null, Color.m6785copywmQWz5c$default(Color.INSTANCE.m6823getWhite0d7_KjU(), 0.86f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, TextUnitKt.getSp(20), 0, false, 0, 0, null, null, composer, 384, 48, 260090);
                            j2 = MainActivityKt.Mint;
                            long m6785copywmQWz5c$default = Color.m6785copywmQWz5c$default(Color.INSTANCE.m6823getWhite0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null);
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            composer.startReplaceGroup(5004770);
                            ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
                            boolean changed = composer.changed(i2);
                            Object rememberedValue = composer.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01cb: CONSTRUCTOR (r6v7 'rememberedValue' java.lang.Object) = (r4v0 'i2' int A[DONT_INLINE]) A[MD:(int):void (m)] (LINE:433) call: com.emeraldpulse.kyra.MainActivityKt$ScoreScreen$1$1$1$1$$ExternalSyntheticLambda0.<init>(int):void type: CONSTRUCTOR in method: com.emeraldpulse.kyra.MainActivityKt$ScoreScreen$1$1$1.1.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.emeraldpulse.kyra.MainActivityKt$ScoreScreen$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 25 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 509
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.emeraldpulse.kyra.MainActivityKt$ScoreScreen$1$1$1.AnonymousClass1.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i6) {
                            long j;
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            ComposerKt.sourceInformation(composer, "C426@16083L40,426@16159L754,426@16056L857:MainActivity.kt#f5odrr");
                            if ((i6 & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2124700851, i6, -1, "com.emeraldpulse.kyra.ScoreScreen.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:426)");
                            }
                            CardDefaults cardDefaults = CardDefaults.INSTANCE;
                            j = MainActivityKt.DeepEmerald;
                            CardKt.Card(null, RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8)), cardDefaults.m2643cardColorsro_MJ88(j, 0L, 0L, 0L, composer, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.rememberComposableLambda(646165157, true, new AnonymousClass1(i), composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 25);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    LazyListScope.CC.item$default(ScreenColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-456142486, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$ScoreScreen$1$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i6) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            ComposerKt.sourceInformation(composer, "C441@16951L320:MainActivity.kt#f5odrr");
                            if ((i6 & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-456142486, i6, -1, "com.emeraldpulse.kyra.ScoreScreen.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:441)");
                            }
                            Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(10));
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            int i7 = i2;
                            int i8 = i3;
                            int i9 = i4;
                            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m868spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
                            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
                            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, -1513427758, "C442@17062L53,443@17132L56,444@17205L52:MainActivity.kt#f5odrr");
                            MainActivityKt.StatPill("Rooms", i7 + "%", RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 6, 0);
                            MainActivityKt.StatPill("Supply", i8 + "%", RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 6, 0);
                            MainActivityKt.StatPill("Fixes", i9 + "%", RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 6, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    LazyListScope.CC.item$default(ScreenColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-192445461, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$ScoreScreen$1$1$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i6) {
                            String money;
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            ComposerKt.sourceInformation(composer, "C447@17297L110:MainActivity.kt#f5odrr");
                            if ((i6 & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-192445461, i6, -1, "com.emeraldpulse.kyra.ScoreScreen.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:447)");
                            }
                            String str = i5 + "%";
                            Iterator<T> it = list.iterator();
                            int i7 = 0;
                            while (it.hasNext()) {
                                i7 += ((CostNote) it.next()).getAmountCents();
                            }
                            money = MainActivityKt.money(i7);
                            MainActivityKt.MetricCard("Cost pressure", str, money + " spent", i5 / 100.0f, composer, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    LazyListScope.CC.item$default(ScreenColumn, null, null, ComposableLambdaKt.composableLambdaInstance(71251564, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$ScoreScreen$1$1$4
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i6) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            ComposerKt.sourceInformation(composer, "C449@17437L148:MainActivity.kt#f5odrr");
                            if ((i6 & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(71251564, i6, -1, "com.emeraldpulse.kyra.ScoreScreen.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:449)");
                            }
                            ButtonKt.OutlinedButton(function0, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableSingletons$MainActivityKt.INSTANCE.m10373getLambda$1534059554$app_release(), composer, 805306416, 508);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    return Unit.INSTANCE;
                }

                private static final void ScreenColumn(final PaddingValues paddingValues, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i) {
                    int i2;
                    Composer startRestartGroup = composer.startRestartGroup(1578128911);
                    ComposerKt.sourceInformation(startRestartGroup, "C(ScreenColumn)P(1)461@17750L336:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changed(paddingValues) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                    }
                    if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1578128911, i2, -1, "com.emeraldpulse.kyra.ScreenColumn (MainActivity.kt:460)");
                        }
                        float f = 18;
                        LazyDslKt.LazyColumn(PaddingKt.m1203paddingVpY3zN4$default(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), Dp.m9732constructorimpl(f), 0.0f, 2, null), null, PaddingKt.m1198PaddingValuesa9UjIt4$default(0.0f, Dp.m9732constructorimpl(16), 0.0f, Dp.m9732constructorimpl(paddingValues.getBottom() + Dp.m9732constructorimpl(f)), 5, null), false, Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(14)), null, null, false, null, function1, startRestartGroup, ((i2 << 24) & 1879048192) | 24576, 490);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ScreenColumn$lambda$73;
                                ScreenColumn$lambda$73 = MainActivityKt.ScreenColumn$lambda$73(PaddingValues.this, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                                return ScreenColumn$lambda$73;
                            }
                        });
                    }
                }

                private static final void HeroHeader(LazyListScope lazyListScope, final String str, final String str2, final String str3, final Function0<Unit> function0) {
                    LazyListScope.CC.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1675730164, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$HeroHeader$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            ComposerKt.sourceInformation(composer, "C474@18280L40,474@18322L1318,474@18219L1421:MainActivity.kt#f5odrr");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1675730164, i, -1, "com.emeraldpulse.kyra.HeroHeader.<anonymous> (MainActivity.kt:474)");
                            }
                            RoundedCornerShape m1582RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8));
                            CardColors m2643cardColorsro_MJ88 = CardDefaults.INSTANCE.m2643cardColorsro_MJ88(Color.INSTANCE.m6823getWhite0d7_KjU(), 0L, 0L, 0L, composer, (CardDefaults.$stable << 12) | 6, 14);
                            final String str4 = str;
                            final String str5 = str2;
                            final Function0<Unit> function02 = function0;
                            final String str6 = str3;
                            CardKt.Card(null, m1582RoundedCornerShape0680j_4, m2643cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(1132331006, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$HeroHeader$1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                    invoke(columnScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope Card, Composer composer2, int i2) {
                                    long j;
                                    long j2;
                                    long j3;
                                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    ComposerKt.sourceInformation(composer2, "C475@18336L1294:MainActivity.kt#f5odrr");
                                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1132331006, i2, -1, "com.emeraldpulse.kyra.HeroHeader.<anonymous>.<anonymous> (MainActivity.kt:475)");
                                    }
                                    String str7 = str4;
                                    String str8 = str5;
                                    Function0<Unit> function03 = function02;
                                    final String str9 = str6;
                                    ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                                    int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer m5864constructorimpl = Updater.m5864constructorimpl(composer2);
                                    Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                    Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                    Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1822482539, "C477@18395L35,476@18358L312,484@18687L260,490@18964L652:MainActivity.kt#f5odrr");
                                    float f = 172;
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ep_hero, composer2, 0), (String) null, SizeKt.m1257height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m9732constructorimpl(f)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, Painter.$stable | 25008, LocationRequestCompat.QUALITY_LOW_POWER);
                                    Modifier m1257height3ABfNKs = SizeKt.m1257height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m9732constructorimpl(f));
                                    Brush.Companion companion2 = Brush.INSTANCE;
                                    j = MainActivityKt.DeepEmerald;
                                    BoxKt.Box(BackgroundKt.background$default(m1257height3ABfNKs, Brush.Companion.m6741verticalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6776boximpl(Color.INSTANCE.m6821getTransparent0d7_KjU()), Color.m6776boximpl(Color.m6785copywmQWz5c$default(j, 0.9f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer2, 6);
                                    Modifier m1201padding3ABfNKs = PaddingKt.m1201padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomStart()), Dp.m9732constructorimpl(16));
                                    Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(6));
                                    ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m868spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                                    int m2 = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m1201padding3ABfNKs);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer m5864constructorimpl2 = Updater.m5864constructorimpl(composer2);
                                    Updater.m5872setimpl(m5864constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                    Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                    Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer2, 315130699, "C496@19216L81,497@19318L53,498@19443L63,498@19508L90,498@19392L206:MainActivity.kt#f5odrr");
                                    TextKt.m4292TextNvy7gAk(str7, null, Color.INSTANCE.m6823getWhite0d7_KjU(), null, TextUnitKt.getSp(25), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 1597824, 0, 262058);
                                    TextKt.m4292TextNvy7gAk(str8, null, Color.m6785copywmQWz5c$default(Color.INSTANCE.m6823getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 384, 0, 262138);
                                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                    j2 = MainActivityKt.Mint;
                                    j3 = MainActivityKt.DeepEmerald;
                                    ButtonKt.Button(function03, (Modifier) null, false, (Shape) null, buttonDefaults.m2589buttonColorsro_MJ88(j2, j3, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 54, 12), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1483011606, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$HeroHeader$1$1$1$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                            invoke(rowScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope Button, Composer composer3, int i3) {
                                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                            ComposerKt.sourceInformation(composer3, "C499@19534L42:MainActivity.kt#f5odrr");
                                            if ((i3 & 17) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1483011606, i3, -1, "com.emeraldpulse.kyra.HeroHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:499)");
                                            }
                                            TextKt.m4292TextNvy7gAk(str9, null, 0L, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 1572864, 0, 262078);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), composer2, 805306368, 494);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 25);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                }

                private static final void SectionHeader(LazyListScope lazyListScope, final String str, final String str2, final String str3, final Function0<Unit> function0) {
                    LazyListScope.CC.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1393000019, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$SectionHeader$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            long j;
                            long j2;
                            long j3;
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            ComposerKt.sourceInformation(composer, "C509@19782L560:MainActivity.kt#f5odrr");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1393000019, i, -1, "com.emeraldpulse.kyra.SectionHeader.<anonymous> (MainActivity.kt:509)");
                            }
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            Function0<Unit> function02 = function0;
                            String str4 = str;
                            String str5 = str2;
                            final String str6 = str3;
                            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
                            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
                            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, 1786084884, "C514@19980L200,518@20244L42,518@20288L44,518@20193L139:MainActivity.kt#f5odrr");
                            Modifier weight$default = RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m2 = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, weight$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor2);
                            } else {
                                composer.useNode();
                            }
                            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(composer);
                            Updater.m5872setimpl(m5864constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, -1281522978, "C515@20026L73,516@20116L50:MainActivity.kt#f5odrr");
                            j = MainActivityKt.Ink;
                            TextKt.m4292TextNvy7gAk(str4, null, j, null, TextUnitKt.getSp(25), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597824, 0, 262058);
                            j2 = MainActivityKt.MutedInk;
                            TextKt.m4292TextNvy7gAk(str5, null, j2, null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24960, 0, 262122);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                            j3 = MainActivityKt.DeepEmerald;
                            ButtonKt.Button(function02, (Modifier) null, false, (Shape) null, buttonDefaults.m2589buttonColorsro_MJ88(j3, 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1961335423, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$SectionHeader$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                    invoke(rowScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer2, int i2) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    ComposerKt.sourceInformation(composer2, "C519@20306L12:MainActivity.kt#f5odrr");
                                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1961335423, i2, -1, "com.emeraldpulse.kyra.SectionHeader.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:519)");
                                    }
                                    TextKt.m4292TextNvy7gAk(str6, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262142);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, 805306368, 494);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void RoomCard(final RoomChecklist roomChecklist, final Function2<? super RoomChecklist, ? super Integer, Unit> function2, final Function1<? super RoomChecklist, Unit> function1, Composer composer, final int i) {
                    int i2;
                    Composer composer2;
                    Composer startRestartGroup = composer.startRestartGroup(1808876734);
                    ComposerKt.sourceInformation(startRestartGroup, "C(RoomCard)P(2,1)527@20547L40,527@20589L1919,527@20486L2022:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changedInstance(roomChecklist) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
                    }
                    if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1808876734, i2, -1, "com.emeraldpulse.kyra.RoomCard (MainActivity.kt:526)");
                        }
                        composer2 = startRestartGroup;
                        CardKt.Card(null, RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8)), CardDefaults.INSTANCE.m2643cardColorsro_MJ88(Color.INSTANCE.m6823getWhite0d7_KjU(), 0L, 0L, 0L, composer2, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-373378676, true, new MainActivityKt$RoomCard$1(roomChecklist, function1, function2), composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 25);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit RoomCard$lambda$74;
                                RoomCard$lambda$74 = MainActivityKt.RoomCard$lambda$74(RoomChecklist.this, function2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                                return RoomCard$lambda$74;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void SupplyCard(final Supply supply, final Function2<? super Supply, ? super Integer, Unit> function2, Composer composer, final int i) {
                    int i2;
                    Composer startRestartGroup = composer.startRestartGroup(-604750273);
                    ComposerKt.sourceInformation(startRestartGroup, "C(SupplyCard)P(1)569@22663L40,569@22705L1230,569@22602L1333:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changed(supply) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
                    }
                    if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-604750273, i2, -1, "com.emeraldpulse.kyra.SupplyCard (MainActivity.kt:568)");
                        }
                        CardKt.Card(null, RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8)), CardDefaults.INSTANCE.m2643cardColorsro_MJ88(Color.INSTANCE.m6823getWhite0d7_KjU(), 0L, 0L, 0L, startRestartGroup, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-574582991, true, new MainActivityKt$SupplyCard$1(supply, function2), startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 25);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda39
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SupplyCard$lambda$75;
                                SupplyCard$lambda$75 = MainActivityKt.SupplyCard$lambda$75(Supply.this, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                                return SupplyCard$lambda$75;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void FixCard(final FixTask fixTask, final Function1<? super FixTask, Unit> function1, final Function1<? super FixTask, Unit> function12, Composer composer, final int i) {
                    int i2;
                    Composer composer2;
                    Composer startRestartGroup = composer.startRestartGroup(-1593146998);
                    ComposerKt.sourceInformation(startRestartGroup, "C(FixCard)590@24112L40,590@24154L1157,590@24051L1260:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changed(fixTask) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                    }
                    if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1593146998, i2, -1, "com.emeraldpulse.kyra.FixCard (MainActivity.kt:589)");
                        }
                        composer2 = startRestartGroup;
                        CardKt.Card(null, RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8)), CardDefaults.INSTANCE.m2643cardColorsro_MJ88(Color.INSTANCE.m6823getWhite0d7_KjU(), 0L, 0L, 0L, composer2, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1573404548, true, new MainActivityKt$FixCard$1(fixTask, function1, function12), composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 25);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FixCard$lambda$76;
                                FixCard$lambda$76 = MainActivityKt.FixCard$lambda$76(FixTask.this, function1, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                                return FixCard$lambda$76;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void CostCard(final CostNote costNote, final Function1<? super CostNote, Unit> function1, Composer composer, final int i) {
                    int i2;
                    Composer startRestartGroup = composer.startRestartGroup(-984622768);
                    ComposerKt.sourceInformation(startRestartGroup, "C(CostCard)614@25461L40,614@25503L777,614@25400L880:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changed(costNote) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                    }
                    if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-984622768, i2, -1, "com.emeraldpulse.kyra.CostCard (MainActivity.kt:613)");
                        }
                        CardKt.Card(null, RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8)), CardDefaults.INSTANCE.m2643cardColorsro_MJ88(Color.INSTANCE.m6823getWhite0d7_KjU(), 0L, 0L, 0L, startRestartGroup, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-954455486, true, new MainActivityKt$CostCard$1(costNote, function1), startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 25);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda38
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit CostCard$lambda$77;
                                CostCard$lambda$77 = MainActivityKt.CostCard$lambda$77(CostNote.this, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                                return CostCard$lambda$77;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void MetricCard(final String str, final String str2, final String str3, final float f, Composer composer, final int i) {
                    int i2;
                    Composer composer2;
                    Composer startRestartGroup = composer.startRestartGroup(1646400994);
                    ComposerKt.sourceInformation(startRestartGroup, "C(MetricCard)P(2,3,1)633@26451L40,633@26493L452,633@26390L555:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changed(str2) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= startRestartGroup.changed(str3) ? 256 : 128;
                    }
                    if ((i & 3072) == 0) {
                        i2 |= startRestartGroup.changed(f) ? 2048 : 1024;
                    }
                    if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1646400994, i2, -1, "com.emeraldpulse.kyra.MetricCard (MainActivity.kt:632)");
                        }
                        composer2 = startRestartGroup;
                        CardKt.Card(null, RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8)), CardDefaults.INSTANCE.m2643cardColorsro_MJ88(Color.INSTANCE.m6823getWhite0d7_KjU(), 0L, 0L, 0L, composer2, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-855941036, true, new MainActivityKt$MetricCard$1(str, str2, str3, f), composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 25);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit MetricCard$lambda$78;
                                MetricCard$lambda$78 = MainActivityKt.MetricCard$lambda$78(str, str2, str3, f, i, (Composer) obj, ((Integer) obj2).intValue());
                                return MetricCard$lambda$78;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
                /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void StatPill(final String str, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
                    int i3;
                    Modifier modifier2;
                    Composer composer2;
                    final Modifier modifier3;
                    ScopeUpdateScope endRestartGroup;
                    Composer startRestartGroup = composer.startRestartGroup(1585223531);
                    ComposerKt.sourceInformation(startRestartGroup, "C(StatPill)P(!1,2)645@27131L40,645@27173L327,645@27049L451:MainActivity.kt#f5odrr");
                    if ((i2 & 1) != 0) {
                        i3 = i | 6;
                    } else if ((i & 6) == 0) {
                        i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
                    } else {
                        i3 = i;
                    }
                    if ((i2 & 2) != 0) {
                        i3 |= 48;
                    } else if ((i & 48) == 0) {
                        i3 |= startRestartGroup.changed(str2) ? 32 : 16;
                    }
                    int i4 = i2 & 4;
                    if (i4 != 0) {
                        i3 |= 384;
                    } else if ((i & 384) == 0) {
                        modifier2 = modifier;
                        i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                        if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1585223531, i3, -1, "com.emeraldpulse.kyra.StatPill (MainActivity.kt:644)");
                            }
                            composer2 = startRestartGroup;
                            Modifier modifier5 = modifier4;
                            CardKt.Card(modifier5, RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8)), CardDefaults.INSTANCE.m2643cardColorsro_MJ88(Color.INSTANCE.m6823getWhite0d7_KjU(), 0L, 0L, 0L, composer2, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.rememberComposableLambda(250814301, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$StatPill$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                    invoke(columnScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope Card, Composer composer3, int i5) {
                                    long j;
                                    long j2;
                                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    ComposerKt.sourceInformation(composer3, "C646@27183L311:MainActivity.kt#f5odrr");
                                    if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(250814301, i5, -1, "com.emeraldpulse.kyra.StatPill.<anonymous> (MainActivity.kt:646)");
                                    }
                                    Modifier m1201padding3ABfNKs = PaddingKt.m1201padding3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(12));
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    String str3 = str2;
                                    String str4 = str;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                                    int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m1201padding3ABfNKs);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m5864constructorimpl = Updater.m5864constructorimpl(composer3);
                                    Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                    Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                    Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1495919323, "C647@27281L95,648@27389L95:MainActivity.kt#f5odrr");
                                    j = MainActivityKt.DeepEmerald;
                                    TextKt.m4292TextNvy7gAk(str3, null, j, null, TextUnitKt.getSp(20), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer3, 1597824, 24576, 245674);
                                    j2 = MainActivityKt.MutedInk;
                                    TextKt.m4292TextNvy7gAk(str4, null, j2, null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9658getEllipsisgIe3tQ8(), false, 1, 0, null, null, composer3, 24960, 24960, 241642);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, ((i3 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 24);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            composer2 = startRestartGroup;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda31
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit StatPill$lambda$79;
                                    StatPill$lambda$79 = MainActivityKt.StatPill$lambda$79(str, str2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return StatPill$lambda$79;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    modifier2 = modifier;
                    if ((i3 & 147) == 146) {
                    }
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    Modifier modifier52 = modifier4;
                    CardKt.Card(modifier52, RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8)), CardDefaults.INSTANCE.m2643cardColorsro_MJ88(Color.INSTANCE.m6823getWhite0d7_KjU(), 0L, 0L, 0L, composer2, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.rememberComposableLambda(250814301, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$StatPill$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Card, Composer composer3, int i5) {
                            long j;
                            long j2;
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            ComposerKt.sourceInformation(composer3, "C646@27183L311:MainActivity.kt#f5odrr");
                            if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(250814301, i5, -1, "com.emeraldpulse.kyra.StatPill.<anonymous> (MainActivity.kt:646)");
                            }
                            Modifier m1201padding3ABfNKs = PaddingKt.m1201padding3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(12));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            String str3 = str2;
                            String str4 = str;
                            ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m1201padding3ABfNKs);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer3);
                            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, -1495919323, "C647@27281L95,648@27389L95:MainActivity.kt#f5odrr");
                            j = MainActivityKt.DeepEmerald;
                            TextKt.m4292TextNvy7gAk(str3, null, j, null, TextUnitKt.getSp(20), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer3, 1597824, 24576, 245674);
                            j2 = MainActivityKt.MutedInk;
                            TextKt.m4292TextNvy7gAk(str4, null, j2, null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9658getEllipsisgIe3tQ8(), false, 1, 0, null, null, composer3, 24960, 24960, 241642);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, ((i3 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 24);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void StatusChip(final String str, final boolean z, Composer composer, final int i) {
                    int i2;
                    Composer composer2;
                    Composer startRestartGroup = composer.startRestartGroup(-533394288);
                    ComposerKt.sourceInformation(startRestartGroup, "C(StatusChip)655@27577L349:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = i | (startRestartGroup.changed(str) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changed(z) ? 32 : 16;
                    }
                    if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-533394288, i2, -1, "com.emeraldpulse.kyra.StatusChip (MainActivity.kt:654)");
                        }
                        composer2 = startRestartGroup;
                        TextKt.m4292TextNvy7gAk(str, PaddingKt.m1202paddingVpY3zN4(BackgroundKt.m353backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8))), z ? Alert : Color.m6785copywmQWz5c$default(Mint, 0.26f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m9732constructorimpl(9), Dp.m9732constructorimpl(6)), z ? Color.INSTANCE.m6823getWhite0d7_KjU() : DeepEmerald, null, TextUnitKt.getSp(12), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, (i2 & 14) | 1597440, 0, 262056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit StatusChip$lambda$80;
                                StatusChip$lambda$80 = MainActivityKt.StatusChip$lambda$80(str, z, i, (Composer) obj, ((Integer) obj2).intValue());
                                return StatusChip$lambda$80;
                            }
                        });
                    }
                }

                private static final void EmptyState(LazyListScope lazyListScope, final String str, final String str2, final Function0<Unit> function0) {
                    LazyListScope.CC.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1599113324, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$EmptyState$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            ComposerKt.sourceInformation(composer, "C669@28100L40,669@28142L543,669@28039L646:MainActivity.kt#f5odrr");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1599113324, i, -1, "com.emeraldpulse.kyra.EmptyState.<anonymous> (MainActivity.kt:669)");
                            }
                            RoundedCornerShape m1582RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(8));
                            CardColors m2643cardColorsro_MJ88 = CardDefaults.INSTANCE.m2643cardColorsro_MJ88(Color.INSTANCE.m6823getWhite0d7_KjU(), 0L, 0L, 0L, composer, (CardDefaults.$stable << 12) | 6, 14);
                            final String str3 = str;
                            final String str4 = str2;
                            final Function0<Unit> function02 = function0;
                            CardKt.Card(null, m1582RoundedCornerShape0680j_4, m2643cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(-1861703966, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$EmptyState$1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                    invoke(columnScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope Card, Composer composer2, int i2) {
                                    long j;
                                    long j2;
                                    long j3;
                                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    ComposerKt.sourceInformation(composer2, "C670@28156L519:MainActivity.kt#f5odrr");
                                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1861703966, i2, -1, "com.emeraldpulse.kyra.EmptyState.<anonymous>.<anonymous> (MainActivity.kt:670)");
                                    }
                                    Modifier m1201padding3ABfNKs = PaddingKt.m1201padding3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(18));
                                    Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(10));
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    String str5 = str3;
                                    String str6 = str4;
                                    Function0<Unit> function03 = function02;
                                    ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m868spacedBy0680j_4, centerHorizontally, composer2, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                                    int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1201padding3ABfNKs);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer m5864constructorimpl = Updater.m5864constructorimpl(composer2);
                                    Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                    Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                    Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -837237321, "C671@28309L103,672@28429L58,673@28555L42,673@28504L157:MainActivity.kt#f5odrr");
                                    j = MainActivityKt.Ink;
                                    TextKt.m4292TextNvy7gAk(str5, null, j, null, TextUnitKt.getSp(20), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, TextAlign.m9593boximpl(TextAlign.INSTANCE.m9600getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer2, 1597824, 0, 261034);
                                    j2 = MainActivityKt.MutedInk;
                                    TextKt.m4292TextNvy7gAk(str6, null, j2, null, 0L, null, null, null, 0L, null, TextAlign.m9593boximpl(TextAlign.INSTANCE.m9600getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer2, 384, 0, 261114);
                                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                    j3 = MainActivityKt.DeepEmerald;
                                    ButtonKt.Button(function03, (Modifier) null, false, (Shape) null, buttonDefaults.m2589buttonColorsro_MJ88(j3, 0L, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableSingletons$MainActivityKt.INSTANCE.getLambda$1426846012$app_release(), composer2, 805306368, 494);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 25);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v16 */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3, types: [int] */
                public static final void PulseBottomBar(final int i, final Function1<? super Integer, Unit> function1, Composer composer, final int i2) {
                    Composer composer2;
                    Composer startRestartGroup = composer.startRestartGroup(-1177497832);
                    ComposerKt.sourceInformation(startRestartGroup, "C(PulseBottomBar)P(1)683@28785L1181:MainActivity.kt#f5odrr");
                    int i3 = (i2 & 6) == 0 ? (startRestartGroup.changed(i) ? 4 : 2) | i2 : i2;
                    int i4 = 32;
                    if ((i2 & 48) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                    }
                    int i5 = i3;
                    if ((i5 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1177497832, i5, -1, "com.emeraldpulse.kyra.PulseBottomBar (MainActivity.kt:682)");
                        }
                        float f = 0.0f;
                        ?? r5 = 1;
                        Object obj = null;
                        float f2 = 8;
                        Modifier m1202paddingVpY3zN4 = PaddingKt.m1202paddingVpY3zN4(WindowInsetsPadding_androidKt.navigationBarsPadding(BackgroundKt.m353backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m6823getWhite0d7_KjU(), null, 2, null)), Dp.m9732constructorimpl(f2), Dp.m9732constructorimpl(f2));
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                        String str = "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                        int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1202paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i6 = i5;
                        float f3 = f2;
                        String str2 = "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
                        Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2137186270, "C:MainActivity.kt#f5odrr");
                        startRestartGroup.startReplaceGroup(1732174352);
                        ComposerKt.sourceInformation(startRestartGroup, "*697@29320L19,693@29161L789");
                        final int i7 = 0;
                        for (Object obj2 : PulseTab.getEntries()) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            PulseTab pulseTab = (PulseTab) obj2;
                            boolean z = i == i7 ? r5 : false;
                            RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                            Modifier clip = ClipKt.clip(RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), RoundedCornerShapeKt.m1582RoundedCornerShape0680j_4(Dp.m9732constructorimpl(f3)));
                            startRestartGroup.startReplaceGroup(-1633490746);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                            boolean changed = ((i6 & 112) == i4 ? r5 : false) | startRestartGroup.changed(i7);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit PulseBottomBar$lambda$85$lambda$84$lambda$82$lambda$81;
                                        PulseBottomBar$lambda$85$lambda$84$lambda$82$lambda$81 = MainActivityKt.PulseBottomBar$lambda$85$lambda$84$lambda$82$lambda$81(Function1.this, i7);
                                        return PulseBottomBar$lambda$85$lambda$84$lambda$82$lambda$81;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier m1203paddingVpY3zN4$default = PaddingKt.m1203paddingVpY3zN4$default(BackgroundKt.m353backgroundbw27NRU$default(ClickableKt.m399clickableoSLSa3U$default(clip, false, null, null, null, (Function0) rememberedValue, 15, null), z ? Color.m6785copywmQWz5c$default(Mint, 0.24f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m6821getTransparent0d7_KjU(), null, 2, null), f, Dp.m9732constructorimpl(7), r5, obj);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(3));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m868spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, str);
                            int m2 = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1203paddingVpY3zN4$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, str2);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(startRestartGroup);
                            Updater.m5872setimpl(m5864constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1487541314, "C703@29662L28,703@29646L110,704@29773L163:MainActivity.kt#f5odrr");
                            String str3 = str2;
                            String str4 = str;
                            float f4 = f3;
                            ImageKt.Image(PainterResources_androidKt.painterResource(pulseTab.getIconRes(), startRestartGroup, 0), pulseTab.getLabel(), SizeKt.m1271size3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(25)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, Painter.$stable | 384, 120);
                            String label = pulseTab.getLabel();
                            long j = z ? DeepEmerald : MutedInk;
                            long sp = TextUnitKt.getSp(11);
                            FontWeight.Companion companion = FontWeight.INSTANCE;
                            FontWeight bold = z ? companion.getBold() : companion.getNormal();
                            Composer composer3 = startRestartGroup;
                            TextKt.m4292TextNvy7gAk(label, null, j, null, sp, null, bold, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer3, 24576, 24576, 245674);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            startRestartGroup = composer3;
                            i7 = i8;
                            rowScopeInstance = rowScopeInstance2;
                            f3 = f4;
                            str2 = str3;
                            str = str4;
                            obj = null;
                            f = 0.0f;
                            r5 = 1;
                            i6 = i6;
                            i4 = 32;
                        }
                        composer2 = startRestartGroup;
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Unit PulseBottomBar$lambda$86;
                                PulseBottomBar$lambda$86 = MainActivityKt.PulseBottomBar$lambda$86(i, function1, i2, (Composer) obj3, ((Integer) obj4).intValue());
                                return PulseBottomBar$lambda$86;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit PulseBottomBar$lambda$85$lambda$84$lambda$82$lambda$81(Function1 function1, int i) {
                    function1.invoke(Integer.valueOf(i));
                    return Unit.INSTANCE;
                }

                private static final void AddRoomDialog(final Function0<Unit> function0, final Function1<? super RoomChecklist, Unit> function1, Composer composer, final int i) {
                    int i2;
                    Composer startRestartGroup = composer.startRestartGroup(113027354);
                    ComposerKt.sourceInformation(startRestartGroup, "C(AddRoomDialog)712@30082L31,713@30131L31,714@30181L85,715@30316L451,715@30271L496:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                    }
                    if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(113027354, i2, -1, "com.emeraldpulse.kyra.AddRoomDialog (MainActivity.kt:711)");
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        MutableState mutableState = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        MutableState mutableState2 = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Inspect surfaces, Test safety item, Clear blocked area", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceGroup();
                        EntryDialog("Add room checklist", function0, ComposableLambdaKt.rememberComposableLambda(926321847, true, new MainActivityKt$AddRoomDialog$1(function1, mutableState, mutableState2, (MutableState) rememberedValue3), startRestartGroup, 54), startRestartGroup, ((i2 << 3) & 112) | 390);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda25
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AddRoomDialog$lambda$96;
                                AddRoomDialog$lambda$96 = MainActivityKt.AddRoomDialog$lambda$96(Function0.this, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                                return AddRoomDialog$lambda$96;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddRoomDialog$lambda$88(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddRoomDialog$lambda$91(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddRoomDialog$lambda$94(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                private static final void AddSupplyDialog(final Function0<Unit> function0, final Function1<? super Supply, Unit> function1, Composer composer, final int i) {
                    int i2;
                    Composer startRestartGroup = composer.startRestartGroup(1161143662);
                    ComposerKt.sourceInformation(startRestartGroup, "C(AddSupplyDialog)727@30878L31,728@30926L31,729@30978L32,730@31030L32,731@31079L34,732@31155L544,732@31118L581:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                    }
                    int i3 = i2;
                    if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1161143662, i3, -1, "com.emeraldpulse.kyra.AddSupplyDialog (MainActivity.kt:726)");
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        MutableState mutableState = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        MutableState mutableState2 = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("1", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        MutableState mutableState3 = (MutableState) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("1", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        MutableState mutableState4 = (MutableState) rememberedValue4;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("pcs", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        startRestartGroup.endReplaceGroup();
                        EntryDialog("Add supply", function0, ComposableLambdaKt.rememberComposableLambda(1053103563, true, new MainActivityKt$AddSupplyDialog$1(function1, mutableState, mutableState2, mutableState3, mutableState4, (MutableState) rememberedValue5), startRestartGroup, 54), startRestartGroup, ((i3 << 3) & 112) | 390);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AddSupplyDialog$lambda$112;
                                AddSupplyDialog$lambda$112 = MainActivityKt.AddSupplyDialog$lambda$112(Function0.this, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                                return AddSupplyDialog$lambda$112;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddSupplyDialog$lambda$98(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddSupplyDialog$lambda$101(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddSupplyDialog$lambda$104(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddSupplyDialog$lambda$107(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddSupplyDialog$lambda$110(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                private static final void AddFixDialog(final Function0<Unit> function0, final Function1<? super FixTask, Unit> function1, Composer composer, final int i) {
                    int i2;
                    Composer startRestartGroup = composer.startRestartGroup(1470547790);
                    ComposerKt.sourceInformation(startRestartGroup, "C(AddFixDialog)746@31809L31,747@31857L31,748@31909L33,749@31958L32,750@32039L520,750@31995L564:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                    }
                    int i3 = i2;
                    if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1470547790, i3, -1, "com.emeraldpulse.kyra.AddFixDialog (MainActivity.kt:745)");
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        MutableState mutableState = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        MutableState mutableState2 = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("30", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        MutableState mutableState3 = (MutableState) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("7", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        startRestartGroup.endReplaceGroup();
                        EntryDialog("Add recurring fix", function0, ComposableLambdaKt.rememberComposableLambda(-1966900207, true, new MainActivityKt$AddFixDialog$1(function1, mutableState, mutableState2, mutableState3, (MutableState) rememberedValue4), startRestartGroup, 54), startRestartGroup, ((i3 << 3) & 112) | 390);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AddFixDialog$lambda$125;
                                AddFixDialog$lambda$125 = MainActivityKt.AddFixDialog$lambda$125(Function0.this, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                                return AddFixDialog$lambda$125;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddFixDialog$lambda$114(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddFixDialog$lambda$117(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddFixDialog$lambda$120(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddFixDialog$lambda$123(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                private static final void AddCostDialog(final Function0<Unit> function0, final Function1<? super CostNote, Unit> function1, Composer composer, final int i) {
                    int i2;
                    Composer startRestartGroup = composer.startRestartGroup(-196921204);
                    ComposerKt.sourceInformation(startRestartGroup, "C(AddCostDialog)763@32671L31,764@32719L31,765@32769L31,766@32817L31,767@32893L573,767@32853L613:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                    }
                    int i3 = i2;
                    if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-196921204, i3, -1, "com.emeraldpulse.kyra.AddCostDialog (MainActivity.kt:762)");
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        MutableState mutableState = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        MutableState mutableState2 = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        MutableState mutableState3 = (MutableState) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MainActivity.kt#9igjgp");
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        startRestartGroup.endReplaceGroup();
                        EntryDialog("Add cost note", function0, ComposableLambdaKt.rememberComposableLambda(616373289, true, new MainActivityKt$AddCostDialog$1(function1, mutableState, mutableState2, mutableState3, (MutableState) rememberedValue4), startRestartGroup, 54), startRestartGroup, ((i3 << 3) & 112) | 390);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AddCostDialog$lambda$138;
                                AddCostDialog$lambda$138 = MainActivityKt.AddCostDialog$lambda$138(Function0.this, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                                return AddCostDialog$lambda$138;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddCostDialog$lambda$127(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddCostDialog$lambda$130(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddCostDialog$lambda$133(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String AddCostDialog$lambda$136(MutableState<String> mutableState) {
                    return mutableState.getValue();
                }

                private static final void EntryDialog(final String str, final Function0<Unit> function0, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
                    int i2;
                    Composer composer2;
                    Composer startRestartGroup = composer.startRestartGroup(180217248);
                    ComposerKt.sourceInformation(startRestartGroup, "C(EntryDialog)P(2,1)786@33894L54,783@33697L46,784@33760L80,781@33630L324:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
                    }
                    if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180217248, i2, -1, "com.emeraldpulse.kyra.EntryDialog (MainActivity.kt:780)");
                        }
                        composer2 = startRestartGroup;
                        AndroidAlertDialog_androidKt.m2473AlertDialogOix01E0(function0, ComposableSingletons$MainActivityKt.INSTANCE.getLambda$1244719592$app_release(), null, ComposableLambdaKt.rememberComposableLambda(2106553194, true, new Function2<Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$EntryDialog$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C786@33896L50:MainActivity.kt#f5odrr");
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2106553194, i3, -1, "com.emeraldpulse.kyra.EntryDialog.<anonymous> (MainActivity.kt:786)");
                                }
                                ButtonKt.TextButton(function0, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableSingletons$MainActivityKt.INSTANCE.m10375getLambda$1656301401$app_release(), composer3, 805306368, 510);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-1326580500, true, new Function2<Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$EntryDialog$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C783@33699L42:MainActivity.kt#f5odrr");
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1326580500, i3, -1, "com.emeraldpulse.kyra.EntryDialog.<anonymous> (MainActivity.kt:783)");
                                }
                                TextKt.m4292TextNvy7gAk(str, null, 0L, null, 0L, null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 1572864, 0, 262078);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-895663699, true, new Function2<Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$EntryDialog$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C784@33762L76:MainActivity.kt#f5odrr");
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-895663699, i3, -1, "com.emeraldpulse.kyra.EntryDialog.<anonymous> (MainActivity.kt:784)");
                                }
                                Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(Dp.m9732constructorimpl(10));
                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m868spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                                int m = PolicyGateKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m5864constructorimpl = Updater.m5864constructorimpl(composer3);
                                Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                                function32.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i2 >> 3) & 14) | 1772592, 0, 16276);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit EntryDialog$lambda$139;
                                EntryDialog$lambda$139 = MainActivityKt.EntryDialog$lambda$139(str, function0, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                                return EntryDialog$lambda$139;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void Field(final String str, final String str2, final Function1<? super String, Unit> function1, Composer composer, final int i) {
                    int i2;
                    Composer composer2;
                    Composer startRestartGroup = composer.startRestartGroup(803647076);
                    ComposerKt.sourceInformation(startRestartGroup, "C(Field)P(!1,2)792@34129L15,792@34057L185:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changed(str2) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
                    }
                    if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(803647076, i2, -1, "com.emeraldpulse.kyra.Field (MainActivity.kt:791)");
                        }
                        int i3 = i2 >> 3;
                        composer2 = startRestartGroup;
                        OutlinedTextFieldKt.OutlinedTextField(str2, function1, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(109577598, true, new Function2<Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.MainActivityKt$Field$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                ComposerKt.sourceInformation(composer3, "C792@34131L11:MainActivity.kt#f5odrr");
                                if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(109577598, i4, -1, "com.emeraldpulse.kyra.Field.<anonymous> (MainActivity.kt:792)");
                                }
                                TextKt.m4292TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262142);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, (Intrinsics.areEqual(str, "Note") || StringsKt.startsWith$default(str, "Checks", false, 2, (Object) null)) ? false : true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer2, (i3 & 14) | 1573248 | (i3 & 112), 0, 0, 8257464);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Field$lambda$140;
                                Field$lambda$140 = MainActivityKt.Field$lambda$140(str, str2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                                return Field$lambda$140;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void SaveButton(final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
                    int i2;
                    Composer composer2;
                    Composer startRestartGroup = composer.startRestartGroup(-1180162736);
                    ComposerKt.sourceInformation(startRestartGroup, "C(SaveButton)797@34395L42,797@34326L177:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
                    }
                    if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1180162736, i2, -1, "com.emeraldpulse.kyra.SaveButton (MainActivity.kt:796)");
                        }
                        composer2 = startRestartGroup;
                        ButtonKt.Button(function0, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z, (Shape) null, ButtonDefaults.INSTANCE.m2589buttonColorsro_MJ88(DeepEmerald, 0L, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$MainActivityKt.INSTANCE.m10374getLambda$1547540640$app_release(), startRestartGroup, ((i2 >> 3) & 14) | 805306416 | ((i2 << 6) & 896), 488);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda18
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SaveButton$lambda$141;
                                SaveButton$lambda$141 = MainActivityKt.SaveButton$lambda$141(z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                                return SaveButton$lambda$141;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final List<RoomChecklist> defaultRooms() {
                    return CollectionsKt.listOf((Object[]) new RoomChecklist[]{new RoomChecklist("kitchen", "Kitchen", "Appliance and water check", CollectionsKt.listOf((Object[]) new RoomCheckItem[]{new RoomCheckItem("Run sink and inspect under-cabinet pipes", false), new RoomCheckItem("Wipe range hood filter edge", false), new RoomCheckItem("Check fridge temperature and door seal", true)})), new RoomChecklist("bath", "Bathroom", "Moisture prevention", CollectionsKt.listOf((Object[]) new RoomCheckItem[]{new RoomCheckItem("Inspect caulk lines around tub", false), new RoomCheckItem("Test fan airflow with tissue", false), new RoomCheckItem("Refill hand soap and paper stock", true)})), new RoomChecklist("entry", "Entry", "Ready for weather", CollectionsKt.listOf((Object[]) new RoomCheckItem[]{new RoomCheckItem("Clear vent and door sweep debris", true), new RoomCheckItem("Check flashlight and spare batteries", false), new RoomCheckItem("Shake mats and inspect threshold", false)})), new RoomChecklist("utility", "Utility room", "Systems glance", CollectionsKt.listOf((Object[]) new RoomCheckItem[]{new RoomCheckItem("Confirm water heater area is dry", false), new RoomCheckItem("Check breaker labels are readable", true), new RoomCheckItem("Inspect HVAC filter date", false)}))});
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final List<Supply> defaultSupplies() {
                    return CollectionsKt.listOf((Object[]) new Supply[]{new Supply("filters", "HVAC filters", "Utility", 1, 2, "pcs"), new Supply("bulbs", "Warm LED bulbs", "General", 5, 3, "pcs"), new Supply("batteries", "AA batteries", "Safety", 4, 4, "pcs"), new Supply("cleaner", "All-purpose cleaner", "Kitchen", 2, 1, "bottles"), new Supply("tape", "Plumber tape", "Repairs", 1, 1, "roll"), new Supply("bags", "Contractor bags", "Garage", 6, 3, "bags")});
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final List<FixTask> defaultFixes() {
                    return CollectionsKt.listOf((Object[]) new FixTask[]{new FixTask("hvac", "Replace HVAC filter", "Utility", 45, 5, "10 min"), new FixTask("detectors", "Test smoke and CO detectors", "Safety", 30, 0, "8 min"), new FixTask("drains", "Flush slow drains", "Bathroom", 30, 9, "15 min"), new FixTask("gutters", "Inspect gutter downspouts", "Exterior", 90, 18, "25 min"), new FixTask("fridge", "Vacuum refrigerator coils", "Kitchen", 180, 24, "20 min")});
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final List<CostNote> defaultCosts() {
                    return CollectionsKt.listOf((Object[]) new CostNote[]{new CostNote("sealant", "Silicone sealant", "Bathroom", 1199, "Bought mildew-resistant tube for tub edge refresh.", "Jul 03"), new CostNote("filterpack", "Filter two-pack", "Utility", 2798, "Next replacement already added to inventory.", "Jul 08")});
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final JSONArray encodeRooms(List<RoomChecklist> list) {
                    List<RoomChecklist> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (RoomChecklist roomChecklist : list2) {
                        JSONObject put = new JSONObject().put("id", roomChecklist.getId()).put("room", roomChecklist.getRoom()).put("focus", roomChecklist.getFocus());
                        List<RoomCheckItem> items = roomChecklist.getItems();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
                        for (RoomCheckItem roomCheckItem : items) {
                            arrayList2.add(new JSONObject().put("label", roomCheckItem.getLabel()).put("done", roomCheckItem.getDone()));
                        }
                        arrayList.add(put.put("items", new JSONArray((Collection) arrayList2)));
                    }
                    return new JSONArray((Collection) arrayList);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final List<RoomChecklist> decodeRooms(String str) {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                        String string = jSONObject.getString("id");
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String string2 = jSONObject.getString("room");
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        String optString = jSONObject.optString("focus");
                        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                        int length2 = jSONArray2.length();
                        ArrayList arrayList2 = new ArrayList(length2);
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                            String string3 = jSONObject2.getString("label");
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            arrayList2.add(new RoomCheckItem(string3, jSONObject2.optBoolean("done")));
                        }
                        arrayList.add(new RoomChecklist(string, string2, optString, arrayList2));
                    }
                    return arrayList;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final JSONArray encodeSupplies(List<Supply> list) {
                    List<Supply> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (Supply supply : list2) {
                        arrayList.add(new JSONObject().put("id", supply.getId()).put(HintConstants.AUTOFILL_HINT_NAME, supply.getName()).put("area", supply.getArea()).put("quantity", supply.getQuantity()).put("minimum", supply.getMinimum()).put("unit", supply.getUnit()));
                    }
                    return new JSONArray((Collection) arrayList);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final List<Supply> decodeSupplies(String str) {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string = jSONObject.getString("id");
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String string2 = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        String string3 = jSONObject.getString("area");
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        int optInt = jSONObject.optInt("quantity");
                        int optInt2 = jSONObject.optInt("minimum", 1);
                        String optString = jSONObject.optString("unit", "pcs");
                        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                        arrayList.add(new Supply(string, string2, string3, optInt, optInt2, optString));
                    }
                    return arrayList;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final JSONArray encodeFixes(List<FixTask> list) {
                    List<FixTask> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (FixTask fixTask : list2) {
                        arrayList.add(new JSONObject().put("id", fixTask.getId()).put("title", fixTask.getTitle()).put("area", fixTask.getArea()).put("interval", fixTask.getIntervalDays()).put("due", fixTask.getDaysUntilDue()).put("effort", fixTask.getEffort()));
                    }
                    return new JSONArray((Collection) arrayList);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final List<FixTask> decodeFixes(String str) {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string = jSONObject.getString("id");
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String string2 = jSONObject.getString("title");
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        String string3 = jSONObject.getString("area");
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        int optInt = jSONObject.optInt("interval", 30);
                        int optInt2 = jSONObject.optInt("due", 7);
                        String optString = jSONObject.optString("effort", "Custom");
                        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                        arrayList.add(new FixTask(string, string2, string3, optInt, optInt2, optString));
                    }
                    return arrayList;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final JSONArray encodeCosts(List<CostNote> list) {
                    List<CostNote> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (CostNote costNote : list2) {
                        arrayList.add(new JSONObject().put("id", costNote.getId()).put("title", costNote.getTitle()).put("area", costNote.getArea()).put("amount", costNote.getAmountCents()).put("note", costNote.getNote()).put("date", costNote.getDate()));
                    }
                    return new JSONArray((Collection) arrayList);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final List<CostNote> decodeCosts(String str) {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string = jSONObject.getString("id");
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String string2 = jSONObject.getString("title");
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        String string3 = jSONObject.getString("area");
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        int optInt = jSONObject.optInt("amount");
                        String optString = jSONObject.optString("note");
                        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                        String optString2 = jSONObject.optString("date");
                        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                        arrayList.add(new CostNote(string, string2, string3, optInt, optString, optString2));
                    }
                    return arrayList;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String money(int i) {
                    String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(i / 100.0f)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return "$" + format;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String today() {
                    String format = new SimpleDateFormat("MMM dd", Locale.US).format(new Date());
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return format;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String readinessMessage(int i) {
                    if (i >= 85) {
                        return "Home systems look steady. Keep the routine light and close the smallest due item.";
                    }
                    if (i >= 65) {
                        return "Good base. A supply restock or one recurring fix will lift the house into a calmer range.";
                    }
                    return "Focus on overdue fixes and low supplies before adding new projects.";
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void EmeraldPulseTheme(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
                    int i2;
                    final Function2<? super Composer, ? super Integer, Unit> function22;
                    Composer startRestartGroup = composer.startRestartGroup(-1640683152);
                    ComposerKt.sourceInformation(startRestartGroup, "C(EmeraldPulseTheme)875@40598L32:MainActivity.kt#f5odrr");
                    if ((i & 6) == 0) {
                        i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1640683152, i2, -1, "com.emeraldpulse.kyra.EmeraldPulseTheme (MainActivity.kt:874)");
                        }
                        function22 = function2;
                        MaterialThemeKt.MaterialTheme(null, null, null, function22, startRestartGroup, (i2 << 9) & 7168, 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function22 = function2;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.emeraldpulse.kyra.MainActivityKt$$ExternalSyntheticLambda33
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit EmeraldPulseTheme$lambda$159;
                                EmeraldPulseTheme$lambda$159 = MainActivityKt.EmeraldPulseTheme$lambda$159(Function2.this, i, (Composer) obj, ((Integer) obj2).intValue());
                                return EmeraldPulseTheme$lambda$159;
                            }
                        });
                    }
                }
            }
