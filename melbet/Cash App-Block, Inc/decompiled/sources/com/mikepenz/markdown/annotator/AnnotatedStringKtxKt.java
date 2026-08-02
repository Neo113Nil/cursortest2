package com.mikepenz.markdown.annotator;

import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.mikepenz.markdown.model.DefaultMarkdownAnnotator;
import com.mikepenz.markdown.model.ReferenceLinkHandlerImpl;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.activity.InvestingActivityHistoryViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import net.idrnd.face.iad.capture.internal.s2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.MarkdownTokenTypes$Companion$WHITE_SPACE$1;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.ast.ASTUtilKt;
import org.intellij.markdown.ast.CompositeASTNode;
import org.intellij.markdown.flavours.gfm.GFMElementTypes;
import org.intellij.markdown.flavours.gfm.GFMTokenTypes;

/* loaded from: classes9.dex */
public abstract class AnnotatedStringKtxKt {
    public static final void InvestingActivityHistory(RealImageLoader realImageLoader, InvestingActivityHistoryViewModel investingActivityHistoryViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        investingActivityHistoryViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-751528426);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(investingActivityHistoryViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (!(investingActivityHistoryViewModel instanceof InvestingActivityHistoryViewModel.Content)) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(realImageLoader, investingActivityHistoryViewModel, function1, i);
                    return;
                }
                return;
            }
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(1914026710, new SkipPaymentView$$ExternalSyntheticLambda1(investingActivityHistoryViewModel, function1), gapComposer), gapComposer, 56);
            modifier = Modifier.Companion.$$INSTANCE;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new MusicViewKt$$ExternalSyntheticLambda2(i, 16, realImageLoader, investingActivityHistoryViewModel, function1, modifier2, false);
        }
    }

    public static final void appendAutoLink(AnnotatedString.Builder builder, String str, ASTNodeImpl aSTNodeImpl, JWECryptoParts jWECryptoParts) {
        Object obj;
        str.getClass();
        jWECryptoParts.getClass();
        Iterator it = aSTNodeImpl.getChildren().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((ASTNodeImpl) obj).f1630type.name, MarkdownTokenTypes.AUTOLINK$1.name)) {
                    break;
                }
            }
        }
        ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) obj;
        if (aSTNodeImpl2 != null) {
            aSTNodeImpl = aSTNodeImpl2;
        }
        String unescapedTextInNode = s2.getUnescapedTextInNode(aSTNodeImpl, str);
        ReferenceLinkHandlerImpl referenceLinkHandlerImpl = (ReferenceLinkHandlerImpl) jWECryptoParts.cipherText;
        if (referenceLinkHandlerImpl != null) {
            referenceLinkHandlerImpl.store(unescapedTextInNode, unescapedTextInNode);
        }
        int pushLink = builder.pushLink(new LinkAnnotation.Url(unescapedTextInNode, (TextLinkStyles) jWECryptoParts.header, (LinkInteractionListener) jWECryptoParts.authenticationTag));
        try {
            builder.append(unescapedTextInNode);
        } finally {
            builder.pop(pushLink);
        }
    }

    public static final void appendMarkdownReference(AnnotatedString.Builder builder, String str, ASTNodeImpl aSTNodeImpl, JWECryptoParts jWECryptoParts) {
        List children;
        List innerList;
        List children2;
        MarkdownElementType markdownElementType = MarkdownTokenTypes.LINK_TEXT;
        str.getClass();
        jWECryptoParts.getClass();
        boolean areEqual = Intrinsics.areEqual(aSTNodeImpl.f1630type, MarkdownTokenTypes.FULL_REFERENCE_LINK);
        ASTNodeImpl findChildOfType = ASTUtilKt.findChildOfType(aSTNodeImpl, MarkdownTokenTypes.LINK_LABEL);
        String str2 = null;
        if (areEqual) {
            ASTNodeImpl findChildOfType2 = ASTUtilKt.findChildOfType(aSTNodeImpl, markdownElementType);
            if (findChildOfType2 != null && (children2 = findChildOfType2.getChildren()) != null) {
                innerList = s2.innerList(children2);
            }
            innerList = null;
        } else {
            if (findChildOfType != null && (children = findChildOfType.getChildren()) != null) {
                innerList = s2.innerList(children);
            }
            innerList = null;
        }
        if (innerList == null || findChildOfType == null) {
            builder.append(s2.getUnescapedTextInNode(aSTNodeImpl, str));
            return;
        }
        String unescapedTextInNode = s2.getUnescapedTextInNode(findChildOfType, str);
        ReferenceLinkHandlerImpl referenceLinkHandlerImpl = (ReferenceLinkHandlerImpl) jWECryptoParts.cipherText;
        if (referenceLinkHandlerImpl != null) {
            unescapedTextInNode.getClass();
            LinkedHashMap linkedHashMap = referenceLinkHandlerImpl.stored;
            String lowerCase = unescapedTextInNode.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String str3 = (String) linkedHashMap.get(lowerCase);
            if (str3 == null) {
                str3 = "";
            }
            if (str3.length() > 0) {
                str2 = str3;
            }
        }
        if (str2 != null) {
            int pushLink = builder.pushLink(new LinkAnnotation.Url(str2, (TextLinkStyles) jWECryptoParts.header, (LinkInteractionListener) jWECryptoParts.authenticationTag));
            try {
                buildMarkdownAnnotatedString(builder, str, s2.mapAutoLinkToType(innerList, MarkdownTokenTypes.TEXT), jWECryptoParts);
                return;
            } finally {
                builder.pop(pushLink);
            }
        }
        ASTNodeImpl findChildOfType3 = ASTUtilKt.findChildOfType(aSTNodeImpl, markdownElementType);
        if (findChildOfType3 != null) {
            buildMarkdownAnnotatedString(builder, str, findChildOfType3, jWECryptoParts);
        }
        buildMarkdownAnnotatedString(builder, str, findChildOfType, jWECryptoParts);
    }

    public static final void buildMarkdownAnnotatedString(AnnotatedString.Builder builder, String str, List list, JWECryptoParts jWECryptoParts) {
        Iterator it;
        ReferenceLinkHandlerImpl referenceLinkHandlerImpl;
        List children;
        MarkdownElementType markdownElementType = MarkdownTokenTypes.EOL;
        MarkdownElementType markdownElementType2 = MarkdownTokenTypes.TEXT;
        MarkdownElementType markdownElementType3 = MarkdownTokenTypes.LINK_TEXT;
        MarkdownElementType markdownElementType4 = MarkdownTokenTypes.LINK_DESTINATION;
        str.getClass();
        list.getClass();
        jWECryptoParts.getClass();
        ((DefaultMarkdownAnnotator) jWECryptoParts.iv).getClass();
        Iterator it2 = list.iterator();
        MarkdownElementType markdownElementType5 = null;
        while (it2.hasNext()) {
            ASTNodeImpl aSTNodeImpl = (ASTNodeImpl) it2.next();
            if (markdownElementType5 == null || !markdownElementType5.equals(aSTNodeImpl.f1630type)) {
                CompositeASTNode compositeASTNode = aSTNodeImpl.parent;
                MarkdownElementType markdownElementType6 = aSTNodeImpl.f1630type;
                MarkdownElementType markdownElementType7 = compositeASTNode != null ? compositeASTNode.f1630type : null;
                if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.PARAGRAPH)) {
                    buildMarkdownAnnotatedString(builder, str, aSTNodeImpl, jWECryptoParts);
                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.IMAGE)) {
                    ASTNodeImpl findChildOfTypeRecursive = s2.findChildOfTypeRecursive(aSTNodeImpl, markdownElementType4);
                    if (findChildOfTypeRecursive != null) {
                        String unescapedTextInNode = s2.getUnescapedTextInNode(findChildOfTypeRecursive, str);
                        KeyMappingKt.appendInlineContent(builder, "MARKDOWN_IMAGE_URL_" + unescapedTextInNode, unescapedTextInNode);
                    }
                } else {
                    MarkdownElementType markdownElementType8 = MarkdownTokenTypes.EMPH$1;
                    if (Intrinsics.areEqual(markdownElementType6, markdownElementType8)) {
                        builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, new FontStyle(1), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65527));
                        buildMarkdownAnnotatedString(builder, str, aSTNodeImpl, jWECryptoParts);
                        builder.pop();
                    } else {
                        MarkdownElementType markdownElementType9 = MarkdownTokenTypes.STRONG;
                        if (Intrinsics.areEqual(markdownElementType6, markdownElementType9)) {
                            builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.Bold, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531));
                            buildMarkdownAnnotatedString(builder, str, aSTNodeImpl, jWECryptoParts);
                            builder.pop();
                        } else {
                            MarkdownElementType markdownElementType10 = GFMElementTypes.STRIKETHROUGH;
                            if (Intrinsics.areEqual(markdownElementType6, markdownElementType10)) {
                                builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.LineThrough, (Shadow) null, 61439));
                                buildMarkdownAnnotatedString(builder, str, aSTNodeImpl, jWECryptoParts);
                                builder.pop();
                            } else {
                                it = it2;
                                if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.CODE_SPAN)) {
                                    builder.pushStyle((SpanStyle) jWECryptoParts.encryptedKey);
                                    builder.append(' ');
                                    buildMarkdownAnnotatedString(builder, str, s2.innerList(aSTNodeImpl.getChildren()), jWECryptoParts);
                                    builder.append(' ');
                                    builder.pop();
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.AUTOLINK$1)) {
                                    appendAutoLink(builder, str, aSTNodeImpl, jWECryptoParts);
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.INLINE_LINK)) {
                                    ASTNodeImpl findChildOfType = ASTUtilKt.findChildOfType(aSTNodeImpl, markdownElementType3);
                                    List innerList = (findChildOfType == null || (children = findChildOfType.getChildren()) == null) ? null : s2.innerList(children);
                                    if (innerList == null) {
                                        builder.append(s2.getUnescapedTextInNode(aSTNodeImpl, str));
                                    } else {
                                        ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) CollectionsKt.firstOrNull(innerList);
                                        String unescapedTextInNode2 = aSTNodeImpl2 != null ? s2.getUnescapedTextInNode(aSTNodeImpl2, str) : null;
                                        ASTNodeImpl findChildOfType2 = ASTUtilKt.findChildOfType(aSTNodeImpl, markdownElementType4);
                                        String unescapedTextInNode3 = findChildOfType2 != null ? s2.getUnescapedTextInNode(findChildOfType2, str) : null;
                                        ASTNodeImpl findChildOfType3 = ASTUtilKt.findChildOfType(aSTNodeImpl, MarkdownTokenTypes.LINK_LABEL);
                                        String unescapedTextInNode4 = findChildOfType3 != null ? s2.getUnescapedTextInNode(findChildOfType3, str) : null;
                                        if (unescapedTextInNode3 == null) {
                                            unescapedTextInNode3 = unescapedTextInNode4;
                                        }
                                        if (unescapedTextInNode3 != null) {
                                            if (unescapedTextInNode2 != null && (referenceLinkHandlerImpl = (ReferenceLinkHandlerImpl) jWECryptoParts.cipherText) != null) {
                                                referenceLinkHandlerImpl.store(unescapedTextInNode2, unescapedTextInNode3);
                                            }
                                            int pushLink = builder.pushLink(new LinkAnnotation.Url(unescapedTextInNode3, (TextLinkStyles) jWECryptoParts.header, (LinkInteractionListener) jWECryptoParts.authenticationTag));
                                            try {
                                                buildMarkdownAnnotatedString(builder, str, s2.mapAutoLinkToType(innerList, markdownElementType2), jWECryptoParts);
                                            } finally {
                                                builder.pop(pushLink);
                                            }
                                        } else {
                                            buildMarkdownAnnotatedString(builder, str, innerList, jWECryptoParts);
                                        }
                                    }
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.SHORT_REFERENCE_LINK)) {
                                    appendMarkdownReference(builder, str, aSTNodeImpl, jWECryptoParts);
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.FULL_REFERENCE_LINK)) {
                                    appendMarkdownReference(builder, str, aSTNodeImpl, jWECryptoParts);
                                } else if (Intrinsics.areEqual(markdownElementType6, markdownElementType2)) {
                                    builder.append(s2.getUnescapedTextInNode(aSTNodeImpl, str));
                                } else if (Intrinsics.areEqual(markdownElementType6, GFMTokenTypes.GFM_AUTOLINK)) {
                                    if (Intrinsics.areEqual(aSTNodeImpl.parent, markdownElementType3)) {
                                        builder.append(s2.getUnescapedTextInNode(aSTNodeImpl, str));
                                    } else {
                                        appendAutoLink(builder, str, aSTNodeImpl, jWECryptoParts);
                                    }
                                } else if (Intrinsics.areEqual(markdownElementType6, GFMTokenTypes.DOLLAR)) {
                                    builder.append('$');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.SINGLE_QUOTE)) {
                                    builder.append('\'');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.DOUBLE_QUOTE)) {
                                    builder.append('\"');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.LPAREN)) {
                                    builder.append('(');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.RPAREN)) {
                                    builder.append(')');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.LBRACKET)) {
                                    builder.append('[');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.RBRACKET)) {
                                    builder.append(']');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.LT)) {
                                    builder.append('<');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.GT)) {
                                    builder.append('>');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.COLON)) {
                                    builder.append(':');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.EXCLAMATION_MARK)) {
                                    builder.append('!');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.BACKTICK)) {
                                    builder.append('`');
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.HARD_LINE_BREAK)) {
                                    builder.append('\n');
                                    markdownElementType5 = markdownElementType;
                                } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.EMPH)) {
                                    if (!Intrinsics.areEqual(markdownElementType7, markdownElementType8) && !Intrinsics.areEqual(markdownElementType7, markdownElementType9)) {
                                        builder.append(ASTUtilKt.getTextInNode(aSTNodeImpl, str));
                                    }
                                } else if (Intrinsics.areEqual(markdownElementType6, markdownElementType)) {
                                    builder.append(' ');
                                } else {
                                    MarkdownTokenTypes$Companion$WHITE_SPACE$1 markdownTokenTypes$Companion$WHITE_SPACE$1 = MarkdownTokenTypes.WHITE_SPACE;
                                    if (Intrinsics.areEqual(markdownElementType6, markdownTokenTypes$Companion$WHITE_SPACE$1)) {
                                        if (builder.text.length() > 0) {
                                            builder.append(' ');
                                        }
                                    } else if (Intrinsics.areEqual(markdownElementType6, MarkdownTokenTypes.BLOCK_QUOTE)) {
                                        markdownElementType5 = markdownTokenTypes$Companion$WHITE_SPACE$1;
                                    } else if (Intrinsics.areEqual(markdownElementType6.name, "~") && !Intrinsics.areEqual(markdownElementType7, markdownElementType10)) {
                                        builder.append(ASTUtilKt.getTextInNode(aSTNodeImpl, str));
                                    }
                                }
                            }
                        }
                    }
                }
                it = it2;
            } else {
                it = it2;
                markdownElementType5 = null;
            }
            it2 = it;
        }
    }

    public static boolean containsEntry$kotlinx_collections_immutable(AbstractMutableMap abstractMutableMap, Map.Entry entry) {
        entry.getClass();
        V v = abstractMutableMap.get(entry.getKey());
        return v != 0 ? v.equals(entry.getValue()) : entry.getValue() == null && abstractMutableMap.containsKey(entry.getKey());
    }

    public static boolean equals$kotlinx_collections_immutable(PersistentHashMapBuilder persistentHashMapBuilder, Map map) {
        map.getClass();
        if (persistentHashMapBuilder.size() != map.size()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return false;
        }
        if (map.isEmpty()) {
            return true;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!containsEntry$kotlinx_collections_immutable(persistentHashMapBuilder, (Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final void buildMarkdownAnnotatedString(AnnotatedString.Builder builder, String str, ASTNodeImpl aSTNodeImpl, JWECryptoParts jWECryptoParts) {
        str.getClass();
        aSTNodeImpl.getClass();
        jWECryptoParts.getClass();
        buildMarkdownAnnotatedString(builder, str, aSTNodeImpl.getChildren(), jWECryptoParts);
    }
}
