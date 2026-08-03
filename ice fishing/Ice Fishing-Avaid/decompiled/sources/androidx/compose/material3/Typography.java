package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: Typography.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B³\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"Bù\u0002\b\u0016\u0012\u0006\u0010#\u001a\u00020$\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b!\u0010%B½\u0002\b\u0012\u0012\u0006\u0010&\u001a\u00020'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b!\u0010(B\u009f\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b!\u0010)J²\u0002\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u0003J\u009c\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020PH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010+R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010+R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010+R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010+R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010+R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010+R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010+R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010+R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010+¨\u0006Q"}, d2 = {"Landroidx/compose/material3/Typography;", "", "displayLarge", "Landroidx/compose/ui/text/TextStyle;", "displayMedium", "displaySmall", "headlineLarge", "headlineMedium", "headlineSmall", "titleLarge", "titleMedium", "titleSmall", "bodyLarge", "bodyMedium", "bodySmall", "labelLarge", "labelMedium", "labelSmall", "displayLargeEmphasized", "displayMediumEmphasized", "displaySmallEmphasized", "headlineLargeEmphasized", "headlineMediumEmphasized", "headlineSmallEmphasized", "titleLargeEmphasized", "titleMediumEmphasized", "titleSmallEmphasized", "bodyLargeEmphasized", "bodyMediumEmphasized", "bodySmallEmphasized", "labelLargeEmphasized", "labelMediumEmphasized", "labelSmallEmphasized", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "tokens", "Landroidx/compose/material3/tokens/TypographyTokens;", "(Landroidx/compose/material3/tokens/TypographyTokens;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getDisplayLarge", "()Landroidx/compose/ui/text/TextStyle;", "getDisplayMedium", "getDisplaySmall", "getHeadlineLarge", "getHeadlineMedium", "getHeadlineSmall", "getTitleLarge", "getTitleMedium", "getTitleSmall", "getBodyLarge", "getBodyMedium", "getBodySmall", "getLabelLarge", "getLabelMedium", "getLabelSmall", "getDisplayLargeEmphasized", "getDisplayMediumEmphasized", "getDisplaySmallEmphasized", "getHeadlineLargeEmphasized", "getHeadlineMediumEmphasized", "getHeadlineSmallEmphasized", "getTitleLargeEmphasized", "getTitleMediumEmphasized", "getTitleSmallEmphasized", "getBodyLargeEmphasized", "getBodyMediumEmphasized", "getBodySmallEmphasized", "getLabelLargeEmphasized", "getLabelMediumEmphasized", "getLabelSmallEmphasized", "copy", "equals", "", "other", "hashCode", "", "toString", "", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class Typography {
    public static final int $stable = 0;
    private final TextStyle bodyLarge;
    private final TextStyle bodyLargeEmphasized;
    private final TextStyle bodyMedium;
    private final TextStyle bodyMediumEmphasized;
    private final TextStyle bodySmall;
    private final TextStyle bodySmallEmphasized;
    private final TextStyle displayLarge;
    private final TextStyle displayLargeEmphasized;
    private final TextStyle displayMedium;
    private final TextStyle displayMediumEmphasized;
    private final TextStyle displaySmall;
    private final TextStyle displaySmallEmphasized;
    private final TextStyle headlineLarge;
    private final TextStyle headlineLargeEmphasized;
    private final TextStyle headlineMedium;
    private final TextStyle headlineMediumEmphasized;
    private final TextStyle headlineSmall;
    private final TextStyle headlineSmallEmphasized;
    private final TextStyle labelLarge;
    private final TextStyle labelLargeEmphasized;
    private final TextStyle labelMedium;
    private final TextStyle labelMediumEmphasized;
    private final TextStyle labelSmall;
    private final TextStyle labelSmallEmphasized;
    private final TextStyle titleLarge;
    private final TextStyle titleLargeEmphasized;
    private final TextStyle titleMedium;
    private final TextStyle titleMediumEmphasized;
    private final TextStyle titleSmall;
    private final TextStyle titleSmallEmphasized;

    public Typography() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30) {
        this.displayLarge = textStyle;
        this.displayMedium = textStyle2;
        this.displaySmall = textStyle3;
        this.headlineLarge = textStyle4;
        this.headlineMedium = textStyle5;
        this.headlineSmall = textStyle6;
        this.titleLarge = textStyle7;
        this.titleMedium = textStyle8;
        this.titleSmall = textStyle9;
        this.bodyLarge = textStyle10;
        this.bodyMedium = textStyle11;
        this.bodySmall = textStyle12;
        this.labelLarge = textStyle13;
        this.labelMedium = textStyle14;
        this.labelSmall = textStyle15;
        this.displayLargeEmphasized = textStyle16;
        this.displayMediumEmphasized = textStyle17;
        this.displaySmallEmphasized = textStyle18;
        this.headlineLargeEmphasized = textStyle19;
        this.headlineMediumEmphasized = textStyle20;
        this.headlineSmallEmphasized = textStyle21;
        this.titleLargeEmphasized = textStyle22;
        this.titleMediumEmphasized = textStyle23;
        this.titleSmallEmphasized = textStyle24;
        this.bodyLargeEmphasized = textStyle25;
        this.bodyMediumEmphasized = textStyle26;
        this.bodySmallEmphasized = textStyle27;
        this.labelLargeEmphasized = textStyle28;
        this.labelMediumEmphasized = textStyle29;
        this.labelSmallEmphasized = textStyle30;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r62);
        TextStyle textStyle31;
        TextStyle textStyle32;
        TextStyle textStyle33;
        TextStyle textStyle34;
        TextStyle textStyle35;
        TextStyle textStyle36;
        TextStyle textStyle37;
        TextStyle textStyle38;
        TextStyle textStyle39;
        TextStyle textStyle40;
        TextStyle textStyle41;
        TextStyle textStyle42;
        TextStyle textStyle43;
        TextStyle textStyle44;
        TextStyle textStyle45;
        TextStyle textStyle46;
        TextStyle textStyle47;
        TextStyle textStyle48;
        TextStyle textStyle49;
        TextStyle textStyle50;
        TextStyle textStyle51;
        TextStyle textStyle52;
        TextStyle textStyle53;
        TextStyle textStyle54;
        TextStyle textStyle55;
        TextStyle textStyle56;
        TextStyle textStyle57;
        TextStyle textStyle58;
        TextStyle textStyle59;
        TextStyle textStyle60;
        TypographyTokens typographyTokens;
        TypographyTokens typographyTokens2;
        TypographyTokens typographyTokens3;
        TypographyTokens typographyTokens4;
        TypographyTokens typographyTokens5;
        TypographyTokens typographyTokens6;
        TypographyTokens typographyTokens7;
        TypographyTokens typographyTokens8;
        TypographyTokens typographyTokens9;
        TypographyTokens typographyTokens10;
        TypographyTokens typographyTokens11;
        TypographyTokens typographyTokens12;
        TypographyTokens typographyTokens13;
        TypographyTokens typographyTokens14;
        TypographyTokens typographyTokens15;
        TypographyTokens typographyTokens16;
        TypographyTokens typographyTokens17;
        TypographyTokens typographyTokens18;
        TypographyTokens typographyTokens19;
        TypographyTokens typographyTokens20;
        TypographyTokens typographyTokens21;
        TypographyTokens typographyTokens22;
        TypographyTokens typographyTokens23;
        TypographyTokens typographyTokens24;
        TypographyTokens typographyTokens25;
        TypographyTokens typographyTokens26;
        TypographyTokens typographyTokens27;
        TypographyTokens typographyTokens28;
        TypographyTokens typographyTokens29;
        TypographyTokens typographyTokens30;
        if ((i & 1) != 0) {
            typographyTokens30 = TypographyKt.typographyTokens;
            textStyle31 = typographyTokens30.getDisplayLarge();
        } else {
            textStyle31 = textStyle;
        }
        if ((i & 2) != 0) {
            typographyTokens29 = TypographyKt.typographyTokens;
            textStyle32 = typographyTokens29.getDisplayMedium();
        } else {
            textStyle32 = textStyle2;
        }
        if ((i & 4) != 0) {
            typographyTokens28 = TypographyKt.typographyTokens;
            textStyle33 = typographyTokens28.getDisplaySmall();
        } else {
            textStyle33 = textStyle3;
        }
        if ((i & 8) != 0) {
            typographyTokens27 = TypographyKt.typographyTokens;
            textStyle34 = typographyTokens27.getHeadlineLarge();
        } else {
            textStyle34 = textStyle4;
        }
        if ((i & 16) != 0) {
            typographyTokens26 = TypographyKt.typographyTokens;
            textStyle35 = typographyTokens26.getHeadlineMedium();
        } else {
            textStyle35 = textStyle5;
        }
        if ((i & 32) != 0) {
            typographyTokens25 = TypographyKt.typographyTokens;
            textStyle36 = typographyTokens25.getHeadlineSmall();
        } else {
            textStyle36 = textStyle6;
        }
        if ((i & 64) != 0) {
            typographyTokens24 = TypographyKt.typographyTokens;
            textStyle37 = typographyTokens24.getTitleLarge();
        } else {
            textStyle37 = textStyle7;
        }
        if ((i & 128) != 0) {
            typographyTokens23 = TypographyKt.typographyTokens;
            textStyle38 = typographyTokens23.getTitleMedium();
        } else {
            textStyle38 = textStyle8;
        }
        if ((i & 256) != 0) {
            typographyTokens22 = TypographyKt.typographyTokens;
            textStyle39 = typographyTokens22.getTitleSmall();
        } else {
            textStyle39 = textStyle9;
        }
        if ((i & 512) != 0) {
            typographyTokens21 = TypographyKt.typographyTokens;
            textStyle40 = typographyTokens21.getBodyLarge();
        } else {
            textStyle40 = textStyle10;
        }
        if ((i & 1024) != 0) {
            typographyTokens20 = TypographyKt.typographyTokens;
            textStyle41 = typographyTokens20.getBodyMedium();
        } else {
            textStyle41 = textStyle11;
        }
        if ((i & 2048) != 0) {
            typographyTokens19 = TypographyKt.typographyTokens;
            textStyle42 = typographyTokens19.getBodySmall();
        } else {
            textStyle42 = textStyle12;
        }
        if ((i & 4096) != 0) {
            typographyTokens18 = TypographyKt.typographyTokens;
            textStyle43 = typographyTokens18.getLabelLarge();
        } else {
            textStyle43 = textStyle13;
        }
        if ((i & 8192) != 0) {
            typographyTokens17 = TypographyKt.typographyTokens;
            textStyle44 = typographyTokens17.getLabelMedium();
        } else {
            textStyle44 = textStyle14;
        }
        if ((i & 16384) != 0) {
            typographyTokens16 = TypographyKt.typographyTokens;
            textStyle45 = typographyTokens16.getLabelSmall();
        } else {
            textStyle45 = textStyle15;
        }
        if ((i & 32768) != 0) {
            typographyTokens15 = TypographyKt.typographyTokens;
            textStyle46 = typographyTokens15.getDisplayLargeEmphasized();
        } else {
            textStyle46 = textStyle16;
        }
        if ((i & 65536) != 0) {
            typographyTokens14 = TypographyKt.typographyTokens;
            textStyle47 = typographyTokens14.getDisplayMediumEmphasized();
        } else {
            textStyle47 = textStyle17;
        }
        if ((i & 131072) != 0) {
            typographyTokens13 = TypographyKt.typographyTokens;
            textStyle48 = typographyTokens13.getDisplaySmallEmphasized();
        } else {
            textStyle48 = textStyle18;
        }
        if ((i & 262144) != 0) {
            typographyTokens12 = TypographyKt.typographyTokens;
            textStyle49 = typographyTokens12.getHeadlineLargeEmphasized();
        } else {
            textStyle49 = textStyle19;
        }
        if ((i & 524288) != 0) {
            typographyTokens11 = TypographyKt.typographyTokens;
            textStyle50 = typographyTokens11.getHeadlineMediumEmphasized();
        } else {
            textStyle50 = textStyle20;
        }
        if ((i & 1048576) != 0) {
            typographyTokens10 = TypographyKt.typographyTokens;
            textStyle51 = typographyTokens10.getHeadlineSmallEmphasized();
        } else {
            textStyle51 = textStyle21;
        }
        if ((i & 2097152) != 0) {
            typographyTokens9 = TypographyKt.typographyTokens;
            textStyle52 = typographyTokens9.getTitleLargeEmphasized();
        } else {
            textStyle52 = textStyle22;
        }
        if ((i & 4194304) != 0) {
            typographyTokens8 = TypographyKt.typographyTokens;
            textStyle53 = typographyTokens8.getTitleMediumEmphasized();
        } else {
            textStyle53 = textStyle23;
        }
        if ((i & 8388608) != 0) {
            typographyTokens7 = TypographyKt.typographyTokens;
            textStyle54 = typographyTokens7.getTitleSmallEmphasized();
        } else {
            textStyle54 = textStyle24;
        }
        if ((i & 16777216) != 0) {
            typographyTokens6 = TypographyKt.typographyTokens;
            textStyle55 = typographyTokens6.getBodyLargeEmphasized();
        } else {
            textStyle55 = textStyle25;
        }
        if ((i & GroupFlagsKt.HasAuxSlotFlag) != 0) {
            typographyTokens5 = TypographyKt.typographyTokens;
            textStyle56 = typographyTokens5.getBodyMediumEmphasized();
        } else {
            textStyle56 = textStyle26;
        }
        if ((i & 67108864) != 0) {
            typographyTokens4 = TypographyKt.typographyTokens;
            textStyle57 = typographyTokens4.getBodySmallEmphasized();
        } else {
            textStyle57 = textStyle27;
        }
        if ((i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0) {
            typographyTokens3 = TypographyKt.typographyTokens;
            textStyle58 = typographyTokens3.getLabelLargeEmphasized();
        } else {
            textStyle58 = textStyle28;
        }
        if ((i & GroupFlagsKt.IsMovableContentFlag) != 0) {
            typographyTokens2 = TypographyKt.typographyTokens;
            textStyle59 = typographyTokens2.getLabelMediumEmphasized();
        } else {
            textStyle59 = textStyle29;
        }
        if ((i & GroupFlagsKt.HasMovableContentFlag) != 0) {
            typographyTokens = TypographyKt.typographyTokens;
            textStyle60 = typographyTokens.getLabelSmallEmphasized();
        } else {
            textStyle60 = textStyle30;
        }
    }

    public final TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    public final TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    public final TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    public final TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    public final TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    public /* synthetic */ Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily, (i & 2) != 0 ? null : textStyle, (i & 4) != 0 ? null : textStyle2, (i & 8) != 0 ? null : textStyle3, (i & 16) != 0 ? null : textStyle4, (i & 32) != 0 ? null : textStyle5, (i & 64) != 0 ? null : textStyle6, (i & 128) != 0 ? null : textStyle7, (i & 256) != 0 ? null : textStyle8, (i & 512) != 0 ? null : textStyle9, (i & 1024) != 0 ? null : textStyle10, (i & 2048) != 0 ? null : textStyle11, (i & 4096) != 0 ? null : textStyle12, (i & 8192) != 0 ? null : textStyle13, (i & 16384) != 0 ? null : textStyle14, (i & 32768) != 0 ? null : textStyle15, (i & 65536) != 0 ? null : textStyle16, (i & 131072) != 0 ? null : textStyle17, (i & 262144) != 0 ? null : textStyle18, (i & 524288) != 0 ? null : textStyle19, (i & 1048576) != 0 ? null : textStyle20, (i & 2097152) != 0 ? null : textStyle21, (i & 4194304) != 0 ? null : textStyle22, (i & 8388608) != 0 ? null : textStyle23, (i & 16777216) != 0 ? null : textStyle24, (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? null : textStyle25, (i & 67108864) != 0 ? null : textStyle26, (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? null : textStyle27, (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? null : textStyle28, (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? null : textStyle29, (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? null : textStyle30);
    }

    public Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30) {
        this(new TypographyTokens(fontFamily), textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26, textStyle27, textStyle28, textStyle29, textStyle30);
    }

    private Typography(TypographyTokens typographyTokens, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30) {
        this(textStyle == null ? typographyTokens.getDisplayLarge() : textStyle, textStyle2 == null ? typographyTokens.getDisplayMedium() : textStyle2, textStyle3 == null ? typographyTokens.getDisplaySmall() : textStyle3, textStyle4 == null ? typographyTokens.getHeadlineLarge() : textStyle4, textStyle5 == null ? typographyTokens.getHeadlineMedium() : textStyle5, textStyle6 == null ? typographyTokens.getHeadlineSmall() : textStyle6, textStyle7 == null ? typographyTokens.getTitleLarge() : textStyle7, textStyle8 == null ? typographyTokens.getTitleMedium() : textStyle8, textStyle9 == null ? typographyTokens.getTitleSmall() : textStyle9, textStyle10 == null ? typographyTokens.getBodyLarge() : textStyle10, textStyle11 == null ? typographyTokens.getBodyMedium() : textStyle11, textStyle12 == null ? typographyTokens.getBodySmall() : textStyle12, textStyle13 == null ? typographyTokens.getLabelLarge() : textStyle13, textStyle14 == null ? typographyTokens.getLabelMedium() : textStyle14, textStyle15 == null ? typographyTokens.getLabelSmall() : textStyle15, textStyle16 == null ? typographyTokens.getDisplayLargeEmphasized() : textStyle16, textStyle17 == null ? typographyTokens.getDisplayMediumEmphasized() : textStyle17, textStyle18 == null ? typographyTokens.getDisplaySmallEmphasized() : textStyle18, textStyle19 == null ? typographyTokens.getHeadlineLargeEmphasized() : textStyle19, textStyle20 == null ? typographyTokens.getHeadlineMediumEmphasized() : textStyle20, textStyle21 == null ? typographyTokens.getHeadlineSmallEmphasized() : textStyle21, textStyle22 == null ? typographyTokens.getTitleLargeEmphasized() : textStyle22, textStyle23 == null ? typographyTokens.getTitleMediumEmphasized() : textStyle23, textStyle24 == null ? typographyTokens.getTitleSmallEmphasized() : textStyle24, textStyle25 == null ? typographyTokens.getBodyLargeEmphasized() : textStyle25, textStyle26 == null ? typographyTokens.getBodyMediumEmphasized() : textStyle26, textStyle27 == null ? typographyTokens.getBodySmallEmphasized() : textStyle27, textStyle28 == null ? typographyTokens.getLabelLargeEmphasized() : textStyle28, textStyle29 == null ? typographyTokens.getLabelMediumEmphasized() : textStyle29, textStyle30 == null ? typographyTokens.getLabelSmallEmphasized() : textStyle30);
    }

    public final TextStyle getDisplayLargeEmphasized() {
        return this.displayLargeEmphasized;
    }

    public final TextStyle getDisplayMediumEmphasized() {
        return this.displayMediumEmphasized;
    }

    public final TextStyle getDisplaySmallEmphasized() {
        return this.displaySmallEmphasized;
    }

    public final TextStyle getHeadlineLargeEmphasized() {
        return this.headlineLargeEmphasized;
    }

    public final TextStyle getHeadlineMediumEmphasized() {
        return this.headlineMediumEmphasized;
    }

    public final TextStyle getHeadlineSmallEmphasized() {
        return this.headlineSmallEmphasized;
    }

    public final TextStyle getTitleLargeEmphasized() {
        return this.titleLargeEmphasized;
    }

    public final TextStyle getTitleMediumEmphasized() {
        return this.titleMediumEmphasized;
    }

    public final TextStyle getTitleSmallEmphasized() {
        return this.titleSmallEmphasized;
    }

    public final TextStyle getBodyLargeEmphasized() {
        return this.bodyLargeEmphasized;
    }

    public final TextStyle getBodyMediumEmphasized() {
        return this.bodyMediumEmphasized;
    }

    public final TextStyle getBodySmallEmphasized() {
        return this.bodySmallEmphasized;
    }

    public final TextStyle getLabelLargeEmphasized() {
        return this.labelLargeEmphasized;
    }

    public final TextStyle getLabelMediumEmphasized() {
        return this.labelMediumEmphasized;
    }

    public final TextStyle getLabelSmallEmphasized() {
        return this.labelSmallEmphasized;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r31);
        TextStyle textStyle16;
        TextStyle textStyle17;
        TextStyle textStyle18;
        TextStyle textStyle19;
        TextStyle textStyle20;
        TextStyle textStyle21;
        TextStyle textStyle22;
        TextStyle textStyle23;
        TextStyle textStyle24;
        TextStyle textStyle25;
        TextStyle textStyle26;
        TextStyle textStyle27;
        TextStyle textStyle28;
        TextStyle textStyle29;
        TextStyle textStyle30;
        TypographyTokens typographyTokens;
        TypographyTokens typographyTokens2;
        TypographyTokens typographyTokens3;
        TypographyTokens typographyTokens4;
        TypographyTokens typographyTokens5;
        TypographyTokens typographyTokens6;
        TypographyTokens typographyTokens7;
        TypographyTokens typographyTokens8;
        TypographyTokens typographyTokens9;
        TypographyTokens typographyTokens10;
        TypographyTokens typographyTokens11;
        TypographyTokens typographyTokens12;
        TypographyTokens typographyTokens13;
        TypographyTokens typographyTokens14;
        TypographyTokens typographyTokens15;
        if ((i & 1) != 0) {
            typographyTokens15 = TypographyKt.typographyTokens;
            textStyle16 = typographyTokens15.getDisplayLarge();
        } else {
            textStyle16 = textStyle;
        }
        if ((i & 2) != 0) {
            typographyTokens14 = TypographyKt.typographyTokens;
            textStyle17 = typographyTokens14.getDisplayMedium();
        } else {
            textStyle17 = textStyle2;
        }
        if ((i & 4) != 0) {
            typographyTokens13 = TypographyKt.typographyTokens;
            textStyle18 = typographyTokens13.getDisplaySmall();
        } else {
            textStyle18 = textStyle3;
        }
        if ((i & 8) != 0) {
            typographyTokens12 = TypographyKt.typographyTokens;
            textStyle19 = typographyTokens12.getHeadlineLarge();
        } else {
            textStyle19 = textStyle4;
        }
        if ((i & 16) != 0) {
            typographyTokens11 = TypographyKt.typographyTokens;
            textStyle20 = typographyTokens11.getHeadlineMedium();
        } else {
            textStyle20 = textStyle5;
        }
        if ((i & 32) != 0) {
            typographyTokens10 = TypographyKt.typographyTokens;
            textStyle21 = typographyTokens10.getHeadlineSmall();
        } else {
            textStyle21 = textStyle6;
        }
        if ((i & 64) != 0) {
            typographyTokens9 = TypographyKt.typographyTokens;
            textStyle22 = typographyTokens9.getTitleLarge();
        } else {
            textStyle22 = textStyle7;
        }
        if ((i & 128) != 0) {
            typographyTokens8 = TypographyKt.typographyTokens;
            textStyle23 = typographyTokens8.getTitleMedium();
        } else {
            textStyle23 = textStyle8;
        }
        if ((i & 256) != 0) {
            typographyTokens7 = TypographyKt.typographyTokens;
            textStyle24 = typographyTokens7.getTitleSmall();
        } else {
            textStyle24 = textStyle9;
        }
        if ((i & 512) != 0) {
            typographyTokens6 = TypographyKt.typographyTokens;
            textStyle25 = typographyTokens6.getBodyLarge();
        } else {
            textStyle25 = textStyle10;
        }
        if ((i & 1024) != 0) {
            typographyTokens5 = TypographyKt.typographyTokens;
            textStyle26 = typographyTokens5.getBodyMedium();
        } else {
            textStyle26 = textStyle11;
        }
        if ((i & 2048) != 0) {
            typographyTokens4 = TypographyKt.typographyTokens;
            textStyle27 = typographyTokens4.getBodySmall();
        } else {
            textStyle27 = textStyle12;
        }
        if ((i & 4096) != 0) {
            typographyTokens3 = TypographyKt.typographyTokens;
            textStyle28 = typographyTokens3.getLabelLarge();
        } else {
            textStyle28 = textStyle13;
        }
        if ((i & 8192) != 0) {
            typographyTokens2 = TypographyKt.typographyTokens;
            textStyle29 = typographyTokens2.getLabelMedium();
        } else {
            textStyle29 = textStyle14;
        }
        if ((i & 16384) != 0) {
            typographyTokens = TypographyKt.typographyTokens;
            textStyle30 = typographyTokens.getLabelSmall();
        } else {
            textStyle30 = textStyle15;
        }
    }

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15) {
        this(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15, textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15);
    }

    public static /* synthetic */ Typography copy$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30, int i, Object obj) {
        TextStyle textStyle31;
        TextStyle textStyle32;
        TextStyle textStyle33 = (i & 1) != 0 ? typography.displayLarge : textStyle;
        TextStyle textStyle34 = (i & 2) != 0 ? typography.displayMedium : textStyle2;
        TextStyle textStyle35 = (i & 4) != 0 ? typography.displaySmall : textStyle3;
        TextStyle textStyle36 = (i & 8) != 0 ? typography.headlineLarge : textStyle4;
        TextStyle textStyle37 = (i & 16) != 0 ? typography.headlineMedium : textStyle5;
        TextStyle textStyle38 = (i & 32) != 0 ? typography.headlineSmall : textStyle6;
        TextStyle textStyle39 = (i & 64) != 0 ? typography.titleLarge : textStyle7;
        TextStyle textStyle40 = (i & 128) != 0 ? typography.titleMedium : textStyle8;
        TextStyle textStyle41 = (i & 256) != 0 ? typography.titleSmall : textStyle9;
        TextStyle textStyle42 = (i & 512) != 0 ? typography.bodyLarge : textStyle10;
        TextStyle textStyle43 = (i & 1024) != 0 ? typography.bodyMedium : textStyle11;
        TextStyle textStyle44 = (i & 2048) != 0 ? typography.bodySmall : textStyle12;
        TextStyle textStyle45 = (i & 4096) != 0 ? typography.labelLarge : textStyle13;
        TextStyle textStyle46 = (i & 8192) != 0 ? typography.labelMedium : textStyle14;
        TextStyle textStyle47 = textStyle33;
        TextStyle textStyle48 = (i & 16384) != 0 ? typography.labelSmall : textStyle15;
        TextStyle textStyle49 = (i & 32768) != 0 ? typography.displayLargeEmphasized : textStyle16;
        TextStyle textStyle50 = (i & 65536) != 0 ? typography.displayMediumEmphasized : textStyle17;
        TextStyle textStyle51 = (i & 131072) != 0 ? typography.displaySmallEmphasized : textStyle18;
        TextStyle textStyle52 = (i & 262144) != 0 ? typography.headlineLargeEmphasized : textStyle19;
        TextStyle textStyle53 = (i & 524288) != 0 ? typography.headlineMediumEmphasized : textStyle20;
        TextStyle textStyle54 = (i & 1048576) != 0 ? typography.headlineSmallEmphasized : textStyle21;
        TextStyle textStyle55 = (i & 2097152) != 0 ? typography.titleLargeEmphasized : textStyle22;
        TextStyle textStyle56 = (i & 4194304) != 0 ? typography.titleMediumEmphasized : textStyle23;
        TextStyle textStyle57 = (i & 8388608) != 0 ? typography.titleSmallEmphasized : textStyle24;
        TextStyle textStyle58 = (i & 16777216) != 0 ? typography.bodyLargeEmphasized : textStyle25;
        TextStyle textStyle59 = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? typography.bodyMediumEmphasized : textStyle26;
        TextStyle textStyle60 = (i & 67108864) != 0 ? typography.bodySmallEmphasized : textStyle27;
        TextStyle textStyle61 = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? typography.labelLargeEmphasized : textStyle28;
        TextStyle textStyle62 = (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? typography.labelMediumEmphasized : textStyle29;
        if ((i & GroupFlagsKt.HasMovableContentFlag) != 0) {
            textStyle32 = textStyle62;
            textStyle31 = typography.labelSmallEmphasized;
        } else {
            textStyle31 = textStyle30;
            textStyle32 = textStyle62;
        }
        return typography.copy(textStyle47, textStyle34, textStyle35, textStyle36, textStyle37, textStyle38, textStyle39, textStyle40, textStyle41, textStyle42, textStyle43, textStyle44, textStyle45, textStyle46, textStyle48, textStyle49, textStyle50, textStyle51, textStyle52, textStyle53, textStyle54, textStyle55, textStyle56, textStyle57, textStyle58, textStyle59, textStyle60, textStyle61, textStyle32, textStyle31);
    }

    public final Typography copy(TextStyle displayLarge, TextStyle displayMedium, TextStyle displaySmall, TextStyle headlineLarge, TextStyle headlineMedium, TextStyle headlineSmall, TextStyle titleLarge, TextStyle titleMedium, TextStyle titleSmall, TextStyle bodyLarge, TextStyle bodyMedium, TextStyle bodySmall, TextStyle labelLarge, TextStyle labelMedium, TextStyle labelSmall, TextStyle displayLargeEmphasized, TextStyle displayMediumEmphasized, TextStyle displaySmallEmphasized, TextStyle headlineLargeEmphasized, TextStyle headlineMediumEmphasized, TextStyle headlineSmallEmphasized, TextStyle titleLargeEmphasized, TextStyle titleMediumEmphasized, TextStyle titleSmallEmphasized, TextStyle bodyLargeEmphasized, TextStyle bodyMediumEmphasized, TextStyle bodySmallEmphasized, TextStyle labelLargeEmphasized, TextStyle labelMediumEmphasized, TextStyle labelSmallEmphasized) {
        return new Typography(displayLarge, displayMedium, displaySmall, headlineLarge, headlineMedium, headlineSmall, titleLarge, titleMedium, titleSmall, bodyLarge, bodyMedium, bodySmall, labelLarge, labelMedium, labelSmall, displayLargeEmphasized, displayMediumEmphasized, displaySmallEmphasized, headlineLargeEmphasized, headlineMediumEmphasized, headlineSmallEmphasized, titleLargeEmphasized, titleMediumEmphasized, titleSmallEmphasized, bodyLargeEmphasized, bodyMediumEmphasized, bodySmallEmphasized, labelLargeEmphasized, labelMediumEmphasized, labelSmallEmphasized);
    }

    public final Typography copy(TextStyle displayLarge, TextStyle displayMedium, TextStyle displaySmall, TextStyle headlineLarge, TextStyle headlineMedium, TextStyle headlineSmall, TextStyle titleLarge, TextStyle titleMedium, TextStyle titleSmall, TextStyle bodyLarge, TextStyle bodyMedium, TextStyle bodySmall, TextStyle labelLarge, TextStyle labelMedium, TextStyle labelSmall) {
        return copy(displayLarge, displayMedium, displaySmall, headlineLarge, headlineMedium, headlineSmall, titleLarge, titleMedium, titleSmall, bodyLarge, bodyMedium, bodySmall, labelLarge, labelMedium, labelSmall, this.displayLargeEmphasized, this.displayMediumEmphasized, this.displaySmallEmphasized, this.headlineLargeEmphasized, this.headlineMediumEmphasized, this.headlineSmallEmphasized, this.titleLargeEmphasized, this.titleMediumEmphasized, this.titleSmallEmphasized, this.bodyLargeEmphasized, this.bodyMediumEmphasized, this.bodySmallEmphasized, this.labelLargeEmphasized, this.labelMediumEmphasized, this.labelSmallEmphasized);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return Intrinsics.areEqual(this.displayLarge, typography.displayLarge) && Intrinsics.areEqual(this.displayMedium, typography.displayMedium) && Intrinsics.areEqual(this.displaySmall, typography.displaySmall) && Intrinsics.areEqual(this.headlineLarge, typography.headlineLarge) && Intrinsics.areEqual(this.headlineMedium, typography.headlineMedium) && Intrinsics.areEqual(this.headlineSmall, typography.headlineSmall) && Intrinsics.areEqual(this.titleLarge, typography.titleLarge) && Intrinsics.areEqual(this.titleMedium, typography.titleMedium) && Intrinsics.areEqual(this.titleSmall, typography.titleSmall) && Intrinsics.areEqual(this.bodyLarge, typography.bodyLarge) && Intrinsics.areEqual(this.bodyMedium, typography.bodyMedium) && Intrinsics.areEqual(this.bodySmall, typography.bodySmall) && Intrinsics.areEqual(this.labelLarge, typography.labelLarge) && Intrinsics.areEqual(this.labelMedium, typography.labelMedium) && Intrinsics.areEqual(this.labelSmall, typography.labelSmall) && Intrinsics.areEqual(this.displayLargeEmphasized, typography.displayLargeEmphasized) && Intrinsics.areEqual(this.displayMediumEmphasized, typography.displayMediumEmphasized) && Intrinsics.areEqual(this.displaySmallEmphasized, typography.displaySmallEmphasized) && Intrinsics.areEqual(this.headlineLargeEmphasized, typography.headlineLargeEmphasized) && Intrinsics.areEqual(this.headlineMediumEmphasized, typography.headlineMediumEmphasized) && Intrinsics.areEqual(this.headlineSmallEmphasized, typography.headlineSmallEmphasized) && Intrinsics.areEqual(this.titleLargeEmphasized, typography.titleLargeEmphasized) && Intrinsics.areEqual(this.titleMediumEmphasized, typography.titleMediumEmphasized) && Intrinsics.areEqual(this.titleSmallEmphasized, typography.titleSmallEmphasized) && Intrinsics.areEqual(this.bodyLargeEmphasized, typography.bodyLargeEmphasized) && Intrinsics.areEqual(this.bodyMediumEmphasized, typography.bodyMediumEmphasized) && Intrinsics.areEqual(this.bodySmallEmphasized, typography.bodySmallEmphasized) && Intrinsics.areEqual(this.labelLargeEmphasized, typography.labelLargeEmphasized) && Intrinsics.areEqual(this.labelMediumEmphasized, typography.labelMediumEmphasized) && Intrinsics.areEqual(this.labelSmallEmphasized, typography.labelSmallEmphasized);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.displayLarge.hashCode() * 31) + this.displayMedium.hashCode()) * 31) + this.displaySmall.hashCode()) * 31) + this.headlineLarge.hashCode()) * 31) + this.headlineMedium.hashCode()) * 31) + this.headlineSmall.hashCode()) * 31) + this.titleLarge.hashCode()) * 31) + this.titleMedium.hashCode()) * 31) + this.titleSmall.hashCode()) * 31) + this.bodyLarge.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode()) * 31) + this.displayLargeEmphasized.hashCode()) * 31) + this.displayMediumEmphasized.hashCode()) * 31) + this.displaySmallEmphasized.hashCode()) * 31) + this.headlineLargeEmphasized.hashCode()) * 31) + this.headlineMediumEmphasized.hashCode()) * 31) + this.headlineSmallEmphasized.hashCode()) * 31) + this.titleLargeEmphasized.hashCode()) * 31) + this.titleMediumEmphasized.hashCode()) * 31) + this.titleSmallEmphasized.hashCode()) * 31) + this.bodyLargeEmphasized.hashCode()) * 31) + this.bodyMediumEmphasized.hashCode()) * 31) + this.bodySmallEmphasized.hashCode()) * 31) + this.labelLargeEmphasized.hashCode()) * 31) + this.labelMediumEmphasized.hashCode()) * 31) + this.labelSmallEmphasized.hashCode();
    }

    public String toString() {
        return "Typography(displayLarge=" + this.displayLarge + ", displayMedium=" + this.displayMedium + ",displaySmall=" + this.displaySmall + ", headlineLarge=" + this.headlineLarge + ", headlineMedium=" + this.headlineMedium + ", headlineSmall=" + this.headlineSmall + ", titleLarge=" + this.titleLarge + ", titleMedium=" + this.titleMedium + ", titleSmall=" + this.titleSmall + ", bodyLarge=" + this.bodyLarge + ", bodyMedium=" + this.bodyMedium + ", bodySmall=" + this.bodySmall + ", labelLarge=" + this.labelLarge + ", labelMedium=" + this.labelMedium + ", labelSmall=" + this.labelSmall + ", displayLargeEmphasized=" + this.displayLargeEmphasized + ", displayMediumEmphasized=" + this.displayMediumEmphasized + ", displaySmallEmphasized=" + this.displaySmallEmphasized + ", headlineLargeEmphasized=" + this.headlineLargeEmphasized + ", headlineMediumEmphasized=" + this.headlineMediumEmphasized + ", headlineSmallEmphasized=" + this.headlineSmallEmphasized + ", titleLargeEmphasized=" + this.titleLargeEmphasized + ", titleMediumEmphasized=" + this.titleMediumEmphasized + ", titleSmallEmphasized=" + this.titleSmallEmphasized + ", bodyLargeEmphasized=" + this.bodyLargeEmphasized + ", bodyMediumEmphasized=" + this.bodyMediumEmphasized + ", bodySmallEmphasized=" + this.bodySmallEmphasized + ", labelLargeEmphasized=" + this.labelLargeEmphasized + ", labelMediumEmphasized=" + this.labelMediumEmphasized + ", labelSmallEmphasized=" + this.labelSmallEmphasized + ')';
    }
}
