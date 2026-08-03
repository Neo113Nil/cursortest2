package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.BaselineButtonTokens;
import androidx.compose.material3.tokens.ButtonLargeTokens;
import androidx.compose.material3.tokens.ButtonMediumTokens;
import androidx.compose.material3.tokens.ButtonSmallTokens;
import androidx.compose.material3.tokens.ButtonXLargeTokens;
import androidx.compose.material3.tokens.ButtonXSmallTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\bF\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0018\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0002J\u0018\u0010%\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0002J\u000e\u0010~\u001a\u00020\u007fH\u0007¢\u0006\u0003\u0010\u0080\u0001J&\u0010~\u001a\u00020\u007f2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010`2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010`H\u0007¢\u0006\u0003\u0010\u0081\u0001J\u0010\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0007¢\u0006\u0003\u0010\u008a\u0001JC\u0010\u0088\u0001\u001a\u00030\u0089\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008e\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008f\u0001\u001a\u00030\u008c\u0001H\u0007¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0010\u0010\u0096\u0001\u001a\u00030\u0089\u0001H\u0007¢\u0006\u0003\u0010\u008a\u0001JC\u0010\u0096\u0001\u001a\u00030\u0089\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008e\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008f\u0001\u001a\u00030\u008c\u0001H\u0007¢\u0006\u0006\b\u0097\u0001\u0010\u0091\u0001J\u0010\u0010\u009a\u0001\u001a\u00030\u0089\u0001H\u0007¢\u0006\u0003\u0010\u008a\u0001JC\u0010\u009a\u0001\u001a\u00030\u0089\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008e\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008f\u0001\u001a\u00030\u008c\u0001H\u0007¢\u0006\u0006\b\u009b\u0001\u0010\u0091\u0001J\u0010\u0010\u009e\u0001\u001a\u00030\u0089\u0001H\u0007¢\u0006\u0003\u0010\u008a\u0001JC\u0010\u009e\u0001\u001a\u00030\u0089\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008e\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008f\u0001\u001a\u00030\u008c\u0001H\u0007¢\u0006\u0006\b\u009f\u0001\u0010\u0091\u0001J\u0010\u0010¢\u0001\u001a\u00030\u0089\u0001H\u0007¢\u0006\u0003\u0010\u008a\u0001JC\u0010¢\u0001\u001a\u00030\u0089\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008e\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008f\u0001\u001a\u00030\u008c\u0001H\u0007¢\u0006\u0006\b£\u0001\u0010\u0091\u0001JJ\u0010¦\u0001\u001a\u00030§\u00012\t\b\u0002\u0010¨\u0001\u001a\u00020\u00052\t\b\u0002\u0010©\u0001\u001a\u00020\u00052\t\b\u0002\u0010ª\u0001\u001a\u00020\u00052\t\b\u0002\u0010«\u0001\u001a\u00020\u00052\t\b\u0002\u0010¬\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001JJ\u0010¯\u0001\u001a\u00030§\u00012\t\b\u0002\u0010¨\u0001\u001a\u00020\u00052\t\b\u0002\u0010©\u0001\u001a\u00020\u00052\t\b\u0002\u0010ª\u0001\u001a\u00020\u00052\t\b\u0002\u0010«\u0001\u001a\u00020\u00052\t\b\u0002\u0010¬\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0006\b°\u0001\u0010®\u0001JJ\u0010±\u0001\u001a\u00030§\u00012\t\b\u0002\u0010¨\u0001\u001a\u00020\u00052\t\b\u0002\u0010©\u0001\u001a\u00020\u00052\t\b\u0002\u0010ª\u0001\u001a\u00020\u00052\t\b\u0002\u0010«\u0001\u001a\u00020\u00052\t\b\u0002\u0010¬\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0006\b²\u0001\u0010®\u0001J\u001b\u0010³\u0001\u001a\u00030´\u00012\t\b\u0002\u0010·\u0001\u001a\u00020\u0019H\u0007¢\u0006\u0003\u0010¸\u0001J\u001b\u0010¹\u0001\u001a\u00020\u007f2\u0007\u0010º\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0006\b»\u0001\u0010¼\u0001J-\u0010½\u0001\u001a\u00020\r2\u0007\u0010º\u0001\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u001b\u0010½\u0001\u001a\u00020\r2\u0007\u0010º\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001b\u0010Â\u0001\u001a\u00020\u00052\u0007\u0010º\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u001b\u0010Å\u0001\u001a\u00020\u00052\u0007\u0010º\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0006\bÆ\u0001\u0010Ä\u0001J\u001c\u0010Ç\u0001\u001a\u00030È\u00012\u0007\u0010º\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u001b\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u001e\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b \u0010\u000fR\u001a\u0010#\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0003\u001a\u0004\b%\u0010\u000fR\u001a\u0010&\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0003\u001a\u0004\b(\u0010\u000fR\u0010\u0010)\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010*\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000fR\u0010\u0010,\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010-\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u000fR\u0013\u0010/\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b0\u00101R\u0013\u00102\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b3\u00101R\u001e\u00104\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b5\u0010\u0003\u001a\u0004\b6\u00101R\u001e\u00107\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b8\u0010\u0003\u001a\u0004\b9\u00101R\u001e\u0010:\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b;\u0010\u0003\u001a\u0004\b<\u00101R\u001e\u0010=\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b>\u0010\u0003\u001a\u0004\b?\u00101R\u0013\u0010@\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\bA\u00101R\u001e\u0010B\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\bC\u0010\u0003\u001a\u0004\bD\u00101R\u001e\u0010E\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\bF\u0010\u0003\u001a\u0004\bG\u00101R\u001e\u0010H\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\bI\u0010\u0003\u001a\u0004\bJ\u00101R\u001e\u0010K\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\bL\u0010\u0003\u001a\u0004\bM\u00101R\u001e\u0010N\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\bO\u0010\u0003\u001a\u0004\bP\u00101R\u0013\u0010Q\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\bR\u00101R\u001e\u0010S\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\bT\u0010\u0003\u001a\u0004\bU\u00101R\u001e\u0010V\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\bW\u0010\u0003\u001a\u0004\bX\u00101R\u001e\u0010Y\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\bZ\u0010\u0003\u001a\u0004\b[\u00101R\u001e\u0010\\\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b]\u0010\u0003\u001a\u0004\b^\u00101R\u001a\u0010_\u001a\u00020`8GX\u0087\u0004¢\u0006\f\u0012\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020`8GX\u0087\u0004¢\u0006\f\u0012\u0004\bf\u0010b\u001a\u0004\bg\u0010dR\u001a\u0010h\u001a\u00020`8GX\u0087\u0004¢\u0006\f\u0012\u0004\bi\u0010b\u001a\u0004\bj\u0010dR\u001a\u0010k\u001a\u00020`8GX\u0087\u0004¢\u0006\f\u0012\u0004\bl\u0010b\u001a\u0004\bm\u0010dR\u001a\u0010n\u001a\u00020`8GX\u0087\u0004¢\u0006\f\u0012\u0004\bo\u0010b\u001a\u0004\bp\u0010dR\u001a\u0010q\u001a\u00020`8GX\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010b\u001a\u0004\bs\u0010dR\u0011\u0010t\u001a\u00020`8G¢\u0006\u0006\u001a\u0004\bu\u0010dR\u0011\u0010v\u001a\u00020`8G¢\u0006\u0006\u001a\u0004\bw\u0010dR\u0011\u0010x\u001a\u00020`8G¢\u0006\u0006\u001a\u0004\by\u0010dR\u0011\u0010z\u001a\u00020`8G¢\u0006\u0006\u001a\u0004\b{\u0010dR\u0011\u0010|\u001a\u00020`8G¢\u0006\u0006\u001a\u0004\b}\u0010dR$\u0010\u0082\u0001\u001a\u00020\u007f*\u00030\u0083\u00018@X\u0080\u0004¢\u0006\u0010\u0012\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001d\u0010\u0092\u0001\u001a\u00030\u0089\u0001*\u00030\u0093\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001d\u0010\u0098\u0001\u001a\u00030\u0089\u0001*\u00030\u0093\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u0095\u0001R\u001d\u0010\u009c\u0001\u001a\u00030\u0089\u0001*\u00030\u0093\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u0095\u0001R\u001d\u0010 \u0001\u001a\u00030\u0089\u0001*\u00030\u0093\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u0095\u0001R\u001d\u0010¤\u0001\u001a\u00030\u0089\u0001*\u00030\u0093\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010\u0095\u0001R\u0015\u0010³\u0001\u001a\u00030´\u00018G¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0011\u0010Ë\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010Ì\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010Í\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010Î\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010Ï\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010Ð\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010Ñ\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010Ò\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010Ó\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010Ô\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010Õ\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010Ö\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006×\u0001"}, d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "<init>", "()V", "ButtonLeadingSpace", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonTrailingSpace", "ButtonWithIconStartpadding", "SmallStartPadding", "SmallEndPadding", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ButtonWithIconContentPadding", "getButtonWithIconContentPadding", "SmallButtonContentPadding", "getSmallButtonContentPadding$annotations", "getSmallButtonContentPadding", "SmallContentPadding", "getSmallContentPadding$annotations", "getSmallContentPadding", "hasStartIcon", "", "hasEndIcon", "ExtraSmallContentPadding", "getExtraSmallContentPadding$annotations", "getExtraSmallContentPadding", "MediumContentPadding", "getMediumContentPadding$annotations", "getMediumContentPadding", "hasLeadingIcon", "hasTrailingIcon", "LargeContentPadding", "getLargeContentPadding$annotations", "getLargeContentPadding", "ExtraLargeContentPadding", "getExtraLargeContentPadding$annotations", "getExtraLargeContentPadding", "TextButtonHorizontalPadding", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonWithIconHorizontalEndPadding", "TextButtonWithIconContentPadding", "getTextButtonWithIconContentPadding", "MinWidth", "getMinWidth-D9Ej5fM", "()F", "MinHeight", "getMinHeight-D9Ej5fM", "ExtraSmallContainerHeight", "getExtraSmallContainerHeight-D9Ej5fM$annotations", "getExtraSmallContainerHeight-D9Ej5fM", "MediumContainerHeight", "getMediumContainerHeight-D9Ej5fM$annotations", "getMediumContainerHeight-D9Ej5fM", "LargeContainerHeight", "getLargeContainerHeight-D9Ej5fM$annotations", "getLargeContainerHeight-D9Ej5fM", "ExtraLargeContainerHeight", "getExtraLargeContainerHeight-D9Ej5fM$annotations", "getExtraLargeContainerHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "ExtraSmallIconSize", "getExtraSmallIconSize-D9Ej5fM$annotations", "getExtraSmallIconSize-D9Ej5fM", "SmallIconSize", "getSmallIconSize-D9Ej5fM$annotations", "getSmallIconSize-D9Ej5fM", "MediumIconSize", "getMediumIconSize-D9Ej5fM$annotations", "getMediumIconSize-D9Ej5fM", "LargeIconSize", "getLargeIconSize-D9Ej5fM$annotations", "getLargeIconSize-D9Ej5fM", "ExtraLargeIconSize", "getExtraLargeIconSize-D9Ej5fM$annotations", "getExtraLargeIconSize-D9Ej5fM", "IconSpacing", "getIconSpacing-D9Ej5fM", "ExtraSmallIconSpacing", "getExtraSmallIconSpacing-D9Ej5fM$annotations", "getExtraSmallIconSpacing-D9Ej5fM", "MediumIconSpacing", "getMediumIconSpacing-D9Ej5fM$annotations", "getMediumIconSpacing-D9Ej5fM", "LargeIconSpacing", "getLargeIconSpacing-D9Ej5fM$annotations", "getLargeIconSpacing-D9Ej5fM", "ExtraLargeIconSpacing", "getExtraLargeIconSpacing-D9Ej5fM$annotations", "getExtraLargeIconSpacing-D9Ej5fM", "squareShape", "Landroidx/compose/ui/graphics/Shape;", "getSquareShape$annotations", "(Landroidx/compose/runtime/Composer;I)V", "getSquareShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "pressedShape", "getPressedShape$annotations", "getPressedShape", "extraSmallPressedShape", "getExtraSmallPressedShape$annotations", "getExtraSmallPressedShape", "mediumPressedShape", "getMediumPressedShape$annotations", "getMediumPressedShape", "largePressedShape", "getLargePressedShape$annotations", "getLargePressedShape", "extraLargePressedShape", "getExtraLargePressedShape$annotations", "getExtraLargePressedShape", "shape", "getShape", "elevatedShape", "getElevatedShape", "filledTonalShape", "getFilledTonalShape", "outlinedShape", "getOutlinedShape", "textShape", "getTextShape", "shapes", "Landroidx/compose/material3/ButtonShapes;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonShapes;", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonShapes;", "defaultButtonShapes", "Landroidx/compose/material3/Shapes;", "getDefaultButtonShapes$material3$annotations", "(Landroidx/compose/material3/Shapes;)V", "getDefaultButtonShapes$material3", "(Landroidx/compose/material3/Shapes;)Landroidx/compose/material3/ButtonShapes;", "buttonColors", "Landroidx/compose/material3/ButtonColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "defaultButtonColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultButtonColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ButtonColors;", "elevatedButtonColors", "elevatedButtonColors-ro_MJ88", "defaultElevatedButtonColors", "getDefaultElevatedButtonColors$material3", "filledTonalButtonColors", "filledTonalButtonColors-ro_MJ88", "defaultFilledTonalButtonColors", "getDefaultFilledTonalButtonColors$material3", "outlinedButtonColors", "outlinedButtonColors-ro_MJ88", "defaultOutlinedButtonColors", "getDefaultOutlinedButtonColors$material3", "textButtonColors", "textButtonColors-ro_MJ88", "defaultTextButtonColors", "getDefaultTextButtonColors$material3", "buttonElevation", "Landroidx/compose/material3/ButtonElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "elevatedButtonElevation", "elevatedButtonElevation-R_JCAzs", "filledTonalButtonElevation", "filledTonalButtonElevation-R_JCAzs", "outlinedButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedButtonBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "enabled", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "shapesFor", "buttonHeight", "shapesFor-8Feqmps", "(FLandroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonShapes;", "contentPaddingFor", "contentPaddingFor-8Feqmps", "(FZZ)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingFor-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "iconSizeFor", "iconSizeFor-5rwHm24", "(F)F", "iconSpacingFor", "iconSpacingFor-5rwHm24", "textStyleFor", "Landroidx/compose/ui/text/TextStyle;", "textStyleFor-8Feqmps", "(FLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "SmallVerticalPadding", "IconSmallHorizontalPadding", "MediumLeadingPadding", "MediumTrailingPadding", "MediumVerticalPadding", "IconMediumLeadingPadding", "IconMediumTrailingPadding", "LargeVerticalPadding", "LargeLeadingPadding", "LargeTrailingPadding", "IconLargeLeadingPadding", "IconLargeTrailingPadding", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonLeadingSpace;
    private static final float ButtonTrailingSpace;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconStartpadding;
    private static final PaddingValues ContentPadding;
    private static final float ExtraLargeContainerHeight;
    private static final float ExtraLargeIconSize;
    private static final float ExtraLargeIconSpacing;
    private static final float ExtraSmallContainerHeight;
    private static final float ExtraSmallIconSize;
    private static final float ExtraSmallIconSpacing;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconLargeLeadingPadding;
    private static final float IconLargeTrailingPadding;
    private static final float IconMediumLeadingPadding;
    private static final float IconMediumTrailingPadding;
    private static final float IconSize;
    private static final float IconSmallHorizontalPadding;
    private static final float IconSpacing;
    private static final float LargeContainerHeight;
    private static final float LargeIconSize;
    private static final float LargeIconSpacing;
    private static final float LargeLeadingPadding;
    private static final float LargeTrailingPadding;
    private static final float LargeVerticalPadding;
    private static final float MediumContainerHeight;
    private static final float MediumIconSize;
    private static final float MediumIconSpacing;
    private static final float MediumLeadingPadding;
    private static final float MediumTrailingPadding;
    private static final float MediumVerticalPadding;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final float SmallEndPadding;
    private static final float SmallIconSize;
    private static final float SmallStartPadding;
    private static final float SmallVerticalPadding;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;
    private static final PaddingValues TextButtonWithIconContentPadding;
    private static final float TextButtonWithIconHorizontalEndPadding;

    public static /* synthetic */ void getDefaultButtonShapes$material3$annotations(Shapes shapes) {
    }

    /* renamed from: getExtraLargeContainerHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2576getExtraLargeContainerHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getExtraLargeContentPadding$annotations() {
    }

    /* renamed from: getExtraLargeIconSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2577getExtraLargeIconSizeD9Ej5fM$annotations() {
    }

    /* renamed from: getExtraLargeIconSpacing-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2578getExtraLargeIconSpacingD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getExtraLargePressedShape$annotations(Composer composer, int i) {
    }

    /* renamed from: getExtraSmallContainerHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2579getExtraSmallContainerHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getExtraSmallContentPadding$annotations() {
    }

    /* renamed from: getExtraSmallIconSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2580getExtraSmallIconSizeD9Ej5fM$annotations() {
    }

    /* renamed from: getExtraSmallIconSpacing-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2581getExtraSmallIconSpacingD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getExtraSmallPressedShape$annotations(Composer composer, int i) {
    }

    /* renamed from: getLargeContainerHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2582getLargeContainerHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getLargeContentPadding$annotations() {
    }

    /* renamed from: getLargeIconSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2583getLargeIconSizeD9Ej5fM$annotations() {
    }

    /* renamed from: getLargeIconSpacing-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2584getLargeIconSpacingD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getLargePressedShape$annotations(Composer composer, int i) {
    }

    /* renamed from: getMediumContainerHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2585getMediumContainerHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getMediumContentPadding$annotations() {
    }

    /* renamed from: getMediumIconSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2586getMediumIconSizeD9Ej5fM$annotations() {
    }

    /* renamed from: getMediumIconSpacing-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2587getMediumIconSpacingD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getMediumPressedShape$annotations(Composer composer, int i) {
    }

    public static /* synthetic */ void getPressedShape$annotations(Composer composer, int i) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "For binary compatibility")
    public static /* synthetic */ void getSmallButtonContentPadding$annotations() {
    }

    public static /* synthetic */ void getSmallContentPadding$annotations() {
    }

    /* renamed from: getSmallIconSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2588getSmallIconSizeD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getSquareShape$annotations(Composer composer, int i) {
    }

    private ButtonDefaults() {
    }

    static {
        float m4987getContainerHeightD9Ej5fM;
        float m4981getContainerHeightD9Ej5fM;
        float m4975getContainerHeightD9Ej5fM;
        float m4977getIconSizeD9Ej5fM;
        float m4976getIconLabelSpaceD9Ej5fM;
        float m4984getLeadingSpaceD9Ej5fM;
        float m4986getTrailingSpaceD9Ej5fM;
        float m4978getLeadingSpaceD9Ej5fM;
        float m4980getTrailingSpaceD9Ej5fM;
        float m4978getLeadingSpaceD9Ej5fM2;
        float m4980getTrailingSpaceD9Ej5fM2;
        float m4968getLeadingSpaceD9Ej5fM = BaselineButtonTokens.INSTANCE.m4968getLeadingSpaceD9Ej5fM();
        ButtonLeadingSpace = m4968getLeadingSpaceD9Ej5fM;
        float m4970getTrailingSpaceD9Ej5fM = BaselineButtonTokens.INSTANCE.m4970getTrailingSpaceD9Ej5fM();
        ButtonTrailingSpace = m4970getTrailingSpaceD9Ej5fM;
        float f = 16;
        float m9732constructorimpl = Dp.m9732constructorimpl(f);
        ButtonWithIconStartpadding = m9732constructorimpl;
        float m4990getLeadingSpaceD9Ej5fM = ButtonSmallTokens.INSTANCE.m4990getLeadingSpaceD9Ej5fM();
        SmallStartPadding = m4990getLeadingSpaceD9Ej5fM;
        SmallEndPadding = ButtonSmallTokens.INSTANCE.m4992getTrailingSpaceD9Ej5fM();
        float f2 = 8;
        float m9732constructorimpl2 = Dp.m9732constructorimpl(f2);
        ButtonVerticalPadding = m9732constructorimpl2;
        PaddingValues m1197PaddingValuesa9UjIt4 = PaddingKt.m1197PaddingValuesa9UjIt4(m4968getLeadingSpaceD9Ej5fM, m9732constructorimpl2, m4970getTrailingSpaceD9Ej5fM, m9732constructorimpl2);
        ContentPadding = m1197PaddingValuesa9UjIt4;
        ButtonWithIconContentPadding = PaddingKt.m1197PaddingValuesa9UjIt4(m9732constructorimpl, m9732constructorimpl2, m4970getTrailingSpaceD9Ej5fM, m9732constructorimpl2);
        float f3 = 12;
        float m9732constructorimpl3 = Dp.m9732constructorimpl(f3);
        TextButtonHorizontalPadding = m9732constructorimpl3;
        TextButtonContentPadding = PaddingKt.m1197PaddingValuesa9UjIt4(m9732constructorimpl3, m1197PaddingValuesa9UjIt4.getTop(), m9732constructorimpl3, m1197PaddingValuesa9UjIt4.getBottom());
        float m9732constructorimpl4 = Dp.m9732constructorimpl(f);
        TextButtonWithIconHorizontalEndPadding = m9732constructorimpl4;
        TextButtonWithIconContentPadding = PaddingKt.m1197PaddingValuesa9UjIt4(m9732constructorimpl3, m1197PaddingValuesa9UjIt4.getTop(), m9732constructorimpl4, m1197PaddingValuesa9UjIt4.getBottom());
        MinWidth = Dp.m9732constructorimpl(58);
        if (!PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4987getContainerHeightD9Ej5fM = ButtonSmallTokens.INSTANCE.m4987getContainerHeightD9Ej5fM();
        } else {
            m4987getContainerHeightD9Ej5fM = Dp.m9732constructorimpl(36);
        }
        MinHeight = m4987getContainerHeightD9Ej5fM;
        ExtraSmallContainerHeight = ButtonXSmallTokens.INSTANCE.m4999getContainerHeightD9Ej5fM();
        if (!PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4981getContainerHeightD9Ej5fM = ButtonMediumTokens.INSTANCE.m4981getContainerHeightD9Ej5fM();
        } else {
            m4981getContainerHeightD9Ej5fM = Dp.m9732constructorimpl(46);
        }
        MediumContainerHeight = m4981getContainerHeightD9Ej5fM;
        if (!PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4975getContainerHeightD9Ej5fM = ButtonLargeTokens.INSTANCE.m4975getContainerHeightD9Ej5fM();
        } else {
            m4975getContainerHeightD9Ej5fM = Dp.m9732constructorimpl(54);
        }
        LargeContainerHeight = m4975getContainerHeightD9Ej5fM;
        ExtraLargeContainerHeight = ButtonXLargeTokens.INSTANCE.m4993getContainerHeightD9Ej5fM();
        IconSize = Dp.m9732constructorimpl(18);
        ExtraSmallIconSize = ButtonXSmallTokens.INSTANCE.m5001getIconSizeD9Ej5fM();
        SmallIconSize = ButtonSmallTokens.INSTANCE.m4989getIconSizeD9Ej5fM();
        MediumIconSize = ButtonMediumTokens.INSTANCE.m4983getIconSizeD9Ej5fM();
        if (!PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4977getIconSizeD9Ej5fM = ButtonLargeTokens.INSTANCE.m4977getIconSizeD9Ej5fM();
        } else {
            m4977getIconSizeD9Ej5fM = Dp.m9732constructorimpl(24);
        }
        LargeIconSize = m4977getIconSizeD9Ej5fM;
        ExtraLargeIconSize = ButtonXLargeTokens.INSTANCE.m4995getIconSizeD9Ej5fM();
        IconSpacing = ButtonSmallTokens.INSTANCE.m4988getIconLabelSpaceD9Ej5fM();
        ExtraSmallIconSpacing = Dp.m9732constructorimpl(4);
        MediumIconSpacing = ButtonMediumTokens.INSTANCE.m4982getIconLabelSpaceD9Ej5fM();
        if (!PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4976getIconLabelSpaceD9Ej5fM = ButtonLargeTokens.INSTANCE.m4976getIconLabelSpaceD9Ej5fM();
        } else {
            m4976getIconLabelSpaceD9Ej5fM = Dp.m9732constructorimpl(f2);
        }
        LargeIconSpacing = m4976getIconLabelSpaceD9Ej5fM;
        ExtraLargeIconSpacing = ButtonXLargeTokens.INSTANCE.m4994getIconLabelSpaceD9Ej5fM();
        SmallVerticalPadding = PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue() ? Dp.m9732constructorimpl(f2) : Dp.m9732constructorimpl(10);
        if (PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4990getLeadingSpaceD9Ej5fM = Dp.m9732constructorimpl(f3);
        }
        IconSmallHorizontalPadding = m4990getLeadingSpaceD9Ej5fM;
        MediumLeadingPadding = ButtonMediumTokens.INSTANCE.m4984getLeadingSpaceD9Ej5fM();
        MediumTrailingPadding = ButtonMediumTokens.INSTANCE.m4986getTrailingSpaceD9Ej5fM();
        MediumVerticalPadding = PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue() ? Dp.m9732constructorimpl(f3) : Dp.m9732constructorimpl(f);
        if (!PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4984getLeadingSpaceD9Ej5fM = ButtonMediumTokens.INSTANCE.m4984getLeadingSpaceD9Ej5fM();
        } else {
            m4984getLeadingSpaceD9Ej5fM = Dp.m9732constructorimpl(20);
        }
        IconMediumLeadingPadding = m4984getLeadingSpaceD9Ej5fM;
        if (!PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4986getTrailingSpaceD9Ej5fM = ButtonMediumTokens.INSTANCE.m4986getTrailingSpaceD9Ej5fM();
        } else {
            m4986getTrailingSpaceD9Ej5fM = Dp.m9732constructorimpl(20);
        }
        IconMediumTrailingPadding = m4986getTrailingSpaceD9Ej5fM;
        LargeVerticalPadding = Dp.m9732constructorimpl(PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue() ? 14 : 32);
        if (!PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4978getLeadingSpaceD9Ej5fM = ButtonLargeTokens.INSTANCE.m4978getLeadingSpaceD9Ej5fM();
        } else {
            m4978getLeadingSpaceD9Ej5fM = Dp.m9732constructorimpl(32);
        }
        LargeLeadingPadding = m4978getLeadingSpaceD9Ej5fM;
        if (!PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4980getTrailingSpaceD9Ej5fM = ButtonLargeTokens.INSTANCE.m4980getTrailingSpaceD9Ej5fM();
        } else {
            m4980getTrailingSpaceD9Ej5fM = Dp.m9732constructorimpl(32);
        }
        LargeTrailingPadding = m4980getTrailingSpaceD9Ej5fM;
        if (!PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4978getLeadingSpaceD9Ej5fM2 = ButtonLargeTokens.INSTANCE.m4978getLeadingSpaceD9Ej5fM();
        } else {
            m4978getLeadingSpaceD9Ej5fM2 = Dp.m9732constructorimpl(28);
        }
        IconLargeLeadingPadding = m4978getLeadingSpaceD9Ej5fM2;
        if (!PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            m4980getTrailingSpaceD9Ej5fM2 = ButtonLargeTokens.INSTANCE.m4980getTrailingSpaceD9Ej5fM();
        } else {
            m4980getTrailingSpaceD9Ej5fM2 = Dp.m9732constructorimpl(28);
        }
        IconLargeTrailingPadding = m4980getTrailingSpaceD9Ej5fM2;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    public final /* synthetic */ PaddingValues getSmallButtonContentPadding() {
        float f = SmallStartPadding;
        float f2 = ButtonVerticalPadding;
        return PaddingKt.m1197PaddingValuesa9UjIt4(f, f2, SmallEndPadding, f2);
    }

    public final PaddingValues getSmallContentPadding() {
        float f = SmallStartPadding;
        float f2 = SmallVerticalPadding;
        return PaddingKt.m1197PaddingValuesa9UjIt4(f, f2, SmallEndPadding, f2);
    }

    private final PaddingValues getSmallContentPadding(boolean hasStartIcon, boolean hasEndIcon) {
        float f = hasStartIcon ? IconSmallHorizontalPadding : SmallStartPadding;
        float f2 = SmallVerticalPadding;
        return PaddingKt.m1197PaddingValuesa9UjIt4(f, f2, hasEndIcon ? IconSmallHorizontalPadding : SmallEndPadding, f2);
    }

    public final PaddingValues getMediumContentPadding() {
        float f = MediumLeadingPadding;
        float f2 = MediumVerticalPadding;
        return PaddingKt.m1197PaddingValuesa9UjIt4(f, f2, MediumTrailingPadding, f2);
    }

    private final PaddingValues getMediumContentPadding(boolean hasLeadingIcon, boolean hasTrailingIcon) {
        float f = hasLeadingIcon ? IconMediumLeadingPadding : MediumLeadingPadding;
        float f2 = MediumVerticalPadding;
        return PaddingKt.m1197PaddingValuesa9UjIt4(f, f2, hasTrailingIcon ? IconMediumTrailingPadding : MediumTrailingPadding, f2);
    }

    public final PaddingValues getLargeContentPadding() {
        float f = LargeLeadingPadding;
        float f2 = LargeVerticalPadding;
        return PaddingKt.m1197PaddingValuesa9UjIt4(f, f2, LargeTrailingPadding, f2);
    }

    private final PaddingValues getLargeContentPadding(boolean hasLeadingIcon, boolean hasTrailingIcon) {
        float f = hasLeadingIcon ? IconLargeLeadingPadding : LargeLeadingPadding;
        float f2 = LargeVerticalPadding;
        return PaddingKt.m1197PaddingValuesa9UjIt4(f, f2, hasTrailingIcon ? IconLargeTrailingPadding : LargeTrailingPadding, f2);
    }

    public final PaddingValues getExtraLargeContentPadding() {
        float f = 48;
        return PaddingKt.m1197PaddingValuesa9UjIt4(ButtonXLargeTokens.INSTANCE.m4996getLeadingSpaceD9Ej5fM(), Dp.m9732constructorimpl(f), ButtonXLargeTokens.INSTANCE.m4998getTrailingSpaceD9Ej5fM(), Dp.m9732constructorimpl(f));
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    public final PaddingValues getTextButtonWithIconContentPadding() {
        return TextButtonWithIconContentPadding;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2612getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2611getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getExtraSmallContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2600getExtraSmallContainerHeightD9Ej5fM() {
        return ExtraSmallContainerHeight;
    }

    /* renamed from: getMediumContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2608getMediumContainerHeightD9Ej5fM() {
        return MediumContainerHeight;
    }

    /* renamed from: getLargeContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2605getLargeContainerHeightD9Ej5fM() {
        return LargeContainerHeight;
    }

    /* renamed from: getExtraLargeContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2597getExtraLargeContainerHeightD9Ej5fM() {
        return ExtraLargeContainerHeight;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2603getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getExtraSmallIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2601getExtraSmallIconSizeD9Ej5fM() {
        return ExtraSmallIconSize;
    }

    /* renamed from: getSmallIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2613getSmallIconSizeD9Ej5fM() {
        return SmallIconSize;
    }

    /* renamed from: getMediumIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2609getMediumIconSizeD9Ej5fM() {
        return MediumIconSize;
    }

    /* renamed from: getLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2606getLargeIconSizeD9Ej5fM() {
        return LargeIconSize;
    }

    /* renamed from: getExtraLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2598getExtraLargeIconSizeD9Ej5fM() {
        return ExtraLargeIconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m2604getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getExtraSmallIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m2602getExtraSmallIconSpacingD9Ej5fM() {
        return ExtraSmallIconSpacing;
    }

    /* renamed from: getMediumIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m2610getMediumIconSpacingD9Ej5fM() {
        return MediumIconSpacing;
    }

    /* renamed from: getLargeIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m2607getLargeIconSpacingD9Ej5fM() {
        return LargeIconSpacing;
    }

    /* renamed from: getExtraLargeIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m2599getExtraLargeIconSpacingD9Ej5fM() {
        return ExtraLargeIconSpacing;
    }

    public final Shape getSquareShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -61545427, "C(<get-squareShape>)1167@55816L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-61545427, i, -1, "androidx.compose.material3.ButtonDefaults.<get-squareShape> (Button.kt:1167)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getPressedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1599095131, "C(<get-pressedShape>)1172@56005L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1599095131, i, -1, "androidx.compose.material3.ButtonDefaults.<get-pressedShape> (Button.kt:1172)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getExtraSmallPressedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1220334917, "C(<get-extraSmallPressedShape>)1177@56209L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1220334917, i, -1, "androidx.compose.material3.ButtonDefaults.<get-extraSmallPressedShape> (Button.kt:1177)");
        }
        Shape value = ShapesKt.getValue(ButtonXSmallTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getMediumPressedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 955096581, "C(<get-mediumPressedShape>)1182@56404L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(955096581, i, -1, "androidx.compose.material3.ButtonDefaults.<get-mediumPressedShape> (Button.kt:1182)");
        }
        Shape value = ShapesKt.getValue(ButtonMediumTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getLargePressedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1613862463, "C(<get-largePressedShape>)1187@56596L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1613862463, i, -1, "androidx.compose.material3.ButtonDefaults.<get-largePressedShape> (Button.kt:1187)");
        }
        Shape value = ShapesKt.getValue(ButtonLargeTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getExtraLargePressedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -339609659, "C(<get-extraLargePressedShape>)1192@56800L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339609659, i, -1, "androidx.compose.material3.ButtonDefaults.<get-extraLargePressedShape> (Button.kt:1192)");
        }
        Shape value = ShapesKt.getValue(ButtonXLargeTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1234923021, "C(<get-shape>)1196@56933L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:1196)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getElevatedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 2143958791, "C(<get-elevatedShape>)1200@57084L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:1200)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getFilledTonalShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -886584987, "C(<get-filledTonalShape>)1204@57241L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:1204)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getOutlinedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -2045213065, "C(<get-outlinedShape>)1208@57392L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:1208)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getTextShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -349121587, "C(<get-textShape>)1212@57534L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:1212)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final ButtonShapes shapes(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1554265461, "C(shapes)1220@57755L6:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1554265461, i, -1, "androidx.compose.material3.ButtonDefaults.shapes (Button.kt:1220)");
        }
        ButtonShapes defaultButtonShapes$material3 = getDefaultButtonShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultButtonShapes$material3;
    }

    public final ButtonShapes shapes(Shape shape, Shape shape2, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1854268625, "C(shapes)N(shape,pressedShape)1232@58218L6:Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            shape = null;
        }
        if ((i2 & 2) != 0) {
            shape2 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1854268625, i, -1, "androidx.compose.material3.ButtonDefaults.shapes (Button.kt:1232)");
        }
        ButtonShapes copy = getDefaultButtonShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6)).copy(shape, shape2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return copy;
    }

    public final ButtonShapes getDefaultButtonShapes$material3(Shapes shapes) {
        ButtonShapes defaultButtonShapesCached = shapes.getDefaultButtonShapesCached();
        if (defaultButtonShapesCached != null) {
            return defaultButtonShapesCached;
        }
        ButtonShapes buttonShapes = new ButtonShapes(ShapesKt.fromToken(shapes, ButtonSmallTokens.INSTANCE.getContainerShapeRound()), ShapesKt.fromToken(shapes, ButtonSmallTokens.INSTANCE.getPressedContainerShape()));
        shapes.setDefaultButtonShapesCached$material3(buttonShapes);
        return buttonShapes;
    }

    public final ButtonColors buttonColors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1449248637, "C(buttonColors)1249@58951L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1449248637, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:1249)");
        }
        ButtonColors defaultButtonColors$material3 = getDefaultButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultButtonColors$material3;
    }

    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m2589buttonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -339300779, "C(buttonColors)N(containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,disabledContainerColor:c#ui.graphics.Color,disabledContentColor:c#ui.graphics.Color)1267@59757L11:Button.kt#uh7d8r");
        long m6822getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
        long m6822getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j2;
        long m6822getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j3;
        long m6822getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:1267)");
        }
        ButtonColors m2570copyjRlVdoo = getDefaultButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2570copyjRlVdoo(m6822getUnspecified0d7_KjU, m6822getUnspecified0d7_KjU2, m6822getUnspecified0d7_KjU3, m6822getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2570copyjRlVdoo;
    }

    public final ButtonColors getDefaultButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultButtonColorsCached = colorScheme.getDefaultButtonColorsCached();
        if (defaultButtonColorsCached != null) {
            return defaultButtonColorsCached;
        }
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getLabelTextColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getDisabledContainerColor()), FilledButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getDisabledLabelTextColor()), FilledButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonColors elevatedButtonColors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 2025043443, "C(elevatedButtonColors)1294@61075L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025043443, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:1294)");
        }
        ButtonColors defaultElevatedButtonColors$material3 = getDefaultElevatedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultElevatedButtonColors$material3;
    }

    /* renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m2593elevatedButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1507908383, "C(elevatedButtonColors)N(containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,disabledContainerColor:c#ui.graphics.Color,disabledContentColor:c#ui.graphics.Color)1312@61934L11:Button.kt#uh7d8r");
        long m6822getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
        long m6822getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j2;
        long m6822getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j3;
        long m6822getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:1312)");
        }
        ButtonColors m2570copyjRlVdoo = getDefaultElevatedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2570copyjRlVdoo(m6822getUnspecified0d7_KjU, m6822getUnspecified0d7_KjU2, m6822getUnspecified0d7_KjU3, m6822getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2570copyjRlVdoo;
    }

    public final ButtonColors getDefaultElevatedButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultElevatedButtonColorsCached = colorScheme.getDefaultElevatedButtonColorsCached();
        if (defaultElevatedButtonColorsCached != null) {
            return defaultElevatedButtonColorsCached;
        }
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getLabelTextColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getDisabledContainerColor()), ElevatedButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getDisabledLabelTextColor()), ElevatedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonColors filledTonalButtonColors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 824987837, "C(filledTonalButtonColors)1340@63306L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(824987837, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:1340)");
        }
        ButtonColors defaultFilledTonalButtonColors$material3 = getDefaultFilledTonalButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultFilledTonalButtonColors$material3;
    }

    /* renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m2595filledTonalButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1670757653, "C(filledTonalButtonColors)N(containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,disabledContainerColor:c#ui.graphics.Color,disabledContentColor:c#ui.graphics.Color)1359@64195L11:Button.kt#uh7d8r");
        long m6822getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
        long m6822getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j2;
        long m6822getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j3;
        long m6822getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:1359)");
        }
        ButtonColors m2570copyjRlVdoo = getDefaultFilledTonalButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2570copyjRlVdoo(m6822getUnspecified0d7_KjU, m6822getUnspecified0d7_KjU2, m6822getUnspecified0d7_KjU3, m6822getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2570copyjRlVdoo;
    }

    public final ButtonColors getDefaultFilledTonalButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultFilledTonalButtonColorsCached = colorScheme.getDefaultFilledTonalButtonColorsCached();
        if (defaultFilledTonalButtonColorsCached != null) {
            return defaultFilledTonalButtonColorsCached;
        }
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getLabelTextColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonColors outlinedButtonColors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1344886725, "C(outlinedButtonColors)1386@65587L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344886725, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:1386)");
        }
        ButtonColors defaultOutlinedButtonColors$material3 = getDefaultOutlinedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultOutlinedButtonColors$material3;
    }

    /* renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m2616outlinedButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1778526249, "C(outlinedButtonColors)N(containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,disabledContainerColor:c#ui.graphics.Color,disabledContentColor:c#ui.graphics.Color)1404@66446L11:Button.kt#uh7d8r");
        long m6822getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
        long m6822getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j2;
        long m6822getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j3;
        long m6822getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:1404)");
        }
        ButtonColors m2570copyjRlVdoo = getDefaultOutlinedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2570copyjRlVdoo(m6822getUnspecified0d7_KjU, m6822getUnspecified0d7_KjU2, m6822getUnspecified0d7_KjU3, m6822getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2570copyjRlVdoo;
    }

    public final ButtonColors getDefaultOutlinedButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultOutlinedButtonColorsCached = colorScheme.getDefaultOutlinedButtonColorsCached();
        if (defaultOutlinedButtonColorsCached != null) {
            return defaultOutlinedButtonColorsCached;
        }
        ButtonColors buttonColors = new ButtonColors(Color.INSTANCE.m6821getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedButtonTokens.INSTANCE.getLabelTextColor()), Color.INSTANCE.m6821getTransparent0d7_KjU(), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedButtonTokens.INSTANCE.getDisabledLabelTextColor()), OutlinedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonColors textButtonColors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1880341584, "C(textButtonColors)1429@67612L11:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880341584, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:1429)");
        }
        ButtonColors defaultTextButtonColors$material3 = getDefaultTextButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextButtonColors$material3;
    }

    /* renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m2618textButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1402274782, "C(textButtonColors)N(containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,disabledContainerColor:c#ui.graphics.Color,disabledContentColor:c#ui.graphics.Color)1447@68442L11:Button.kt#uh7d8r");
        long m6822getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
        long m6822getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j2;
        long m6822getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j3;
        long m6822getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:1447)");
        }
        ButtonColors m2570copyjRlVdoo = getDefaultTextButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2570copyjRlVdoo(m6822getUnspecified0d7_KjU, m6822getUnspecified0d7_KjU2, m6822getUnspecified0d7_KjU3, m6822getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2570copyjRlVdoo;
    }

    public final ButtonColors getDefaultTextButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached = colorScheme.getDefaultTextButtonColorsCached();
        if (defaultTextButtonColorsCached != null) {
            return defaultTextButtonColorsCached;
        }
        ButtonColors buttonColors = new ButtonColors(Color.INSTANCE.m6821getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.Primary), Color.INSTANCE.m6821getTransparent0d7_KjU(), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, TextButtonTokens.INSTANCE.getDisabledLabelColor()), TextButtonTokens.INSTANCE.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultTextButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    /* renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m2590buttonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1827791191, "C(buttonElevation)N(defaultElevation:c#ui.unit.Dp,pressedElevation:c#ui.unit.Dp,focusedElevation:c#ui.unit.Dp,hoveredElevation:c#ui.unit.Dp,disabledElevation:c#ui.unit.Dp):Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = FilledButtonTokens.INSTANCE.m5245getContainerElevationD9Ej5fM();
        }
        float f6 = f;
        if ((i2 & 2) != 0) {
            f2 = FilledButtonTokens.INSTANCE.m5249getPressedContainerElevationD9Ej5fM();
        }
        float f7 = f2;
        if ((i2 & 4) != 0) {
            f3 = FilledButtonTokens.INSTANCE.m5247getFocusedContainerElevationD9Ej5fM();
        }
        float f8 = f3;
        if ((i2 & 8) != 0) {
            f4 = FilledButtonTokens.INSTANCE.m5248getHoveredContainerElevationD9Ej5fM();
        }
        float f9 = f4;
        if ((i2 & 16) != 0) {
            f5 = FilledButtonTokens.INSTANCE.m5246getDisabledContainerElevationD9Ej5fM();
        }
        float f10 = f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:1488)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return buttonElevation;
    }

    /* renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m2594elevatedButtonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1065482445, "C(elevatedButtonElevation)N(defaultElevation:c#ui.unit.Dp,pressedElevation:c#ui.unit.Dp,focusedElevation:c#ui.unit.Dp,hoveredElevation:c#ui.unit.Dp,disabledElevation:c#ui.unit.Dp):Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = ElevatedButtonTokens.INSTANCE.m5163getContainerElevationD9Ej5fM();
        }
        float f6 = f;
        if ((i2 & 2) != 0) {
            f2 = ElevatedButtonTokens.INSTANCE.m5167getPressedContainerElevationD9Ej5fM();
        }
        float f7 = f2;
        if ((i2 & 4) != 0) {
            f3 = ElevatedButtonTokens.INSTANCE.m5165getFocusedContainerElevationD9Ej5fM();
        }
        float f8 = f3;
        if ((i2 & 8) != 0) {
            f4 = ElevatedButtonTokens.INSTANCE.m5166getHoveredContainerElevationD9Ej5fM();
        }
        float f9 = f4;
        if ((i2 & 16) != 0) {
            f5 = ElevatedButtonTokens.INSTANCE.m5164getDisabledContainerElevationD9Ej5fM();
        }
        float f10 = f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:1515)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return buttonElevation;
    }

    /* renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m2596filledTonalButtonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 5982871, "C(filledTonalButtonElevation)N(defaultElevation:c#ui.unit.Dp,pressedElevation:c#ui.unit.Dp,focusedElevation:c#ui.unit.Dp,hoveredElevation:c#ui.unit.Dp,disabledElevation:c#ui.unit.Dp):Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = FilledTonalButtonTokens.INSTANCE.m5263getContainerElevationD9Ej5fM();
        }
        float f6 = f;
        if ((i2 & 2) != 0) {
            f2 = FilledTonalButtonTokens.INSTANCE.m5269getPressedContainerElevationD9Ej5fM();
        }
        float f7 = f2;
        if ((i2 & 4) != 0) {
            f3 = FilledTonalButtonTokens.INSTANCE.m5266getFocusContainerElevationD9Ej5fM();
        }
        float f8 = f3;
        if ((i2 & 8) != 0) {
            f4 = FilledTonalButtonTokens.INSTANCE.m5267getHoverContainerElevationD9Ej5fM();
        }
        float f9 = f4;
        if ((i2 & 16) != 0) {
            f5 = Dp.m9732constructorimpl(0);
        }
        float f10 = f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:1545)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return buttonElevation;
    }

    @Deprecated(message = "Please use the version that takes an `enabled` param to get the `BorderStroke` with the correct opacity", replaceWith = @ReplaceWith(expression = "outlinedButtonBorder(enabled)", imports = {}))
    public final BorderStroke getOutlinedButtonBorder(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -563957672, "C(<get-outlinedButtonBorder>)1565@74308L5:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:1563)");
        }
        BorderStroke m388BorderStrokecXLIe8U = BorderStrokeKt.m388BorderStrokecXLIe8U(ButtonSmallTokens.INSTANCE.m4991getOutlinedOutlineWidthD9Ej5fM(), ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m388BorderStrokecXLIe8U;
    }

    public final BorderStroke outlinedButtonBorder(boolean z, Composer composer, int i, int i2) {
        long m6785copywmQWz5c$default;
        ComposerKt.sourceInformationMarkerStart(composer, -626854767, "C(outlinedButtonBorder)N(enabled):Button.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-626854767, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:1575)");
        }
        float m4991getOutlinedOutlineWidthD9Ej5fM = ButtonSmallTokens.INSTANCE.m4991getOutlinedOutlineWidthD9Ej5fM();
        if (z) {
            composer.startReplaceGroup(-112362814);
            ComposerKt.sourceInformation(composer, "1579@74738L5");
            m6785copywmQWz5c$default = ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-112275208);
            ComposerKt.sourceInformation(composer, "1581@74823L5");
            m6785copywmQWz5c$default = Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer, 6), OutlinedButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
        }
        BorderStroke m388BorderStrokecXLIe8U = BorderStrokeKt.m388BorderStrokecXLIe8U(m4991getOutlinedOutlineWidthD9Ej5fM, m6785copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m388BorderStrokecXLIe8U;
    }

    /* renamed from: shapesFor-8Feqmps, reason: not valid java name */
    public final ButtonShapes m2617shapesFor8Feqmps(float f, Composer composer, int i) {
        Composer composer2;
        ButtonShapes shapes;
        ComposerKt.sourceInformationMarkerStart(composer, 1262605294, "C(shapesFor)N(buttonHeight:c#ui.unit.Dp):Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1262605294, i, -1, "androidx.compose.material3.ButtonDefaults.shapesFor (Button.kt:1594)");
        }
        float f2 = ExtraSmallContainerHeight;
        float f3 = MinHeight;
        float f4 = MediumContainerHeight;
        float f5 = LargeContainerHeight;
        float f6 = ExtraLargeContainerHeight;
        float f7 = 2;
        if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(f2 + f3) / f7)) <= 0) {
            composer.startReplaceGroup(-2112044758);
            ComposerKt.sourceInformation(composer, "1602@75567L5,1602@75589L22,1602@75552L60");
            int i2 = (i >> 3) & 14;
            composer2 = composer;
            shapes = shapes(getShape(composer, i2), getExtraSmallPressedShape(composer, i2), composer2, (i << 3) & 896, 0);
            composer.endReplaceGroup();
        } else if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(f3 + f4) / f7)) <= 0) {
            composer.startReplaceGroup(-2112040810);
            ComposerKt.sourceInformation(composer, "1603@75677L8");
            shapes = shapes(composer, (i >> 3) & 14);
            composer.endReplaceGroup();
            composer2 = composer;
        } else if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(f4 + f5) / f7)) <= 0) {
            composer.startReplaceGroup(-2112037914);
            ComposerKt.sourceInformation(composer, "1605@75781L5,1605@75803L18,1605@75766L56");
            int i3 = (i >> 3) & 14;
            composer2 = composer;
            shapes = shapes(getShape(composer, i3), getMediumPressedShape(composer, i3), composer2, (i << 3) & 896, 0);
            composer.endReplaceGroup();
        } else if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(f5 + f6) / f7)) <= 0) {
            composer.startReplaceGroup(-2112033531);
            ComposerKt.sourceInformation(composer, "1607@75918L5,1607@75940L17,1607@75903L55");
            int i4 = (i >> 3) & 14;
            composer2 = composer;
            shapes = shapes(getShape(composer, i4), getLargePressedShape(composer, i4), composer2, (i << 3) & 896, 0);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(-2112031094);
            ComposerKt.sourceInformation(composer2, "1608@75994L5,1608@76016L22,1608@75979L60");
            int i5 = (i >> 3) & 14;
            shapes = shapes(getShape(composer2, i5), getExtraLargePressedShape(composer2, i5), composer2, (i << 3) & 896, 0);
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        return shapes;
    }

    /* renamed from: contentPaddingFor-8Feqmps$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2575contentPaddingFor8Feqmps$default(ButtonDefaults buttonDefaults, float f, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return buttonDefaults.m2592contentPaddingFor8Feqmps(f, z, z2);
    }

    /* renamed from: contentPaddingFor-8Feqmps, reason: not valid java name */
    public final PaddingValues m2592contentPaddingFor8Feqmps(float buttonHeight, boolean hasStartIcon, boolean hasEndIcon) {
        return Dp.m9731compareTo0680j_4(buttonHeight, MinHeight) < 0 ? getExtraSmallContentPadding() : Dp.m9731compareTo0680j_4(buttonHeight, MediumContainerHeight) < 0 ? getSmallContentPadding(hasStartIcon, hasEndIcon) : Dp.m9731compareTo0680j_4(buttonHeight, LargeContainerHeight) < 0 ? getMediumContentPadding(hasStartIcon, hasEndIcon) : Dp.m9731compareTo0680j_4(buttonHeight, ExtraLargeContainerHeight) < 0 ? getLargeContentPadding(hasStartIcon, hasEndIcon) : getExtraLargeContentPadding();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of function with hasLeadingIcon and hasTrailingIcon params")
    /* renamed from: contentPaddingFor-0680j_4, reason: not valid java name */
    public final /* synthetic */ PaddingValues m2591contentPaddingFor0680j_4(float buttonHeight) {
        return Dp.m9731compareTo0680j_4(buttonHeight, MinHeight) < 0 ? getExtraSmallContentPadding() : Dp.m9731compareTo0680j_4(buttonHeight, MediumContainerHeight) < 0 ? getSmallContentPadding() : Dp.m9731compareTo0680j_4(buttonHeight, LargeContainerHeight) < 0 ? getMediumContentPadding() : Dp.m9731compareTo0680j_4(buttonHeight, ExtraLargeContainerHeight) < 0 ? getLargeContentPadding() : getExtraLargeContentPadding();
    }

    /* renamed from: iconSizeFor-5rwHm24, reason: not valid java name */
    public final float m2614iconSizeFor5rwHm24(float buttonHeight) {
        return Dp.m9731compareTo0680j_4(buttonHeight, MinHeight) < 0 ? ExtraSmallIconSize : Dp.m9731compareTo0680j_4(buttonHeight, MediumContainerHeight) < 0 ? SmallIconSize : Dp.m9731compareTo0680j_4(buttonHeight, LargeContainerHeight) < 0 ? MediumIconSize : Dp.m9731compareTo0680j_4(buttonHeight, ExtraLargeContainerHeight) < 0 ? LargeIconSize : ExtraLargeIconSize;
    }

    /* renamed from: iconSpacingFor-5rwHm24, reason: not valid java name */
    public final float m2615iconSpacingFor5rwHm24(float buttonHeight) {
        return Dp.m9731compareTo0680j_4(buttonHeight, MinHeight) < 0 ? ExtraSmallIconSpacing : Dp.m9731compareTo0680j_4(buttonHeight, MediumContainerHeight) < 0 ? IconSpacing : Dp.m9731compareTo0680j_4(buttonHeight, LargeContainerHeight) < 0 ? MediumIconSpacing : Dp.m9731compareTo0680j_4(buttonHeight, ExtraLargeContainerHeight) < 0 ? LargeIconSpacing : ExtraLargeIconSpacing;
    }

    /* renamed from: textStyleFor-8Feqmps, reason: not valid java name */
    public final TextStyle m2619textStyleFor8Feqmps(float f, Composer composer, int i) {
        TextStyle headlineLarge;
        ComposerKt.sourceInformationMarkerStart(composer, -2034166092, "C(textStyleFor)N(buttonHeight:c#ui.unit.Dp):Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2034166092, i, -1, "androidx.compose.material3.ButtonDefaults.textStyleFor (Button.kt:1709)");
        }
        float f2 = MediumContainerHeight;
        float f3 = LargeContainerHeight;
        float f4 = ExtraLargeContainerHeight;
        if (Dp.m9731compareTo0680j_4(f, f2) < 0) {
            composer.startReplaceGroup(-623485538);
            ComposerKt.sourceInformation(composer, "1714@80008L10");
            headlineLarge = MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge();
            composer.endReplaceGroup();
        } else if (Dp.m9731compareTo0680j_4(f, f3) < 0) {
            composer.startReplaceGroup(-623483087);
            ComposerKt.sourceInformation(composer, "");
            if (PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
                composer.startReplaceGroup(2146908215);
                ComposerKt.sourceInformation(composer, "1717@80176L10");
                headlineLarge = TextStyle.m9154copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, 6).getTitleMedium(), 0L, TextUnitKt.getSp(15), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(22), null, null, null, 0, 0, null, 16646141, null);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2147030882);
                ComposerKt.sourceInformation(composer, "1719@80301L10");
                headlineLarge = MaterialTheme.INSTANCE.getTypography(composer, 6).getTitleMedium();
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else if (Dp.m9731compareTo0680j_4(f, f4) < 0) {
            composer.startReplaceGroup(-623472996);
            ComposerKt.sourceInformation(composer, "");
            if (PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
                composer.startReplaceGroup(2147220974);
                ComposerKt.sourceInformation(composer, "1723@80489L10");
                headlineLarge = TextStyle.m9154copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, 6).getHeadlineSmall(), 0L, TextUnitKt.getSp(18), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(26), null, null, null, 0, 0, null, 16646141, null);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2147413856);
                ComposerKt.sourceInformation(composer, "1728@80687L10");
                headlineLarge = MaterialTheme.INSTANCE.getTypography(composer, 6).getHeadlineSmall();
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-623461343);
            ComposerKt.sourceInformation(composer, "1730@80764L10");
            headlineLarge = MaterialTheme.INSTANCE.getTypography(composer, 6).getHeadlineLarge();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return headlineLarge;
    }

    public final PaddingValues getExtraSmallContentPadding() {
        float f = 12;
        float f2 = 6;
        return PaddingKt.m1197PaddingValuesa9UjIt4(Dp.m9732constructorimpl(f), Dp.m9732constructorimpl(f2), Dp.m9732constructorimpl(f), Dp.m9732constructorimpl(f2));
    }
}
