package androidx.media3.extractor.metadata.icy;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class IcyDecoder extends SimpleMetadataDecoder {
    public static final Pattern METADATA_ELEMENT = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder utf8Decoder = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder iso88591Decoder = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    public final Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.iso88591Decoder;
        CharsetDecoder charsetDecoder2 = this.utf8Decoder;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new Metadata(new IcyInfo(null, null, bArr));
        }
        Matcher matcher = METADATA_ELEMENT.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String lowerCase = Ascii.toLowerCase(group);
                lowerCase.getClass();
                if (lowerCase.equals("streamurl")) {
                    str3 = group2;
                } else if (lowerCase.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(str2, str3, bArr));
    }
}
