package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import com.google.common.collect.ImmutableList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class GaplessInfoHolder {
    public static final Pattern GAPLESS_COMMENT_PATTERN = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int encoderDelay = -1;
    public int encoderPadding = -1;

    public final boolean setFromComment(String str) {
        Matcher matcher = GAPLESS_COMMENT_PATTERN.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = Util.DEVICE_DEBUG_INFO;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.encoderDelay = parseInt;
            this.encoderPadding = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if ((r7.domain.equals("com.apple.iTunes") && r7.description.equals("iTunSMPB")) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setFromMetadata(Metadata metadata) {
        Metadata.Entry entry;
        metadata.getClass();
        ImmutableList.Builder builder = ImmutableList.builder();
        Metadata.Entry[] entryArr = metadata.entries;
        int length = entryArr.length;
        int i = 0;
        while (true) {
            Metadata.Entry entry2 = null;
            if (i >= length) {
                break;
            }
            Metadata.Entry entry3 = entryArr[i];
            if (CommentFrame.class.isAssignableFrom(entry3.getClass())) {
                Metadata.Entry entry4 = (Metadata.Entry) CommentFrame.class.cast(entry3);
                if (((CommentFrame) entry4).description.equals("iTunSMPB")) {
                    entry2 = entry4;
                }
            }
            if (entry2 != null) {
                builder.m2032add((Object) entry2);
            }
            i++;
        }
        ImmutableList.Itr listIterator = builder.build().listIterator(0);
        while (listIterator.hasNext()) {
            if (setFromComment(((CommentFrame) listIterator.next()).text)) {
                return;
            }
        }
        ImmutableList.Builder builder2 = ImmutableList.builder();
        for (Metadata.Entry entry5 : entryArr) {
            if (InternalFrame.class.isAssignableFrom(entry5.getClass())) {
                entry = (Metadata.Entry) InternalFrame.class.cast(entry5);
                InternalFrame internalFrame = (InternalFrame) entry;
            }
            entry = null;
            if (entry != null) {
                builder2.m2032add((Object) entry);
            }
        }
        ImmutableList.Itr listIterator2 = builder2.build().listIterator(0);
        while (listIterator2.hasNext() && !setFromComment(((InternalFrame) listIterator2.next()).text)) {
        }
    }
}
