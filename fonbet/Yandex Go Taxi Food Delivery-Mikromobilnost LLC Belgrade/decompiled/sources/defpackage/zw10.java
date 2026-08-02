package defpackage;

import java.io.Closeable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageFormatException;
import org.msgpack.core.MessageInsufficientBufferException;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessageNeverUsedFormatException;
import org.msgpack.core.MessagePackException;
import org.msgpack.core.MessageSizeException;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.MessageTypeException;
import org.msgpack.core.buffer.MessageBuffer;

/* loaded from: classes4.dex */
public final class zw10 implements Closeable {
    public static final MessageBuffer H = MessageBuffer.g(0, 0, new byte[0]);
    public int A;
    public long B;
    public int D;
    public StringBuilder E;
    public CharsetDecoder F;
    public CharBuffer G;
    public final boolean a;
    public final CodingErrorAction b;
    public final CodingErrorAction c;
    public final int w;
    public final int x;
    public final q43 y;
    public MessageBuffer z = H;
    public final MessageBuffer C = MessageBuffer.a(8);

    public zw10(q43 q43Var, bv10 bv10Var) {
        this.y = q43Var;
        bv10Var.getClass();
        this.a = bv10Var.b;
        this.b = bv10Var.c;
        this.c = bv10Var.w;
        this.w = bv10Var.x;
        this.x = bv10Var.z;
    }

    public static MessageIntegerOverflowException e(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf((i & Integer.MAX_VALUE) + 2147483648L));
    }

    public static MessageIntegerOverflowException k(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63));
    }

    public static MessagePackException v(byte b, String str) {
        MessageFormat b2 = MessageFormat.b(b);
        if (b2 == MessageFormat.NEVER_USED) {
            return new MessageNeverUsedFormatException(oyr.p("Expected ", str, ", but encountered 0xC1 \"NEVER_USED\" byte"));
        }
        String name = b2.a().name();
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, name.substring(0, 1) + name.substring(1).toLowerCase(), Byte.valueOf(b)));
    }

    public final int B() {
        byte readByte = readByte();
        if (zu10.a(readByte)) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & 65535;
            case -50:
                int readInt = readInt();
                if (readInt >= 0) {
                    return readInt;
                }
                throw e(readInt);
            case -49:
                long readLong = readLong();
                if (readLong < 0 || readLong > 2147483647L) {
                    throw k(readLong);
                }
                return (int) readLong;
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long readLong2 = readLong();
                if (readLong2 < -2147483648L || readLong2 > 2147483647L) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong2));
                }
                return (int) readLong2;
            default:
                throw v(readByte, "Integer");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x017f, code lost:
    
        return r8.E.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String D() {
        int readByte;
        int readByte2;
        int i;
        byte readByte3 = readByte();
        if ((readByte3 & (-32)) == -96) {
            i = readByte3 & 31;
        } else {
            switch (readByte3) {
                case -39:
                    readByte = readByte() & 255;
                    break;
                case -38:
                    readByte = readShort() & 65535;
                    break;
                case -37:
                    readByte = o();
                    break;
                default:
                    readByte = -1;
                    break;
            }
            if (readByte < 0) {
                if (this.a) {
                    switch (readByte3) {
                        case -60:
                            readByte2 = readByte() & 255;
                            break;
                        case -59:
                            readByte2 = 65535 & readShort();
                            break;
                        case -58:
                            readByte2 = o();
                            break;
                        default:
                            readByte2 = -1;
                            break;
                    }
                    if (readByte2 >= 0) {
                        i = readByte2;
                    }
                }
                throw v(readByte3, "String");
            }
            i = readByte;
        }
        if (i == 0) {
            return "";
        }
        int i2 = this.w;
        if (i > i2) {
            throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(i2), Integer.valueOf(i)), i);
        }
        CharsetDecoder charsetDecoder = this.F;
        if (charsetDecoder == null) {
            this.G = CharBuffer.allocate(this.x);
            this.F = cv10.a.newDecoder().onMalformedInput(this.b).onUnmappableCharacter(this.c);
        } else {
            charsetDecoder.reset();
        }
        StringBuilder sb = this.E;
        if (sb == null) {
            this.E = new StringBuilder();
        } else {
            sb.setLength(0);
        }
        if (this.z.c - this.A >= i) {
            return a(i);
        }
        while (true) {
            if (i > 0) {
                try {
                    MessageBuffer messageBuffer = this.z;
                    int i3 = messageBuffer.c;
                    int i4 = this.A;
                    int i5 = i3 - i4;
                    if (i5 >= i) {
                        this.E.append(a(i));
                    } else if (i5 == 0) {
                        d();
                    } else {
                        ByteBuffer m = messageBuffer.m(i4, i5);
                        int position = m.position();
                        this.G.clear();
                        CoderResult decode = this.F.decode(m, this.G, false);
                        int position2 = m.position() - position;
                        this.A += position2;
                        i -= position2;
                        this.E.append(this.G.flip());
                        if (decode.isError()) {
                            c(decode);
                        }
                        if (decode.isUnderflow() && position2 < i5) {
                            ByteBuffer allocate = ByteBuffer.allocate(Integer.numberOfLeadingZeros((~(this.z.b(this.A) & 255)) << 24));
                            MessageBuffer messageBuffer2 = this.z;
                            int i6 = this.A;
                            messageBuffer2.c(i6, messageBuffer2.c - i6, allocate);
                            while (true) {
                                d();
                                int remaining = allocate.remaining();
                                MessageBuffer messageBuffer3 = this.z;
                                int i7 = messageBuffer3.c;
                                if (i7 >= remaining) {
                                    messageBuffer3.c(0, remaining, allocate);
                                    this.A = remaining;
                                    allocate.position(0);
                                    this.G.clear();
                                    CoderResult decode2 = this.F.decode(allocate, this.G, false);
                                    if (decode2.isError()) {
                                        c(decode2);
                                    }
                                    if (decode2.isOverflow() || (decode2.isUnderflow() && allocate.position() < allocate.limit())) {
                                        try {
                                            decode2.throwException();
                                            throw new MessageFormatException("Unexpected UTF-8 multibyte sequence");
                                        } catch (Exception e) {
                                            throw new MessageFormatException("Unexpected UTF-8 multibyte sequence", e);
                                        }
                                    }
                                    i -= allocate.limit();
                                    this.E.append(this.G.flip());
                                } else {
                                    messageBuffer3.c(0, i7, allocate);
                                    this.A = this.z.c;
                                }
                            }
                        }
                    }
                } catch (CharacterCodingException e2) {
                    throw new MessageStringCodingException(e2);
                }
            }
        }
    }

    public final String a(int i) {
        MessageBuffer messageBuffer;
        Object obj;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        if (this.b == codingErrorAction && this.c == codingErrorAction && (obj = (messageBuffer = this.z).a) != null) {
            String str = new String((byte[]) obj, (((int) messageBuffer.b) - MessageBuffer.h) + this.A, i, cv10.a);
            this.A += i;
            return str;
        }
        try {
            CharBuffer decode = this.F.decode(this.z.m(this.A, i));
            this.A += i;
            return decode.toString();
        } catch (CharacterCodingException e) {
            throw new MessageStringCodingException(e);
        }
    }

    public final void c(CoderResult coderResult) {
        if ((coderResult.isMalformed() && this.b == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.c == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.z = H;
        this.A = 0;
        this.y.close();
    }

    public final void d() {
        MessageBuffer messageBuffer;
        q43 q43Var = this.y;
        if (q43Var.b) {
            messageBuffer = null;
        } else {
            q43Var.b = true;
            messageBuffer = (MessageBuffer) q43Var.c;
        }
        if (messageBuffer == null) {
            throw new MessageInsufficientBufferException();
        }
        this.B += this.z.c;
        this.z = messageBuffer;
        this.A = 0;
    }

    public final MessageBuffer n(int i) {
        MessageBuffer messageBuffer = this.z;
        int i2 = messageBuffer.c;
        int i3 = this.A;
        int i4 = i2 - i3;
        if (i4 >= i) {
            this.D = i3;
            this.A = i3 + i;
            return messageBuffer;
        }
        MessageBuffer messageBuffer2 = this.C;
        if (i4 > 0) {
            messageBuffer2.k(0, messageBuffer, i3, i4);
            i -= i4;
        } else {
            i4 = 0;
        }
        while (true) {
            d();
            MessageBuffer messageBuffer3 = this.z;
            int i5 = messageBuffer3.c;
            if (i5 >= i) {
                messageBuffer2.k(i4, messageBuffer3, 0, i);
                this.A = i;
                this.D = 0;
                return messageBuffer2;
            }
            messageBuffer2.k(i4, messageBuffer3, 0, i5);
            i -= i5;
            i4 += i5;
        }
    }

    public final int o() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new MessageSizeException((readInt & Integer.MAX_VALUE) + 2147483648L);
    }

    public final byte readByte() {
        MessageBuffer messageBuffer = this.z;
        int i = messageBuffer.c;
        int i2 = this.A;
        if (i > i2) {
            byte b = messageBuffer.b(i2);
            this.A++;
            return b;
        }
        d();
        MessageBuffer messageBuffer2 = this.z;
        if (messageBuffer2.c <= 0) {
            return readByte();
        }
        byte b2 = messageBuffer2.b(0);
        this.A = 1;
        return b2;
    }

    public final int readInt() {
        return n(4).d(this.D);
    }

    public final long readLong() {
        return n(8).e(this.D);
    }

    public final short readShort() {
        return n(2).f(this.D);
    }

    public final void w() {
        byte readByte = readByte();
        if ((readByte & (-16)) == -112) {
            return;
        }
        if (readByte == -36) {
            readShort();
        } else {
            if (readByte != -35) {
                throw v(readByte, "Array");
            }
            o();
        }
    }
}
